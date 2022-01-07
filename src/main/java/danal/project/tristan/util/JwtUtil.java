package danal.project.tristan.util;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component
@Service
public class JwtUtil {

	private static final Logger logger = LoggerFactory.getLogger(Jwts.class);
	public static final long JWT_TOKEN_VALIDITY = 120000;

	@Value("${jwt.secret}")
	private String secret;

	public String getUsernameFromToken(String token) {
		// TODO Auto-generated method stub
		return getClaimFromToken(token, Claims::getSubject);
	}

	public Date getExpirationDateFromToken(String token) {
		return getClaimFromToken(token, Claims::getExpiration);
	}

	private <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = getAllClaimsFromToken(token);
		return claimsResolver.apply(claims);
	}

	private Claims getAllClaimsFromToken(String token) {
		// TODO Auto-generated method stub
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
	}

	public boolean isTokenExprired(String token) {
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}

	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<>();
		return doGenerateToken(claims, userDetails.getUsername());
	}

	private String doGenerateToken(Map<String, Object> claims, String subject) {
		// TODO Auto-generated method stub

		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
				.signWith(SignatureAlgorithm.HS512, secret).compact();

	}

	public String getJwtTokenFromRequest(HttpServletRequest request) {
		String header = request.getHeader("Authorization");

		if (StringUtils.hasText(header) && header.startsWith("Bearer"))
			return header.substring("Bearer".length(), header.length());

		return null;
	}

//	public boolean validateToken(String jwtToken, UserDetails userDetails) {
//		final String username = getUsernameFromToken(jwtToken);
//		return (username.equals(userDetails.getUsername()) && !isTokenExprired(jwtToken));
//	}
	public boolean validateJwtToken(String token) {
		try {
			Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
			return true;
		} catch (SignatureException e1) {
			logger.error("Invalid JWT Signature: {}", e1.getMessage());
		} catch (ExpiredJwtException e2) {
			logger.error("JWT token is expired: {}", e2.getMessage());
		} catch (MalformedJwtException e3) {
			logger.error("Invalid JWT Token: {}", e3.getMessage());
		} catch (IllegalArgumentException e4) {
			logger.error("JWT claims string is empty: {}", e4.getMessage());
		} catch (UnsupportedJwtException e5) {
			logger.error("JWT Token is not support: {}", e5.getMessage());
		}

		return false;
	}
}

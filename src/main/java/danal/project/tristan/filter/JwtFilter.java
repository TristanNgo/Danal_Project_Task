package danal.project.tristan.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import danal.project.tristan.service.AdminDetailService;
import danal.project.tristan.util.JwtUtil;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;

@Component
public class JwtFilter extends OncePerRequestFilter {

	private static final Logger logger = LoggerFactory.getLogger(Jwts.class);
	
	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AdminDetailService adminDetailService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
//		final String requestTokenHeader = request.getHeader("Authorization");

//		String fAdminId = null;
//		String token = null;
//
//		if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer")) {
//			token = requestTokenHeader.substring(7);
//			try {
//				fAdminId = jwtUtil.getUsernameFromToken(token);
//			} catch (IllegalArgumentException e) {
//				System.out.println("Unable to get JWT Token");
//			} catch (ExpiredJwtException e) {
//				System.out.println("JWT Token has expired");
//			}
//		} else {
//			logger.warn("JWT Token does not begin with Bearer String");
//		}
//		if (fAdminId != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//			UserDetails userDetail = this.adminDetailService.loadUserByUsername(fAdminId);
//
//			if (jwtUtil.validateToken(token, userDetail)) {
//				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
//						userDetail, null, userDetail.getAuthorities());
//				
//				usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//			}
//		}
		try {
			String token1 = jwtUtil.getJwtTokenFromRequest(request);
			
			if(token1 != null && jwtUtil.validateJwtToken(token1)) {
				String username = jwtUtil.getUsernameFromToken(token1);
				
				// authorize
				
				UserDetails userDetails = adminDetailService.loadUserByUsername(username);
				Authentication auth = new UsernamePasswordAuthenticationToken(username, null, userDetails.getAuthorities());
				
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
		} catch (Exception e) {
			logger.debug("An unathorized request has been sent from {}.", request.getRemoteAddr());
		}
		filterChain.doFilter(request, response);

	}

}

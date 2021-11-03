package danal.project.tristan.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import danal.project.tristan.dto.AdminDto;
import danal.project.tristan.mapper.AdminsMapper;
import danal.project.tristan.model.Admins;
import danal.project.tristan.model.AdminsExample;
import danal.project.tristan.model.JwtResponse;
import danal.project.tristan.service.AdminDetailService;
import danal.project.tristan.service.AdminServiceImpl;
import danal.project.tristan.util.JwtUtil;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {


	@Autowired
	private AdminsMapper adminsMapper;
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private AdminServiceImpl adminService;
	
	@Autowired
	private AdminDetailService adminDetailService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@GetMapping("/all")
	public List<Admins> getAll(){	
		AdminsExample adminsExample = new AdminsExample();
		 return adminsMapper.selectByExample(adminsExample);
	}
	
	@PutMapping("/update/{username}")
	public ResponseEntity<Admins> update(@RequestBody AdminDto adminDto, @PathVariable String username) {
		try {
			adminDto.setfAdminId(username);
			adminService.updateAdminProfile(adminDto);
			return new ResponseEntity<Admins>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<Admins>(HttpStatus.NOT_FOUND);
		}
		
	}
	@GetMapping("/find/{username}")
	public Admins findByFAdminId(@PathVariable String username) {
		return adminsMapper.selectByPrimaryKey(username);	
		}
	
	@PostMapping(value = "/login")
	public ResponseEntity<?> login(@RequestBody Admins admin)  {

		try {
			authenticate(admin.getfAdminId(), admin.getfAdminPw());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final UserDetails userDetails = adminDetailService.loadUserByUsername(admin.getfAdminId());

		final String jwt = jwtUtil.generateToken(userDetails);
		return ResponseEntity.ok(new JwtResponse(jwt));

	}
	

	private void authenticate(String username, String password) throws Exception {
		
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}

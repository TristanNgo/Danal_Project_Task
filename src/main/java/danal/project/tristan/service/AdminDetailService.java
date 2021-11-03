package danal.project.tristan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import danal.project.tristan.mapper.AdminsMapper;
import danal.project.tristan.model.Admins;
import danal.project.tristan.model.AdminsExample;

@Service
public class AdminDetailService implements UserDetailsService {

	@Autowired
	private AdminsMapper adminMapper;
	
	@Override
	public UserDetails loadUserByUsername(String adminId) throws UsernameNotFoundException {
		
		
		
		AdminsExample adminExample = new AdminsExample();
		adminExample.createCriteria().andFAdminIdEqualTo(adminId);
		List<Admins> listAdmins= adminMapper.selectByExample(adminExample);
		if(listAdmins.size() > 0) {
			Admins admin = listAdmins.get(0);
			List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
			
			GrantedAuthority authority = new SimpleGrantedAuthority("Admin");
			grantList.add(authority);
			
			
			UserDetails userDetail = new User(adminId,admin.getfAdminPw(), grantList);
			return userDetail;
		}else {
			new UsernameNotFoundException("AdminId not found, login failed");
		}
		return null;
		
		
	}

}

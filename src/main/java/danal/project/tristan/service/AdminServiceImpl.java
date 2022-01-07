package danal.project.tristan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import danal.project.tristan.dto.AdminDto;
import danal.project.tristan.mapper.AdminsMapper;
import danal.project.tristan.model.Admins;
import danal.project.tristan.model.AdminsExample;
import danal.project.tristan.repository.AdminRepository;
import danal.project.tristan.repository.AdminRepositoryImple;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepositoryImple adminRepo;
	
	@Autowired
	private AdminsMapper adminMapper;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	
	
	@Override
	public List<Admins> findAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepo.findAllAdmins();
	}
	
	public int updateAdminProfile(AdminDto admin) {
		Admins oldAdmin = new Admins();
		if(admin.getfAdminId() != null) {
			oldAdmin = adminMapper.selectByPrimaryKey(admin.getfAdminId());
		}
		oldAdmin.setfAdminId(admin.getfAdminId());
		oldAdmin.setfAdminPw(bcryptEncoder.encode(admin.getfAdminPw()));
		oldAdmin.setfName(admin.getfName());
		
		oldAdmin.setfStatus(admin.getfLevel());
		oldAdmin.setfRegDt(admin.getfRegDt());
		
		return adminMapper.updateByPrimaryKey(oldAdmin);
	}
		
//	}
//	public Admins findByFAdminId(String username) {
//		return adminMapper.selectByPrimaryKey(username);
//	}

	

}

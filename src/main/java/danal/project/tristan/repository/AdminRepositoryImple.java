package danal.project.tristan.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import danal.project.tristan.mapper.AdminsMapper;
import danal.project.tristan.model.Admins;
import danal.project.tristan.model.AdminsExample;

@Repository
public class AdminRepositoryImple implements AdminRepository {

	@Autowired
	private AdminsMapper adminMapper;
	@Autowired
	private AdminsExample adminExample;
	@Override
	public List<Admins> findAllAdmins() {
		
		return adminMapper.countByExample(adminExample);
	}

}

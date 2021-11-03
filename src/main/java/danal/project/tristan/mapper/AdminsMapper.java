package danal.project.tristan.mapper;

import danal.project.tristan.model.Admins;
import danal.project.tristan.model.AdminsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminsMapper {
	
	List<Admins> findAllAdmins();
	
	List<Admins> selectByExample(AdminsExample example);
    
	List<Admins> countByExample(AdminsExample example);
	
	Admins selectByPrimaryKey(String fAdminId);
	
	int updateByPrimaryKey(Admins record);
//
//   
//    int deleteByExample(AdminsExample example);
//
//   
//    int deleteByPrimaryKey(String fAdminId);
//
//    
//    int insert(Admins record);
//
//    
//    int insertSelective(Admins record);
//
//    
    
        
//
//    
//    int updateByExampleSelective(@Param("record") Admins record, @Param("example") AdminsExample example);
//
//   
//    int updateByExample(@Param("record") Admins record, @Param("example") AdminsExample example);
//
//    
//    int updateByPrimaryKeySelective(Admins record);
//
//    
   
    
    
    
    
}
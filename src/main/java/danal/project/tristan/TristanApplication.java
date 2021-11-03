package danal.project.tristan;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import danal.project.tristan.model.Admins;

@MappedTypes(Admins.class)
@MapperScan("danal.project.tristan")
@SpringBootApplication
public class TristanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TristanApplication.class, args);
	}

}

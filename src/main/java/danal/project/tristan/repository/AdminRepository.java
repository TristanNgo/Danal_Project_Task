package danal.project.tristan.repository;

import java.util.List;

import danal.project.tristan.model.Admins;

public interface AdminRepository {

	List<Admins> findAllAdmins();
}

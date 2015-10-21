package mum.waa.sms.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mum.waa.sms.model.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

	@Query("select s from Student s where s.studentId=:studentId")
	public Student findByName(@Param("studentId") int studentId);

	@Modifying
	@Query("update Student u set u.firstName=:firstName,u.lastName=:lastName,u.gender=:gender,u.email=:email,u.dob=:dob,u.phoneNumber=:phoneNumber,u.entry=:entry where u.studentId=:studentId")
	public void updateStudent(@Param("studentId") int studentId, @Param("firstName") String firstName,
			@Param("lastName") String lastName, @Param("gender") String gender, @Param("email") String email,
			@Param("dob") Date dob, @Param("phoneNumber") long phoneNumber, @Param("entry") String entry);

}

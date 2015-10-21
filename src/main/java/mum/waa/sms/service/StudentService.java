package mum.waa.sms.service;

import java.util.List;

import mum.waa.sms.model.Student;

public interface StudentService {

	public void saveStudent(Student student);

	public List<String> getCourseEntry(String entry);

	public Student getStudentById(int id);
	
	public void updateStudent(Student student);

}

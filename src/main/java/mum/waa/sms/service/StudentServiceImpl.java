package mum.waa.sms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.waa.sms.model.Student;
import mum.waa.sms.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentrepository;

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void saveStudent(Student student) {
		studentrepository.save(student);

	}

	public List<String> getCourseEntry(String entry) {
		List<String> list = new ArrayList<String>();
		list.add("WAA");
		list.add("WAP");
		list.add("MPP");
		return list;
	}

}

package mum.waa.sms.repository;

import org.springframework.data.repository.CrudRepository;

import mum.waa.sms.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

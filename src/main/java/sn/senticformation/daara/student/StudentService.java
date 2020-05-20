package sn.senticformation.daara.student;

import java.util.List;

public interface StudentService {

	List<Student> findAll();

	Student findById(String identifiant);

	Student save(Student student);
}

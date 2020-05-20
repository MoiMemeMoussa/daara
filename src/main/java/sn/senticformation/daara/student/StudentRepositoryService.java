package sn.senticformation.daara.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentRepositoryService {

	@Autowired
	StudentRepository studentRepository;

	Student save(Student classe) {
		return studentRepository.save(classe);
	}

	Optional<Student> findById(int id) {
		return studentRepository.findById(new Long(id));
}

	List<Student> findAll() {
		return studentRepository.findAll();
	}
}

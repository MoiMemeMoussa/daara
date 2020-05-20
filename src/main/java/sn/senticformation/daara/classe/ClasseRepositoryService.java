package sn.senticformation.daara.classe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ClasseRepositoryService {

	@Autowired
	ClasseRepository classeRepository;

	Classe save(Classe classe) {
		return classeRepository.save(classe);
	}

	Optional<Classe> findById(int id) {
		return classeRepository.findById(new Long(id));
	}

	List<Classe> findAll() {
		return classeRepository.findAll();
	}
}

package sn.senticformation.daara.month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MonthRepositoryService {

	@Autowired
	MonthRepository monthRepository;

	Month save(Month Month) {
		return monthRepository.save(Month);
	}

	Optional<Month> findById(int id) {
		return monthRepository.findById(new Long(id));
	}

	List<Month> findAll() {
		return monthRepository.findAll();
	}
}

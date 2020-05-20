package sn.senticformation.daara.classe;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClasseApi {

	@Autowired
	ClasseRepositoryService classeRepositoryService;

	@ApiOperation(" create classe")
	@RequestMapping(value = "/classes", method = RequestMethod.POST)
	public ResponseEntity<Classe> save(@RequestBody Classe classe) {
		return new ResponseEntity<>(
				classeRepositoryService.save(classe),
				HttpStatus.CREATED);
	}

	@ApiOperation("Find all classes")
	@RequestMapping(value = "/classes", method = RequestMethod.GET)
	public ResponseEntity<List<Classe>> findAll() {
		return new ResponseEntity<>(
				classeRepositoryService.findAll(),
				HttpStatus.OK);
	}

	@ApiOperation("Find classe by id")
	@RequestMapping(value = "/classes/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Classe>> findById(@PathVariable(value = "id") Integer id) {
		if (id == null) {
			return new ResponseEntity<>(
					classeRepositoryService.findById(id),
					HttpStatus.FOUND);
		} else {
			return new ResponseEntity<>(
					classeRepositoryService.findById(id),
					HttpStatus.FOUND);
		}
	}

}

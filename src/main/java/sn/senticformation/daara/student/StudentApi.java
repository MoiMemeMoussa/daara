package sn.senticformation.daara.student;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentApi {

	@Autowired
	StudentRepositoryService studentRepositoryService;

	@ApiOperation("save a student ")
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public ResponseEntity<Student> save(@RequestBody Student student) {
		return new ResponseEntity<>(
				studentRepositoryService.save(student),
				HttpStatus.CREATED);

	}

	@ApiOperation("Find all students")
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> findAll() {
		return new ResponseEntity<>(
				studentRepositoryService.findAll(),
				HttpStatus.OK);
	}

	@ApiOperation("Find student by id")
	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Student>> findById(@PathVariable(value = "id") Integer id) {
		if (id == null) {
			return new ResponseEntity<>(
					studentRepositoryService.findById(id),
					HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(
					studentRepositoryService.findById(id),
					HttpStatus.FOUND);
		}
	}
}

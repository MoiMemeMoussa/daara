package sn.senticformation.daara.payment;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PaymentApi {

	@Autowired
	PaymentRepositoryService PaymentRepositoryService;

	@ApiOperation("save a Payment ")
	@RequestMapping(value = "/Payments", method = RequestMethod.POST)
	public ResponseEntity<Payment> save(@RequestBody Payment Payment) {
		return new ResponseEntity<>(
				PaymentRepositoryService.save(Payment),
				HttpStatus.CREATED);

	}

	@ApiOperation("Find all Payments")
	@RequestMapping(value = "/Payments", method = RequestMethod.GET)
	public ResponseEntity<List<Payment>> findAll() {
		return new ResponseEntity<>(
				PaymentRepositoryService.findAll(),
				HttpStatus.OK);
	}

	@ApiOperation("Find Payment by id")
	@RequestMapping(value = "/Payments/{classe_id}{student_id}{month_id}{year}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Payment>> findById(@PathVariable(value = "classe_id") Integer classe_id,
													  @PathVariable(value = "student_id") Integer student_id,
													  @PathVariable(value = "month_id") Integer month_id,
													  @PathVariable(value = "year") Integer year) {
		PaymentKey paymentKey = new PaymentKey(new Long(classe_id), new Long(student_id), new Long(month_id));
		if (paymentKey == null) {
			return new ResponseEntity<>(
					PaymentRepositoryService.findById(paymentKey),
					HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(
					PaymentRepositoryService.findById(paymentKey),
					HttpStatus.FOUND);
		}
	}
}

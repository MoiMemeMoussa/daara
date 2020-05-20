package sn.senticformation.daara.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PaymentRepositoryService {

	@Autowired
	PaymentRepository paymentRepository;

	Payment save(Payment payment) {
		return paymentRepository.save(payment);
	}

	Optional<Payment> findById(PaymentKey paymentKey) {
		return paymentRepository.findById(paymentKey);
	}

	List<Payment> findAll() {
		return paymentRepository.findAll();
	}
}

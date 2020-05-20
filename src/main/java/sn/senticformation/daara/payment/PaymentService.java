package sn.senticformation.daara.payment;

import sn.senticformation.daara.classestudent.ClasssStudent;
import sn.senticformation.daara.student.Student;
import sn.senticformation.daara.classe.Classe;
import sn.senticformation.daara.month.Month;

import java.util.List;

public interface PaymentService {

	List<Payment> findAll(ClasssStudent classsStudent, int year, Month month);

	Payment findById(Classe classe, Student student, Month month);

	Payment save(Payment payment);
}

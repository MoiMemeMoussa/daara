package sn.senticformation.daara.payment;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name="payment")
@Entity
public class Payment {


	@EmbeddedId
	PaymentKey paymentKey;

	@Column(nullable = false)
	private int mountant;

	@Column(nullable = false, length = 10)
	private Date datePayment;

	@Column(nullable = false, length = 4, unique = true)
	private int year;



}

package sn.senticformation.daara.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentKey implements Serializable {


	@Column
	private Long class_id;


	@Column
	private Long student_id;


	@Column
	private Long month_id;

}

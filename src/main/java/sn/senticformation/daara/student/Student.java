package sn.senticformation.daara.student;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "student")
public class Student {


	@Id
	@Column(length = 9)
	private Long student_id;

	@Column(nullable = false, length = 20)
	private String firstName;

	@Column(nullable = false, length = 20)
	private String lastName;

	@Column(nullable = false, length = 40)
	private String tutor;

	@Column(nullable = false, length = 10)
	private Date birthDate;

	@Column(nullable = false, length = 9)
	private int contact;
}

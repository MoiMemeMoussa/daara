package sn.senticformation.daara.classestudent;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import sn.senticformation.daara.month.Month;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Table(name = "classe_student")
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ClasssStudent implements Serializable {

	@Id
	private int class_id;

	@Id
	private int student_id;

	@Column(nullable = false, length = 10)
	private Date startDate;

	@Column(length = 10)
	private Date endDate;

	@ManyToMany(cascade = {CascadeType.ALL})
	@JsonIgnore
	@JoinTable(
			name = "payment",
			joinColumns = {@JoinColumn(name = "class_id"), @JoinColumn(name = "student_id")},
			inverseJoinColumns = {@JoinColumn(name = "month_id")}
	)
	private Set<Month> monthes = new HashSet<>();


}

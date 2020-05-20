package sn.senticformation.daara.classe;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import sn.senticformation.daara.student.Student;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "classe")
@Entity
public class Classe {

	@Id
	private Long id;

	@Column(nullable = false, unique = true)
	@Enumerated(value = EnumType.STRING)
	private ClassNameEnum name;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JsonIgnore
	@JoinTable(
			name = "classe_student",
			joinColumns = { @JoinColumn(name = "class_id") },
			inverseJoinColumns = { @JoinColumn(name = "student_id") }
	)
	private List<Student> studentList = new ArrayList<>();


}

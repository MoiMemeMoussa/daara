package sn.senticformation.daara.month;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name="monthes")
@Entity
public class Month {


	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long month_id;

	@Column(nullable = false, unique = true,length = 8)
	private String name;
}

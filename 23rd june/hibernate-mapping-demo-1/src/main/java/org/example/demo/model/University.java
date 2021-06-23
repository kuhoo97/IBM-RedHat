package org.example.demo.model;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


@javax.persistence.Entity
@Table(name = "UNIVERSITY")
public class University {

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "UNIVERSITY_ID")
		private long id;
		@Column(name = "NAME")
		private String name;
		@Column(name = "COUNTRY")
		private String country;
		@OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
		private List<Student> students;
		
		
		public void add(Student std)
		{
			if(students==null)
			{
				students=new ArrayList<Student>();
				
			}
			students.add(std);
			std.setUniversity(this);
		}
	}



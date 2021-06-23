
//Student and university many one and one to many bi 

package org.example.demo.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "STUDENT")
public class Student {
	
		@Id
		@GeneratedValue
		@Column(name = "STUDENT_ID")
		private long id;
		@Column(name = "FIRST_NAME")
		private String firstName;
		@Column(name = "LAST_NAME")
		private String lastName;
		@Column(name = "SECTION")
		private String section;
		@ManyToOne(cascade = {
				CascadeType.DETACH,
				CascadeType.MERGE,
				CascadeType.PERSIST,
				CascadeType.REFRESH
		})
		@JoinColumn(name = "UNIVERSITY_ID")
		private University university;
}

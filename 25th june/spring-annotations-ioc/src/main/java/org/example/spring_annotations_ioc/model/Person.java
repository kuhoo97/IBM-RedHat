package org.example.spring_annotations_ioc.model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "thePerson")
//we use use when we want to create a new object everytime
@Scope(value="prototype")
public class Person {

	@Value("101") 
	private Integer personId;
	@Value("Marry")
	private String firstName;
	@Value("Public")
	private String lastName;
	@Value("marry@email.com")
	private String email;
	@Value("${person.team}")
	private String team;
	@Value("${person.country}")
	private String country;
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

package org.example.spring_ioc_java_based.pojo;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class Account {
	
	private Integer id;
	private String accountid;
	private String accountHolderName;
	private double accountBalance;
	
	
	
	
}

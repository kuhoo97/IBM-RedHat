//adding exception because we are calling item service from order-service, so it needs to handle 
//exception here as well
package com.example.demo.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ItemErrorResponseModel {

	private String message;
	private Integer statusCode;
	private Long errprReportingTime;

	
}

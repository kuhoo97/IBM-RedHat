package org.example.spring_jdbc_template;

public class BookNotFoundException extends RuntimeException{



	private static final long serialVersionUID = 4511013358134316272L;

	private String message;
	
public BookNotFoundException(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}



	
	
}

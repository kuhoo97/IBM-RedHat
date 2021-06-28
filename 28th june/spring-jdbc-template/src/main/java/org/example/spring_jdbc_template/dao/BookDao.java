package org.example.spring_jdbc_template.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.example.spring_jdbc_template.model.Book;

public interface BookDao {

	//public Connection getMyConnection() throws SQLException;
	
		public Book createBook(Book book) throws SQLException;
		public List<Book> displayAllBook() throws SQLException;

	
}

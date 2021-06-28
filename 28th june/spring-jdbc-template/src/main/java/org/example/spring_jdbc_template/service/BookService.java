package org.example.spring_jdbc_template.service;

import java.sql.SQLException;
import java.util.List;

import org.example.spring_jdbc_template.model.Book;

public interface BookService {

	public Book createBook(Book book) throws SQLException;
	public List<Book> displayAllBook() throws SQLException;
	
}

package org.example.spring_jdbc_template.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.example.spring_jdbc_template.BookNotFoundException;
import org.example.spring_jdbc_template.dao.BookDao;
import org.example.spring_jdbc_template.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	
	
	private BookDao bookDaoImpl;

	@Autowired
	public BookServiceImpl(BookDao bookDaoImpl) {
		this.bookDaoImpl = bookDaoImpl;
	}
	@Override
	public Book createBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		return bookDaoImpl.createBook(book);
	}

	@Override
	public List<Book> displayAllBook() throws SQLException {
		// TODO Auto-generated method stub
		return bookDaoImpl.displayAllBook();
	}
	@Override
	public List<Book> findBookById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return bookDaoImpl.findBookById(id);
	}
	@Override
	public Book updateBookById(int id) throws BookNotFoundException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		return bookDaoImpl.updateBookById(id);
	}
	@Override
	public void deleteBook(int id) throws BookNotFoundException {
		// TODO Auto-generated method stub
		bookDaoImpl.deleteBook(id);
	}
	
	


}

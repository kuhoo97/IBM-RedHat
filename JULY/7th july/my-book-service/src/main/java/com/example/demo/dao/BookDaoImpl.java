package com.example.demo.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.BookNotFoundException;
import com.example.demo.model.Book;

@Repository
@EnableTransactionManagement
public class BookDaoImpl implements BookDao {

	private EntityManager entityManager;
	
	@Autowired
	public BookDaoImpl(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		entityManager.persist(book);
		return book;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("SELECT B FROM Book B",Book.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public Book getBookById(Integer id) {
		// TODO Auto-generated method stub
		Book book1= entityManager.find(Book.class, id);
		if(book1==null)
		{
			throw new BookNotFoundException("Book of this ID does not exist :(");
		}
		return book1;
	}

	@Override
	public Book getByBookId(String id) {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("SELECT B FROM Book B WHERE B.bookId=:bId",Book.class);
		query.setParameter("bId", id);
		@SuppressWarnings("unchecked")
		List<Book> list=query.getResultList();
		if(list.isEmpty())
		{
			throw new BookNotFoundException("book with the given book_id not found.");
		}
		return list.get(0);
	}

	@Override
	public List<Book> getByBookName(String name) {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("SELECT B FROM Book B WHERE B.bookName=:bName",Book.class);
		query.setParameter("bName", name);
		@SuppressWarnings("unchecked")
		List<Book> list=query.getResultList();
		if(list.isEmpty())
		{
			throw new BookNotFoundException("book with the given book_name not found.");
		}
		return list;
	}

	@Transactional
	@Override
	public Book updateBookByBookId(String bookId, Book book) {
		// TODO Auto-generated method stub
		Book book1=getByBookId(bookId);
		book1.setBookName(book.getBookName());
		book1.setBookPrice(book.getBookPrice());
		entityManager.merge(book1);
		return book1;
	}

	@Override
	@Transactional
	public String deleteByBookId(String bookId) {
		// TODO Auto-generated method stub
		Book book=getByBookId(bookId);
		entityManager.remove(book);
		return "deleted sucessfully";
	}

}

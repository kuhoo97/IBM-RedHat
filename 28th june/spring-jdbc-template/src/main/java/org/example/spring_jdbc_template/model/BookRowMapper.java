package org.example.spring_jdbc_template.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setBookId(rs.getInt(1));
		book.setBookName(rs.getString(2));
		book.setBookPrice(rs.getDouble(3));
		return book;
	}

}

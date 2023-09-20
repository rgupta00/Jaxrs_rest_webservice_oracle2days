package com.bookapp.service;

import java.util.List;

import com.bookapp.dao.Book;
import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImplUsingMap;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	 public BookServiceImpl() {
		bookDao=new BookDaoImplUsingMap();
	}
	@Override
	public List<Book> getAll() {
		return bookDao.getAll();
	}

}

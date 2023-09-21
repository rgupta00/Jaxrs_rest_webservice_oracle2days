package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.Book;
import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImplJdbc;

//amit
//rather then we are creating the object of dao in srevice layer
//we want that object of dao should be "injected" in the service 

//dependency injection
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> getAll() {
		return bookDao.getAll();
	}

	@Override
	public Book getBookById(int bookId) {
		return bookDao.getBookById(bookId);
	}

	@Override
	public Book addBook(Book book) {
		return bookDao.addBook(book);
	}

	@Override
	public Book updateBook(int bookId, Book book) {
		return bookDao.updateBook(bookId, book);
	}

	@Override
	public Book removeBook(int bookId) {
		return bookDao.removeBook(bookId);
	}

}

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

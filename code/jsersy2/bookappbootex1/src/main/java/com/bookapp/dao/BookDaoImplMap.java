package com.bookapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.bookapp.exceptions.BookNotFoundException;
@Repository
@Primary
public class BookDaoImplMap implements BookDao{
	private static Map<Integer, Book> books=new HashMap<Integer, Book>();
	static {
		books.put(1, new Book(1, "ABC123", "head first", "katthy", 500.00));
		books.put(2, new Book(2, "ABU123", "thinking in java", "amit", 400.00));
	}
	
	@Override
	public List<Book> getAll() {
//		if(1==1)
//			throw new RuntimeException("it is some db error");
		System.out.println("impl using Map");
		return new ArrayList<Book>(books.values());
	}

	@Override
	public Book getBookById(int bookId) {
		Book book= books.get(bookId);
		if(book==null)
			throw new BookNotFoundException("book with id "+ bookId +" is not found");
		
		return book;
	}

	@Override
	public Book addBook(Book book) {
		book.setId(books.size()+1);
		books.put(book.getId(), book);
		return book;
	}

	@Override
	public Book updateBook(int bookId, Book book) {
		Book bookToUpdate= getBookById(bookId);
		bookToUpdate.setPrice(book.getPrice());
		books.put(bookId, bookToUpdate);
		
		return bookToUpdate;
	}

	@Override
	public Book removeBook(int bookId) {
		Book bookToRemove=getBookById(bookId);
		books.remove(bookId);
		return bookToRemove;
	}

}

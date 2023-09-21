package com.bookapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.bookapp.exceptions.BookNotFoundException;
@Repository
@Primary
public class BookDaoImplJpa implements BookDao{
	
	@Autowired
	private EntityManager em;
	
	@Override
	public List<Book> getAll() {
		System.out.println("impl using jpa");
		return em.createQuery("select b from Book b",Book.class).getResultList();
	}

	@Override
	public Book getBookById(int bookId) {
		Book book= em.find(Book.class, bookId);
		if(book==null)
			throw new BookNotFoundException("book with id "+ bookId +" is not found");
		
		return book;
	}

	@Override
	public Book addBook(Book book) {
		em.persist(book);
		return book;
	}

	@Override
	public Book updateBook(int bookId, Book book) {
		Book bookToUpdate=getBookById(bookId);
		
		bookToUpdate.setPrice(book.getPrice());
		em.merge(bookToUpdate);
		return bookToUpdate;
	}

	@Override
	public Book removeBook(int bookId) {
		Book bookToRemove=getBookById(bookId);
		em.remove(bookToRemove);
		return bookToRemove;
	}

}














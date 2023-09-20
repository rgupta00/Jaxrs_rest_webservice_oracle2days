package com.bookapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookDaoImplUsingMap implements BookDao{

	private static Map<Integer, Book> books=new HashMap<Integer, Book>();
	
	static {
		books.put(1, new Book(1, "ABC123", "head first", "katthy", 500.00));
		books.put(2, new Book(2, "ABU123", "thinking in java", "amit", 400.00));
	}
	
	@Override
	public List<Book> getAll() {
		return new ArrayList<Book>(books.values());
	}

}

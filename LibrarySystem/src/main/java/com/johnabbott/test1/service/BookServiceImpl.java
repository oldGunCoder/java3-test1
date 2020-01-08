package com.johnabbott.test1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.johnabbott.test1.model.Book;

@Service
public class BookServiceImpl implements BookService {
	
	
	public List<Book> getCSBooks(){
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("Computer Science", "Java Pro", 1188));
		books.add(new Book("Computer Science", "Python Master", 1986));
		
		
		return books;
	}
	
	public List<Book> getNovelBooks(){
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("Novel", "New Life", 568));
		books.add(new Book("Novel", "Catch Me If You Can", 1168));
		
		
		return books;
	}
}
	


package com.johnabbott.test1.service;

import java.util.List;

import com.johnabbott.test1.model.Book;

public interface BookService {
	public List<Book> getCSBooks();
	public List<Book> getNovelBooks();
}

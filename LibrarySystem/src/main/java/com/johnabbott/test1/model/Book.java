package com.johnabbott.test1.model;


public class Book {
	
	private String genre;
	private String name;
	private int pageNumber;
	
	public Book() {
		
	}
	
	
	
	public Book(String genre, String name, int pageNumber) {
		this.genre = genre;
		this.name = name;
		this.pageNumber = pageNumber;
	}



	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	
	
	
}

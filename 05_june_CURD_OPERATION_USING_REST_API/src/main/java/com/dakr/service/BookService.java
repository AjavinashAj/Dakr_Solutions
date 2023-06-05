package com.dakr.service;

import java.util.List;
import java.util.Optional;

import com.dakr.entity.Book;

public interface BookService {

	 public Book insertD(Book book);

	public Optional<Book> retriveD(Integer bcode);

	public List<Book> retriveAll();

	public Book updateD(Book book);

	public String deleteD(Integer bcode);

}

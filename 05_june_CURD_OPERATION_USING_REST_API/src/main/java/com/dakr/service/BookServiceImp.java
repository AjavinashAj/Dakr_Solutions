package com.dakr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.dakr.entity.Book;
import com.dakr.repository.BookRepository;

@Service
public class BookServiceImp implements BookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public Book insertD(Book book) {

		return bookRepo.save(book);
	}

	@Override
	public Optional<Book> retriveD(Integer bcode) {
		
		return bookRepo.findById(bcode);
	}

	@Override
	public List<Book> retriveAll() {
		
		return bookRepo.findAll();
	}

	@Override
	public Book updateD(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public String deleteD(Integer bcode) {
		String temp="";
		if(bookRepo.findById(bcode).isPresent())
		{
			bookRepo.deleteById(bcode);
			temp="bCode="+bcode+" , deleted successfully......";
		}
		else
		{
			temp="bCode="+bcode+", is not available......";
		}
		return temp;
		
	}

	
	
	

}

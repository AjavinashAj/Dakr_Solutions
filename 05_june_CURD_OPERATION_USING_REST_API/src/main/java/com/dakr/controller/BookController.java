package com.dakr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.entity.Book;
import com.dakr.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookser;

	// insert data in db
	@PostMapping("/save")
	public Book insertData(@RequestBody Book book) {

		return bookser.insertD(book);

	}

	// retrive single row from DB

	@GetMapping("/retrive")
	public Optional<Book> retriveData(@RequestParam Integer bcode) {

		return bookser.retriveD(bcode);
	}

	// retrive All row from DB

	@GetMapping("/retA")
	public List<Book> retriveAllData() {
		return bookser.retriveAll();
	}

	// update data from DB

	@PutMapping("/update")
	public Book updateData(@RequestBody Book book) {
		return bookser.updateD(book);
	}

	// Delete data from DB
   @DeleteMapping("/delete")
	public String deleteData(@RequestParam Integer bcode) {
       
		return bookser.deleteD(bcode);
	}
}

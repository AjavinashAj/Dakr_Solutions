package com.dakr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.entity.Registration;
import com.dakr.service.RegisterService;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegisterService reservice;
	
	//for insert operation
	@PostMapping("/insert")
	public Registration insertData(@RequestBody Registration re)
	{
		return reservice.insert(re);
	}
	
	//for retrive data from db
	
	@GetMapping("/insert")
	public Optional<Registration> retriveData(@RequestParam Integer id)
	{
		return reservice.retrive(id);
	}
	
	//for retrieve all data from 
	
	@GetMapping("/retrive")
	public List<Registration> retriveAll()
	{
		return reservice.retriveAll();
	}
	
	//for update data 
	@PutMapping("/update")
	public Registration updateData(@RequestBody Registration reg)
	{
		return reservice.updateD(reg);
	}

}
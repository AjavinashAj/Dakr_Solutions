package com.dakr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.entity.Registration;
import com.dakr.repository.RegistationRepository;

@Service
public class ServiceRegistrationImp implements RegisterService {
	@Autowired
	private  RegistationRepository repo;
	
	
	public Registration insert(Registration re) {
		return repo.save(re);
	}


	@Override
	public Optional<Registration> retrive(Integer id) {
		
		return repo.findById(id);
	}


	@Override
	public List<Registration> retriveAll() {
		
		return repo.findAll();
	}


	public Registration updateD(Registration re) {
		return repo.save(re);
	}

}

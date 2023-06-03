package com.dakr.service;

import java.util.List;
import java.util.Optional;

import com.dakr.entity.Registration;

public interface RegisterService {

    public Registration insert(Registration re);

    public Optional<Registration> retrive(Integer id);

	public List<Registration> retriveAll();

	public Registration updateD(Registration reg);

}

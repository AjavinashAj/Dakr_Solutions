package com.dakr.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.entity.Registration;
@Repository
public interface RegistationRepository extends JpaRepository<Registration, Integer>{

	Registration save(Optional<Registration> reg);





}

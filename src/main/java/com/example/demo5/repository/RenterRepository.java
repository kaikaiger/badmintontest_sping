package com.example.demo5.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo5.model.Renter;

@RepositoryRestResource
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://kaikaiger.github.io")
public interface RenterRepository extends CrudRepository<Renter, Integer> {
	
	Renter findByPhone(String phone);
}

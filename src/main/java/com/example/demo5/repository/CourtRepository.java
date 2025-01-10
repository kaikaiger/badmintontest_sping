package com.example.demo5.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo5.model.Court;

@RepositoryRestResource
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://kaikaiger.github.io")
public interface CourtRepository extends CrudRepository<Court, Integer> {
	
	List<Court>findByArea(String area);
}

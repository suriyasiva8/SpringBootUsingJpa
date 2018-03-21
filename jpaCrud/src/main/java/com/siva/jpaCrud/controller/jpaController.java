package com.siva.jpaCrud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.jpaCrud.Entity.jpaEntity;
import com.siva.jpaCrud.Repository.jpaCrudRepository;

@RestController
public class jpaController {
	
	@Autowired
	jpaCrudRepository repository;
	
	@RequestMapping("/save")
	public String saveNames()
	{
	repository.save(new jpaEntity("Siva", "chennai", "chennai"));
	repository.save(new jpaEntity("Suriyan", "chennai", "chennai"));
		return "Names Saved";
	}
	@RequestMapping("/get")
	public Iterable<jpaEntity> getNames()
	{
	return repository.findAll();
	
	}

}

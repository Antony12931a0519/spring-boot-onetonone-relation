package com.practice.onetoonerelation.pocproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.onetoonerelation.pocproject.entities.Person;
import com.practice.onetoonerelation.pocproject.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;

	@PostMapping("/add-person")
	public Person addPerson(@RequestBody Person person) {

		return personService.addPerson(person);

	}

}

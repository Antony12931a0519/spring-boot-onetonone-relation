package com.practice.onetoonerelation.pocproject.service;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.onetoonerelation.pocproject.dao.PersonRepository;
import com.practice.onetoonerelation.pocproject.entities.Address;
import com.practice.onetoonerelation.pocproject.entities.Person;

@Component
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public Person addPerson(Person person) {

//		Person person = new Person();
//		Address address = new Address();
//		address.setCity("ffa");
//		address.setCountry("s");
//		address.setState("sfa");
//		address.setStreet("wf");
//		address.setZipCode("fq");
//		person.setAddress(address);
//		person.setAddress(address);
//
//		person.setEmail("fqf");
//		person.setName("ff");
//		person.setPassword("ff");

		return personRepository.save(person);

	}
}

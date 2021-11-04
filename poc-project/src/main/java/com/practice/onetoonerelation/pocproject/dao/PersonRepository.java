package com.practice.onetoonerelation.pocproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.practice.onetoonerelation.pocproject.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}

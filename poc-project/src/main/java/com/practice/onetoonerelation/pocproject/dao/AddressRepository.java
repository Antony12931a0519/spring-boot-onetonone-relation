package com.practice.onetoonerelation.pocproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.practice.onetoonerelation.pocproject.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Long>{

}

package com.techprimers.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.jpa.springjpahibernateexample.model.customer;

import java.util.List;

public interface customerRepository extends JpaRepository<customer, Integer> {
    List<customer> findByName(String name);

}

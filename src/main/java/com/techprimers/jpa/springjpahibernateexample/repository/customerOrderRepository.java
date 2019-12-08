package com.techprimers.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.jpa.springjpahibernateexample.model.CustomerOrder;

public interface customerOrderRepository extends JpaRepository<CustomerOrder, Integer> {
}

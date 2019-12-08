package com.techprimers.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.jpa.springjpahibernateexample.model.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer> {

}

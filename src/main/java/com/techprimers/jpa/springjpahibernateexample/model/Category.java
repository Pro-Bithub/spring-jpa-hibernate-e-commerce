package com.techprimers.jpa.springjpahibernateexample.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "category", catalog = "test")
public class Category {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	
	    private Integer id;
	   

	   
	   
	   
private	String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}

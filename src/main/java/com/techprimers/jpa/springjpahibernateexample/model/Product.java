package com.techprimers.jpa.springjpahibernateexample.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Product")
public class Product {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int	id ;
	private String	name ;
	private	double  price ;
	private	 String description  ;
	@Temporal(TemporalType.DATE)
	private Date last_update ;
	
	
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "category", referencedColumnName = "id")
	    private Category category;
	   
	

public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}


	

}

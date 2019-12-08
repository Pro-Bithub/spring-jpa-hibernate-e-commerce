package com.techprimers.jpa.springjpahibernateexample.model;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_order", catalog = "test")
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
  

    
	private Date date_created ;
	private int confirmation_number ;
	
	
	
	   @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	    private customer users;
	   
	   
	   
	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public int getConfirmation_number() {
		return confirmation_number;
	}

	public void setConfirmation_number(int confirmation_number) {
		this.confirmation_number = confirmation_number;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	private double  amount ;
	
    
 

    public CustomerOrder() {
    }

    public customer getUsers() {
        return users;
    }

    public CustomerOrder setUsers(customer users) {
        this.users = users;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public CustomerOrder setId(Integer id) {
        this.id = id;
        return this;
    }


}

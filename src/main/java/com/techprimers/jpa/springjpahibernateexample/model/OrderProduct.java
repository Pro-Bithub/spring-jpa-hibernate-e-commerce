package com.techprimers.jpa.springjpahibernateexample.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Order_product", catalog = "test")
public class OrderProduct {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "product_id", referencedColumnName = "id")
	    private Product product;

	  
	    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

		private int quantity;

		   @OneToOne(cascade = CascadeType.ALL)
		    @JoinColumn(name = "customer_order_id", referencedColumnName = "id")
		    private CustomerOrder CustomerOrders;

	
	    public CustomerOrder getCustomerOrders() {
			return CustomerOrders;
		}

		public void setCustomerOrders(CustomerOrder customerOrders) {
			CustomerOrders = customerOrders;
		}


	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

}

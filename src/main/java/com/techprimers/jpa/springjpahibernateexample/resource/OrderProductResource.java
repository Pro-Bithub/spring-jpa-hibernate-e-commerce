package com.techprimers.jpa.springjpahibernateexample.resource;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springjpahibernateexample.model.Category;
import com.techprimers.jpa.springjpahibernateexample.model.CustomerOrder;
import com.techprimers.jpa.springjpahibernateexample.model.OrderProduct;
import com.techprimers.jpa.springjpahibernateexample.model.Product;
import com.techprimers.jpa.springjpahibernateexample.model.customer;
import com.techprimers.jpa.springjpahibernateexample.repository.OrderProductRepository;

@RequestMapping("/rest/OrderProductResource")
@RestController
public class OrderProductResource {

	
	
	  private OrderProductRepository OrderProductRepositorys;

	    public OrderProductResource(OrderProductRepository OrderProductRepositorys) {
	        this.OrderProductRepositorys = OrderProductRepositorys;
	    }

	    @GetMapping(value = "/all")
	    public List<OrderProduct> getoneCustomerOrderContact() {
	        return OrderProductRepositorys.findAll();
	    }

	    @GetMapping(value = "/update/{name}")
	    public List<OrderProduct> update(@PathVariable final String name) throws ParseException {

	        OrderProduct oneCustomerOrderProduct = new OrderProduct();

	        
	        
	        
	        ///apre on va replase par find id user 
	        
	        customer users = new customer();
	        users.setEmail("ghozzihatem@gmail.com");
	        users   .setPhone("261121");
	        users  .setName(name).setAddress("sousse");
	        users.setCity_region("birchebek");
	        users.setCc_number("2");
	        
	 
	        
	        ////oneCustomerOrder
	        CustomerOrder oneCustomerOrder = new CustomerOrder();
	        oneCustomerOrder.setAmount(55);
	        DateFormat dt=new SimpleDateFormat("dd/mm/yyyy");
	        oneCustomerOrder.setDate_created(dt.parse("24/01/1996"));
	        oneCustomerOrder.setConfirmation_number(2);
	        oneCustomerOrder.setUsers(users);
	 
	    
	        
	        
	        
	        ////oneCategory
	    	Category oneCategory = new Category();

	    	oneCategory.setName("Category 1");
	        
	        //oneProduct
	        Product oneProduct = new Product();
	      	oneProduct.setPrice(10.99);
	    	oneProduct.setName("firstnameprod");
	    	oneProduct.setDescription("dededed");
	    	DateFormat dt1=new SimpleDateFormat("dd/mm/yyyy");
	    	oneProduct.setLast_update(dt1.parse("24/01/1996"));
	    	oneProduct.setCategory(oneCategory);
	        
	      ///oneCustomerOrderProduct

		      oneCustomerOrderProduct.setProduct(oneProduct);
		      oneCustomerOrderProduct.setQuantity(20);
	        oneCustomerOrderProduct.setCustomerOrders(oneCustomerOrder);
	        
	        
	        
	        
	        
	        OrderProductRepositorys.save(oneCustomerOrderProduct);

	        return OrderProductRepositorys.findAll();


	    }

}

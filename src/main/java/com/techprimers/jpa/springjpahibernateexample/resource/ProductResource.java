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
import com.techprimers.jpa.springjpahibernateexample.model.Product;
import com.techprimers.jpa.springjpahibernateexample.repository.ProductRepository;

@RequestMapping("/rest/ProductResource")
 @RestController
public class ProductResource {
	
	
	  private ProductRepository ProductRepositorys;

	    public ProductResource(ProductRepository ProductRepositorys) {
	        this.ProductRepositorys = ProductRepositorys;
	    }

	    @GetMapping("/xx")
	    public String getArticle() {
	     
	      
	        return "article-page";
	    }
	    
	    @GetMapping(value = "/all")
	    public List<Product> getoneProduct() {
	        return ProductRepositorys.findAll();
	    }

	    @GetMapping(value = "/update/{name}")
	    public List<Product> update(@PathVariable final String name) throws ParseException {

	    	Product oneProduct = new Product();

	        
	        
	        
	 
	        
	        ////oneCategory
	    	Category oneCategory = new Category();

	    	oneCategory.setName("Category 1");
	 
	    
	      ///oneCustomerOrderProduct

	    	

	    	
	    	oneProduct.setPrice(10.99);
	    	oneProduct.setName("firstnameprod");
	    	oneProduct.setDescription("dededed");
	    	DateFormat dt=new SimpleDateFormat("dd/mm/yyyy");
	    	oneProduct.setLast_update(dt.parse("24/01/1996"));
	    	oneProduct.setCategory(oneCategory);
	        
	        
	        
	        
	        
	    	ProductRepositorys.save(oneProduct);

	        return ProductRepositorys.findAll();


	    }
	    

}

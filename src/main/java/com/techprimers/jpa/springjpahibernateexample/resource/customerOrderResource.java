package com.techprimers.jpa.springjpahibernateexample.resource;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springjpahibernateexample.model.CustomerOrder;
import com.techprimers.jpa.springjpahibernateexample.model.customer;
import com.techprimers.jpa.springjpahibernateexample.repository.customerOrderRepository;

@RequestMapping("/rest/userscontact")
@RestController
public class customerOrderResource {

    private customerOrderRepository usersContactRepository;

    public customerOrderResource(customerOrderRepository usersContactRepository) {
        this.usersContactRepository = usersContactRepository;
    }

    @GetMapping(value = "/all")
    public List<CustomerOrder> getUsersContact() {
        return usersContactRepository.findAll();
    }

    @GetMapping(value = "/update/{name}")
    public List<CustomerOrder> update(@PathVariable final String name) throws ParseException {

        CustomerOrder usersContact = new CustomerOrder();

        customer users = new customer();
        users.setEmail("ghozzihatem@gmail.com");
        users   .setPhone("261121");
        users  .setName(name).setAddress("sousse");
        users.setCity_region("birchebek");
        users.setCc_number("2");
        
        
    
        usersContact.setAmount(55);
        DateFormat dt=new SimpleDateFormat("dd/mm/yyyy");
        usersContact.setDate_created(dt.parse("24/01/1996"));
        usersContact.setConfirmation_number(2);
        usersContact.setUsers(users);
        
        
        usersContactRepository.save(usersContact);

        return usersContactRepository.findAll();


    }


}

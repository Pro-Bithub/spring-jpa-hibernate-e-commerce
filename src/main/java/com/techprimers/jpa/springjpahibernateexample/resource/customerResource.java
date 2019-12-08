package com.techprimers.jpa.springjpahibernateexample.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springjpahibernateexample.model.customer;
import com.techprimers.jpa.springjpahibernateexample.repository.customerRepository;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class customerResource {

    @Autowired
    customerRepository usersRepository;

    @GetMapping("/all")
    public List<customer> getAll() {
        return usersRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<customer> getUser(@PathVariable("name") final String name) {
        return usersRepository.findByName(name);

    }

    @GetMapping("/id/{id}")
    public customer getId(@PathVariable("id") final Integer id) {
        return usersRepository.findOne(id);
    }

    @GetMapping("/update/{id}/{name}")
    public customer update(@PathVariable("id") final Integer id, @PathVariable("name")
                         final String name) {


        customer users = getId(id);
        users.setName(name);

        return usersRepository.save(users);
    }
}

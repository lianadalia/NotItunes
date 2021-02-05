package com.gitlab.lianadalia.task4.controllers;

import no.noroff.sean.fakeapi.models.Artist;
import no.noroff.sean.fakeapi.models.Customer;
import no.noroff.sean.fakeapi.models.fakedb.Database;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private Database database = new Database();
    // This adds a new customer. It takes the new customer from the body of the request.
    @RequestMapping(value="/customers", method = RequestMethod.POST)
    public Boolean addNewCustomer(@RequestBody Customer customer){
        List<Customer> customers = database.getCustomers();
        //return database.getCustomers(customer);
        customers.add(customer);
        return true;
    }

    // This updates an existing customer.
   // @RequestMapping(value = "/customers/", method = RequestMethod.PUT)
    //public Boolean updateExistingCustomer(@PathVariable String id, @RequestBody Customer customer){

     //   List<Customer> customers = database.getCustomers();
        //return database.getCustomers(customers);
   // }
    // This adds a new customer
    //@RequestMapping(value = "/customer", method = RequestMethod.POST)
    //public Boolean addNewCustomer(@RequestBody Customer customer) {
      //  boolean addSuccessful = false;

        //List<Customer> customer = database.getCustomers();
             //   customer = database.getCustomers();
       // customers.add();
        //implement some logic to add a new customer to the fake database and check if it has been added
        //return addSuccessful;

   // }

}

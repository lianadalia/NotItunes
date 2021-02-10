package com.gitlab.lianadalia.task4.controllers;


import no.noroff.sean.fakeapi.models.Customer;
import no.noroff.sean.fakeapi.models.fakedb.Database;
import org.springframework.web.bind.annotation.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private Database database = new Database();

    //reads all the customers data
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        List<Customer> customers = database.getCustomers();

        return customers;

    }

    // This adds a new customer. It takes the new customer from the body of the request.
    @RequestMapping(value="/customers", method = RequestMethod.POST)
    public Customer addNewCustomer(@RequestBody Customer customer){
        List<Customer> customers = database.getCustomers();
        customers.add(customer);
        Customer addedCustomer = null;
        for(Customer cust:customers) {
            if(cust.getId()== customer.getId()) {
                addedCustomer = cust;
            }
        }
        return addedCustomer; //returns newly created customer
    }
    // This updates an existing customer.//works and shows on the API PUT http://localhost:8080/customers/1
   @RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
    public Customer updateExistingCustomer(@PathVariable String id, @RequestBody Customer customer) {
       List<Customer> customers = database.getCustomers();
       //loop through customers & if the customer id is equal to path variable
       int index=-1;
       for(int i=0; i<customers.size(); i++){
           Customer currentCustomer = customers.get(i);
           if(currentCustomer.getId()== Integer.valueOf(id)){
            customers.set(i, customer);

            index=i;
           }
       }
       Customer updatedCustomer = customers.get(index);

       return updatedCustomer;

       }

    //deletes customer
    @RequestMapping(value="/customers/{id}", method = RequestMethod.DELETE)
    public String deleteCustomer(@PathVariable int id){

        List<Customer> currentCustomers = database.getCustomers();

        for(int i=0; i< currentCustomers.size(); i++) {
            if(currentCustomers.get(i).getId()==id){
                currentCustomers.remove(i);

            }

        }
        database.setCustomers(currentCustomers);
        return "customer was removed";
    }


}

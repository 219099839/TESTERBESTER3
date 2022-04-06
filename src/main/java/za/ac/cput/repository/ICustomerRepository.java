package za.ac.cput.repository;

import za.ac.cput.entity.Customer;

import java.util.Set;

public interface ICustomerRepository extends IRepository<Customer,String>{
    //create,read,update,delete
    public Set<Customer> getAll();
}


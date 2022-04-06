package za.ac.cput.repository;

import za.ac.cput.entity.Customer;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepository implements ICustomerRepository{
    private static CustomerRepository customerRepository=null;
    private Set<Customer> customerDB=null;

    private CustomerRepository()
    {

        customerDB=new HashSet<Customer>();
    }
    public static CustomerRepository getRepository(){
        if(customerRepository==null)
        {
            customerRepository=new CustomerRepository();
        }
        return customerRepository;
    }
    @Override
    public Customer create(Customer customer) {
        boolean success=customerDB.add(customer);
        if(!success)
            return null;
        return customer;
    }

    @Override
    public Customer read(String customerID) {
        Customer customer=customerDB.stream()
                .filter(e-> e.getCustomerID().equals(customerID))
                .findAny()
                .orElse(null);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Customer oldCustomer=read(customer.getCustomerID());
        if(oldCustomer !=null)
        {
            customerDB.remove(oldCustomer);
            customerDB.add(customer);
            return customer;
        }
        return null;
    }

    @Override
    public boolean delete(String customerID) {
        Customer customerToDelete=read(customerID);
        if(customerToDelete==null)
            return false;
        customerDB.remove(customerToDelete);
        return true;
    }
    @Override
    public Set<Customer> getAll() {
        return customerDB;
    }
}


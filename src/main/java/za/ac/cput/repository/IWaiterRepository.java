package za.ac.cput.repository;

import za.ac.cput.entity.Waiter;

import java.util.Set;

public interface IWaiterRepository extends IRepository<Waiter,String>{
    //create,read,update,delete
    public Set<Waiter> getAll();
}

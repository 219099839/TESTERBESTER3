package za.ac.cput.repository;

import za.ac.cput.entity.Manager;
import java.util.Set;


public interface IManagerRepository extends IRepository<Manager, String>{


    //create,read,update,delete
    Manager create(Manager manager);

    Manager read(String mangerId);

    Manager update(Manager manager);

    boolean delete(String managerId);

    Set<Manager> getAll();
}

/*
IRepository.java-----must only have one of these for the whole project----the leader must add this you do not need to add this
 */

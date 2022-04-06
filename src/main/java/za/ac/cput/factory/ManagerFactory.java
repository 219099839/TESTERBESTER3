package za.ac.cput.factory;

/* ManagerFactory.java
   Entity for the ManagerFactory
   Author: Nawaaz Amien (219099839)
   Date: 27 March 2022
 */

import za.ac.cput.entity.Manager;
import za.ac.cput.util.NawaazHelper;

public class ManagerFactory {
    public static Manager createManager(String firstName, String lastName, String address, int employee_number){
        String employeeId= NawaazHelper.managerId();
        Manager manager = new Manager.Builder().setManagerId(employeeId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAddress(address)
                .setEmployee_number(employee_number)
                .build();
        return manager;
    }

}

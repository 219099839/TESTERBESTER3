package za.ac.cput.factory;

/* ManageFactoryTest.java
   Entity for the ManageFactoryTest
   Author: Nawaaz Amien (219099839)
   Date: 27 March 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Manager;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFactoryTest {

    @Test
    public void createManager(){
        Manager manager = ManagerFactory.createManager("Nawaaz","Amien","8 Rockhill Way,Retreat", 0001);
        System.out.println(manager);
        assertNotNull(manager);
    }

}
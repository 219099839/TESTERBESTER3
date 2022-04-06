package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {
    @Test
    void createCustomer()
    {
        Customer customer=CustomerFactory.createCustomer("Warren","Jaftha","warrenjaftha16@gmail.com","0618620283","28 degrees celsius");
        System.out.println(customer);
        assertNotNull(customer);
    }
}
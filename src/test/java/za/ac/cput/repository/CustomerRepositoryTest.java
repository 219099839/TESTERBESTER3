package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerRepositoryTest {
    private static CustomerRepository customerRepository=CustomerRepository.getRepository();
    private static Customer customer= CustomerFactory.createCustomer("Warren","Jaftha","warrenjaftha16@gmail.com","0618620283","28 degrees celsius");

    @Test
    void a_create()
    {
        Customer created=customerRepository.create(customer);
        assertEquals(customer.getCustomerID(),created.getCustomerID());
        System.out.println("Create:" + created);
    }
    @Test
    void b_read()
    {
        Customer read=customerRepository.read(customer.getCustomerID());
        assertNotNull(read);
        System.out.println("read:" +read);
    }
    @Test
    void c_update()
    {
        Customer updated=new Customer.Builder().copy(customer).setCustomerName("Daniel")
                .setCustomerSurname("Abrahams")
                .build();
        assertNotNull(customerRepository.update(updated));
        System.out.println("Updated:" +updated);
    }
    @Test
    void e_delete()
    {
        boolean success=customerRepository.delete(customer.getCustomerID());
        assertTrue(success);
        System.out.println("Deleted:" +success);
    }
    @Test
    void d_getAll()
    {
        System.out.println("Show all:");
        System.out.println(customerRepository.getAll());
    }
}
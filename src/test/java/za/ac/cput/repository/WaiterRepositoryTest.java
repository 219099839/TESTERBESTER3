package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Waiter;
import za.ac.cput.factory.WaiterFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class WaiterRepositoryTest {
    private static WaiterRepository waiterRepository=WaiterRepository.getRepository();
    private static Waiter waiter= WaiterFactory.createWaiter("Damian","Jaftha","0731791829");

    @Test
    void a_create()
    {
        Waiter created=waiterRepository.create(waiter);
        assertEquals(waiter.getWaiterID(),created.getWaiterID());
        System.out.println("Create:" + created);
    }
    @Test
    void b_read()
    {
        Waiter read=waiterRepository.read(waiter.getWaiterID());
        assertNotNull(read);
        System.out.println("read:" +read);
    }
    @Test
    void c_update()
    {
        Waiter updated=new Waiter.Builder().copy(waiter).setWaiterName("Daniel")
                .setWaiterSurname("Abrahams")
                .build();
        assertNotNull(waiterRepository.update(updated));
        System.out.println("Updated:" +updated);
    }
    @Test
    void e_delete()
    {
        boolean success=waiterRepository.delete(waiter.getWaiterID());
        assertTrue(success);
        System.out.println("Deleted:" +success);
    }
    @Test
    void d_getAll()
    {
        System.out.println("Show all:");
        System.out.println(waiterRepository.getAll());
    }

}

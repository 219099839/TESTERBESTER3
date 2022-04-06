package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Waiter;

import static org.junit.jupiter.api.Assertions.*;
class WaiterFactoryTest {
    @Test
    void createWaiter()
    {
        Waiter waiter=WaiterFactory.createWaiter("Damian","Jaftha","0731791829");
        System.out.println(waiter);
        assertNotNull(waiter);
    }
}
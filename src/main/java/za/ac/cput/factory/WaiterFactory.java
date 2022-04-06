package za.ac.cput.factory;

import za.ac.cput.entity.Waiter;
import za.ac.cput.util.WarrenHelper;

public class WaiterFactory {
    public static Waiter createWaiter(String waiterName, String waiterSurname, String waiterCellNumber)
    {
        String serverId= WarrenHelper.workerId();
        Waiter customer=new Waiter.Builder().setWaiterID(serverId)
                .setWaiterName(waiterName)
                .setWaiterSurname(waiterSurname)
                .setWaiterCellNumber(waiterCellNumber)
                .build();
        return customer;
    }
}



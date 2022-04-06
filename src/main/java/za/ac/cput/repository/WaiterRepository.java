package za.ac.cput.repository;

import za.ac.cput.entity.Waiter;

import java.util.HashSet;
import java.util.Set;

public class WaiterRepository implements IWaiterRepository
{
    private static WaiterRepository waiterRepository=null;
    private Set<Waiter> waiterDB=null;

    private WaiterRepository()
    {

        waiterDB=new HashSet<Waiter>();
    }
    public static WaiterRepository getRepository(){
        if(waiterRepository==null)
        {
            waiterRepository=new WaiterRepository();
        }
        return waiterRepository;
    }

    @Override
    public Waiter create(Waiter waiter) {
        boolean success=waiterDB.add(waiter);
        if(!success)
            return null;
        return waiter;
    }

    @Override
    public Waiter read(String waiterID) {
        Waiter waiter=waiterDB.stream()
                .filter(e-> e.getWaiterID().equals(waiterID))
                .findAny()
                .orElse(null);
        return waiter;
    }

    @Override
    public Waiter update(Waiter waiter) {
        Waiter oldWaiter=read(waiter.getWaiterID());
        if(oldWaiter !=null)
        {
            waiterDB.remove(oldWaiter);
            waiterDB.add(waiter);
            return waiter;
        }

        return null;
    }

    @Override
    public boolean delete(String waiterID) {
        Waiter waiterToDelete=read(waiterID);
        if(waiterToDelete==null)
            return false;
        waiterDB.remove(waiterToDelete);
        return true;
    }

    @Override
    public Set<Waiter> getAll() {
        return waiterDB;
    }
}


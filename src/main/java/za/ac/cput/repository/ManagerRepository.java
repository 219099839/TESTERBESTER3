package za.ac.cput.repository;

import za.ac.cput.entity.Manager;

import java.util.HashSet;
import java.util.Set;

public class ManagerRepository implements IManagerRepository{
    private static ManagerRepository repository=null;
    private Set<Manager> managerDB=null;

    private ManagerRepository(){

        managerDB=new HashSet<Manager>();
    }
    public static ManagerRepository getRepository() {
        if (repository == null){
            repository = new ManagerRepository();
        }
        return repository;
    }
    @Override
    public Manager create(Manager manager) {

        boolean success=managerDB.add(manager);
        if(!success)
            return null;
        return manager;
    }

    @Override
    public Manager read(String mangerId) {

        Manager manager=managerDB.stream()
                .filter(e-> e.getManagerId().equals(mangerId))
                .findAny()
                .orElse(null);
        return manager;
    }

    @Override
    public Manager update(Manager manager) {
        Manager oldManager=read(manager.getManagerId());
        if(oldManager !=null) {
            managerDB.remove(oldManager);
            managerDB.add(manager);
            return manager;
        }
        return null;

    }

    @Override
    public boolean delete(String managerId) {
        Manager managerToDelete=read(managerId);
        if(managerToDelete == null)
            return false;
        managerDB.remove(managerToDelete);
        return true;

    }
    @Override
    public Set<Manager> getAll() {
        return managerDB;
    }
}

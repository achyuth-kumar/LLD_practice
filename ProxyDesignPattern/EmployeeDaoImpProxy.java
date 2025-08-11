public class EmployeeDaoImpProxy implements EmployeeDao {
    public EmployeeDaoImpl empoyeeDaoImpl;
    EmployeeDaoImpProxy(EmployeeDaoImpl employeDaoImpl) {
        this.empoyeeDaoImpl=employeDaoImpl;
    }

    @Override
    public void create(String client, EmployeeDao employeeDao) {
        if(client.equals("admin")) {
            empoyeeDaoImpl.create(client,employeeDao);
            return ;
        }
        System.out.println("Creation access denied");
        return ;
    }

    @Override
    public void update(String client, EmployeeDao employeeDao) {
        if(client.equals("admin")) {
            empoyeeDaoImpl.update(client,employeeDao);
            return ;
        }
        System.out.println("Update access denied");
        return ;
    }

    @Override
    public void delete(String client) {
        if(client.equals("admin")) {
            empoyeeDaoImpl.delete(client);
            return ;
        }
        System.out.println("Deletion access denied");
        return ;
    }
}
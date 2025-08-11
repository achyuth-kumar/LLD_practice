public class EmployeeDaoImplProxy implements EmployeeDao {
    public EmployeeDaoImpl employeeDaoImpl;
    EmployeeDaoImplProxy(EmployeeDaoImpl employeeDaoImpl) {
        this.employeeDaoImpl=employeeDaoImpl;
    }

    @Override
    public void create(String client, EmployeeDao employeeDao) {
        if(client.equals("admin")) {
            employeeDaoImpl.create(client,employeeDao);
            return ;
        }
        System.out.println("Creation access denied");
    }

    @Override
    public void update(String client, EmployeeDao employeeDao) {
        if(client.equals("admin")) {
            employeeDaoImpl.update(client,employeeDao);
            return ;
        }
        System.out.println("update access denied");
    }

    @Override
    public void delete(String client) {
        if(client.equals("admin")) {
            employeeDaoImpl.delete(client);
            return ;
        }
        System.out.println("Delete access denied");
    }
}
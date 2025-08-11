public class EmployeeDaoImpl implements  EmployeeDao {
    @Override
    public void create(String client,EmployeeDao employeeDao) {
        System.out.println(client+" user created successfully!!!");
    }
    @Override
    public void update(String client,EmployeeDao employeeDao) {
        System.out.println(client+" user updated successfully!!!");
    }
    @Override
    public void delete(String client) {
        System.out.println(client + " user deleted successfully!!!");
    }
}
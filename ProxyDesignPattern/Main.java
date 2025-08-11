public class Main {
    public static void main(String args[]) {
        EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
        EmployeeDao employeeDao=new EmployeeDaoImpProxy(employeeDaoImpl);
        employeeDao.create("admin",employeeDaoImpl);
        employeeDao.update("admin",employeeDaoImpl);
        employeeDao.delete("admin1");

    }
}
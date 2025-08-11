public class Main {
    public static void main(String args[]) {
        EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
        EmployeeDao employeeDao = new EmployeeDaoImplProxy(employeeDaoImpl);
        employeeDao.delete("admin1");
    }
}

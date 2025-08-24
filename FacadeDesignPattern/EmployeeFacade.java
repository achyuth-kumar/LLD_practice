public class EmployeeFacade {
    EmployeeDao employeeDao;
    EmployeeFacade() {
        employeeDao=new EmployeeDao();
    }
    public void insert() {
        employeeDao.insert();
    }
    public void getEmployeeDetails() {
        employeeDao.getEmployeeDetails();
    }
}

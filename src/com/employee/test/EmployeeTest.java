/*
 * package com.employee.test;
 * 
 * import static org.junit.Assert.assertEquals;
 * 
 * import java.util.List;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.test.context.ContextConfiguration; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 * 
 * import com.employee.dao.EmployeeMapper; import com.employee.model.Employee;
 * 
 * @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @ContextConfiguration(classes = { EmployeeMapper.class }) public class
 * EmployeeTest {
 * 
 * @Autowired private EmployeeMapper employeeMapper;
 * 
 * @Test public void allCrudEmp() { //create operation
 * 
 * Employee emp = new Employee(); emp.setCompanyName("Infosys");
 * emp.setDesignation("Developer"); emp.setDob("26-05-1994");
 * emp.setEmpName("Raje"); emp.setSal(45632.15f);
 * 
 * assertEquals("values inserted Successfully",0,employeeMapper.saveEmployee(emp
 * )); Employee emps = new Employee(); emps.setCompanyName("HCL");
 * emps.setDesignation("Tech Lead"); emps.setDob("26-03-1984");
 * emps.setEmpName("suku"); emps.setSal(45692.15f);
 * assertEquals("values inserted Successfully",0,employeeMapper.saveEmployee(
 * emps)); //update operation
 * 
 * 
 * Employee empn = employeeMapper.getEmployee(emp.getEmpId());
 * 
 * empn.setEmpName("Rahul");
 * 
 * assertEquals("Values Updated Successfully", 0,
 * employeeMapper.updateEmployee(empn));
 * 
 * 
 * 
 * 
 * 
 * //Delete Operation
 * 
 * assertEquals("Value Deleted Successfully", 0,
 * employeeMapper.deleteEmployee(26));
 * 
 * 
 * //Read All
 * 
 * List<Employee> lim = employeeMapper.getAllEmployees();
 * assertEquals("All Values fetched Successfully", lim, lim);
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @Test public void getEmpTest() { List<Employee> enp =
 * employeeMapper.getAllEmployees();
 * 
 * for (Employee employee : enp) {
 * System.out.println("Employee Details"+employee.getEmpName()); }
 * 
 * 
 * }
 * 
 * 
 * @Test public void getEmpDet() { Employee emps =
 * employeeMapper.getEmployee(15); if(emps !=null) {
 * assertEquals("Values fetched from DB", "Saravanan",emps.getEmpName());
 * System.out.println("Value present in DB"); } else {
 * assertNull("Values doesn't exist in Database", emps); } }
 * 
 * 
 * @Test public void updateEmpDet() { Employee empns =
 * employeeMapper.getEmployee(15); empns.setEmpName("hello");
 * assertEquals("Values found  inthe DB",0,employeeMapper.updateEmployee(empns))
 * ; System.out.println("Values updated"); }
 * 
 * 
 * @Test public void deleteEmp() { Employee eml =
 * employeeMapper.getEmployee(15); assertEquals("Value deleted from Database",
 * 0,employeeMapper.deleteEmployee(eml.getEmpId()));
 * System.out.println("Value deleted");; }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @Test public void testEmployee() { getSqlSessionFactory();
 * System.out.println("session"); List<Employee> em = emSe.getAllEmployees();
 * //Employee emp = emDao.getEmployee(15); for (Employee emp : em) {
 * assertEquals("Value exists", "Saravanan", emp.getEmpName()); }
 * 
 * if(em!=null)
 * 
 * { assertNotNull("Value preseent in DataBase", em); }else {
 * assertNull("Values are empty in Table", em); }
 * 
 * 
 * }
 * 
 * 
 * 
 * }
 */
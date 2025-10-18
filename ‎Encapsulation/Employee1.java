  package employee1;
  
class Employee { 
  private int employee_id; 
  private String employee_name; 
  private double employee_salary; 
  public int getEmployeeId() {
    return employee_id;
  } 
  public void setEmployeeId(int employeeId) {
    this.employee_id = employeeId;
  } 
  public String getEmployeeName() {
    return employee_name;
  } 
  public void setEmployeeName(String employeeName) {
    this.employee_name = employeeName;
  } 
  public double getEmployeeSalary() {
    return employee_salary;
  } 
  public void setEmployeeSalary(double employeeSalary) {
    this.employee_salary = employeeSalary;
  } 
  public String getFormattedSalary() {
    return String.format("$%.2f", employee_salary);
  }
} 
public class Employee1 {  
    public static void main(String[] args) { 
        Employee employee = new Employee(); 
        employee.setEmployeeId(1126);
        employee.setEmployeeName("Tahamina Akter");
        employee.setEmployeeSalary(5750.0); 
        
        int employeeId = employee.getEmployeeId();
        String employeeName = employee.getEmployeeName();
        String formattedSalary = employee.getFormattedSalary(); 
        
	System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + formattedSalary);
    }
}

 
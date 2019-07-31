// PP 9.2
// AP CSA
// Talon Huang
package hospital;
public class Employee {
  
  String firstName;   
  String lastName;
  long employeeID;
  long salary;
  public Employee(String firstName, String lastName, long employeeID, long salary) 
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.employeeID = employeeID;
    this.salary = salary;
  }
  public String getWholeName() {
    return firstName + " " + lastName;
  }
  public String getFirstName() {  // getter method of first name
    return firstName;
  }
  public void setFirstName(String firstName) {    // setter method of first name
    this.firstName = firstName;
  }
  public String getLastName() {   // getter method of last name
    return lastName;
  }
  public void setLastName(String lastName) {  // setter method of last name
    this.lastName = lastName;
  }
  public long getEmployeeID() {   // getter method of employee ID
    return employeeID;
  }
  public void setEmployeeID(long employeeID) {    // setter method of employee ID
    this.employeeID = employeeID;
  }
  public long getSalary() {
    return salary;
  }
  public void setSalary(long salary) {
    this.salary = salary;
  }
}
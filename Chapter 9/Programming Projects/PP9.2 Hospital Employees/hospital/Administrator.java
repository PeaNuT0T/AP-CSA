// PP 9.2
// AP CSA
// Talon Huang
package hospital;
import java.util.List;

public class Administrator extends Employee
{
    public Administrator(String firstName, String lastName, long employeeID, long salary) 
    {
        super(firstName, lastName, employeeID, salary);
    }
    
// sets salary
    public void changeSalary(Employee employee, long salary) 
    {  
        employee.setSalary(salary);
        System.out.println("Salary of " + employee.getWholeName() + " is set by " + getWholeName());
    }
    
// sets time slots
    public void setTimeSlotsForJanitor(Janitor janitor, List<Integer> slots) 
    {
        janitor.setTimeSlots(slots);
        System.out.println("Time slots of " + janitor.getWholeName() + " is set by " + getWholeName());
    }
}
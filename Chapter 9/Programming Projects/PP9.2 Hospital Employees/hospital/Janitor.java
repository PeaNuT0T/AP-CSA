// PP 9.2
// AP CSA
// Talon Huang
package hospital;
import java.util.ArrayList;
import java.util.List;
public class Janitor extends Employee 
{
    List<Integer> timeSlots;
    public Janitor(String firstName, String lastName, long employeeID, long salary) 
    {
        super(firstName, lastName, employeeID, salary);
        ArrayList<Integer> timeSlots = new ArrayList<Integer>();
    }
    
    public List<Integer> getTimeSlots() 
    {
        return timeSlots;
    }

    public void setTimeSlots(List<Integer> timeSlots) 
    {
        this.timeSlots = timeSlots;
    }

}
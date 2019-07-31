// PP 9.4
// AP CSA
// Talon Huang
package sports;
import java.util.List;

public class basketball extends sport
{
    public basketball(String name, int player_number, long salary) 
    {
        super( name,  player_number,  salary);
    }
    
// sets salary
    public void changeSalary(sport sp, long salary) 
    {  
        sp.setSalary(salary);
        System.out.println("Salary of " + sp.getName() + " player is " + salary);
    }
}
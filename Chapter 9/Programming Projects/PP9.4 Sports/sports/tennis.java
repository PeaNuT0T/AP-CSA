// PP 9.4
// AP CSA
// Talon Huang
package sports;
import java.util.ArrayList;
import java.util.List;
public class tennis extends sport 
{
    List<Integer> timeSlots;
    public tennis(String name, int player_number, long salary) 
    {
        super( name,  player_number,  salary);
    }
    
    public long getNumber()
    {
      return player_number;
    }

}
package sports;
// PP 9.4
// AP CSA
// Talon Huang

import java.util.ArrayList;
import java.util.List;

public class baseball extends sport 
{
  List<Long> patientIDList;
  public baseball(String name, int player_number, long salary) 
  {
    super(name,player_number,salary);
    ArrayList<Integer> patientIDList = new ArrayList<Integer>();
  }

}
package sports;
import java.util.List;
import java.util.ArrayList;


// PP 9.4
// AP CSA
// Talon Huang
public class football extends sport {
  
  List<Long> playerIDList;    // list of patient IDs that doctor is assigned to
  
  public football(String name, int player_number, long salary) {    // constructor
    super( name,  player_number,  salary);
    ArrayList<Integer> playerIDList = new ArrayList<Integer>();
  }
      public long getNumber()
    {
      return player_number;
    }
}
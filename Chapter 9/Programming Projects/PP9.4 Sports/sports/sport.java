// PP 9.4
// AP CSA
// Talon Huang
package sports;
public class sport {
  
  String name;   
  long player_number;
  long salary;
  public sport(String name, int player_number, long salary) 
  {
    this.name = name;
    this.player_number = player_number;
    this.salary = salary;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {    // setter method of first name
    this.name = name;
  }
  public long getNumber() {   // getter method for the number of players
    return player_number;
  }
  public void setPlayerID(long player_number) 
  {    // setter method of Player ID
    this.player_number = player_number;
  }
  public long getSalary() {
    return salary;
  }
  public void setSalary(long salary) {
    this.salary = salary;
  }
  
}
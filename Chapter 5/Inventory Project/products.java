//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                                  //
//                                     Talon & Zoya Inventory with ArrayList Project                                //
//                                                                                                                  //
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  
public class products
{
  private String name, tracking; // Instantiate four instance variables
  private int quantity, price;
  
  public void setValueName(String input) // Setters for input
  {
    name = input;
  }
  
  public void setValueQuant(int input) // Setters for input
  {
    quantity = input;
  }
  
  public void setValueTrack(String input) // Setters for input
  {
    tracking = input;
  }
  
  public void setValuePrice(int input) // Setters for input
  {
    price = input;
  }
  
    public String getValueName() // Getters for name
  {
    return name;
  }
  
  public int getValueQuant() // Getter for quantity
  {
    return quantity;
  }
  
  public String getValueTrack() // Setters for input
  {
    return tracking;
  }
  
  public int getValuePrice() // Setters for input
  {
    return price;
  }
  
}
  
    
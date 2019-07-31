//Program: Location  
  // Creator: Amit Bhongiri  Talon Huang

public class Location{
  
  String brandName;
  int cost;
  int quantity = 10;
  
  public Location(String name, int money){
    cost = money;
    brandName = name;
  }
  
  public String toString(){
    return brandName + " $" +cost +" " + quantity + "left.";
  }
  
  
  public void setBrandName(String userBrand){
    brandName = userBrand;
  }
  
  public String getBrandName(){
    return brandName;
  }
  
  public void setCost(int userCost){
    cost = userCost;
  }
  
  public int getCost(){
    return cost;
  }
  
  public int getQuantity(){
    return quantity;
  }
  public int minusQuant()
  {
    quantity = quantity - 1;
    return quantity;
  }
  
  public int restock(){
    quantity = 10;
    return quantity;
  }
}
  
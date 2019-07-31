// Programming Project 4.5
// Talon Huang
// AP CSA

public class Car
{
  private String make, model; // Declare variables
  private int year;
  
  public Car(String make,String model,int year) // Constructor
  {
    this.make = make;
    this.model = model;
    this.year = year;
  }
  // Create methods
   public String setCarMake(String make) 
  {
    this.make = make;
    return make;
   }
  
   public String getCarMake()
   {
    return make;
    }
  
   public String setCarModel(String model)
   {
     this.model = model;
     return model;
   }
   
   public String getCarModel()
   {
     return model;
    }
   
   public int setCarAge(int year)
   {
    this.year = year;
    return year;
   }
   
   public int getCarAge()
   {
     return year;
   }

  public String toString()
  {
    return("The car is " + make + " " + model + " and it was made in " + year + ".");
  }
  
  public boolean isAntique(int year)
  {
    if(year > 1973)
    {
      return true;
    }
    return false;
  }
}
  
  
    
    
   
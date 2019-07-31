// Programming Projects 4.2
// Bulb Class
// Talon Huang AP CSA

public class Bulb
{  
private boolean theLight;  // Create a boolean primitive

 public Bulb (boolean light) // Constructor
   { 
      theLight = light; 
   }

  // create methods turnOn() and turnOff() 
   public void turnOn() 
   { 
     theLight = true; 
   } 

   public void turnOff() 
   {  
     theLight = false; 
  } 
   // Create method getLight()
   public String getLight () { 
    if(theLight)
    {  
    return "On"; 
    } 
    else 
    { 
      return "Off"; 
     } 
 } 
}
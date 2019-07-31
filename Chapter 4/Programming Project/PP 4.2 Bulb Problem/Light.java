// Programming Projects 4.2
// Bulb Class
// Talon Huang AP CSA

public class Light
{
  public static void main(String args[])
  {
    Bulb bulb1 = new Bulb(true);
    Bulb bulb2 = new Bulb(false);
    
    System.out.println("Bulb 1 is  " + bulb1.getLight());
    System.out.println("Bulb 2 is  " + bulb2.getLight());
    
    bulb1.turnOn();
    bulb2.turnOff();
    
    System.out.println("Bulb 1 is  " + bulb1.getLight());
    System.out.println("Bulb 2 is  " + bulb2.getLight());
  } 
  
}
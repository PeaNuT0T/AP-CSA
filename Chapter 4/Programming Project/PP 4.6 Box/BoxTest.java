// Programming Project 4.6
// Talon Huang
// AP CSA

public class BoxTest
{
  
  
  public static void main(String args[])
  {
    Box box1 = new Box(2018, 2017, 2016, true);
    Box box2 = new Box(10, 9, 2016, false);

   System.out.println(box1.toString());
   System.out.println(box2.toString());
  }
}
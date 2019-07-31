//*********************************************************************************************************************
//****************************************************  Talon Huang  **************************************************
//*********************************************************************************************************************
//*****************************************************    PP 3.3    **************************************************
//*********************************************************************************************************************
import java.util.Random;

public class pp3$3
{
  public static void main(String args[])
  {
    Random num1 = new Random();// create a random object
    
    for(int i=0;i<3;i++)
    {
    System.out.print(num1.nextInt(8));
    }// print the first three digits
    
    System.out.print("-");
  
    System.out.print(num1.nextInt(6));// print the 4th digit
  
  for(int i=0;i<2;i++)
    {
    System.out.print(num1.nextInt(5));
    } // print the three digits after that
  
    System.out.print("-");
  
  for(int i=0;i<4;i++)
    {
    System.out.print(num1.nextInt(10));
    } // print the last four digits
    
    
  }
}
  
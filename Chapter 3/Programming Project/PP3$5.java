//*********************************************************************************************************************
//*********************************             Talon Huang               *********************************************
//*********************************************************************************************************************
//***********************************         PP 3.5 Constructor           ********************************************
//*********************************************************************************************************************
import java.lang.Math.*;
import java.util.Scanner;

public class PP3$5
{
  // This program calculates the distance between two points
  
   public static void main(String args[])
   {
     double x1, x2, y1, y2, result;//create variables
      Scanner scan = new Scanner(System.in);
      
     System.out.println("Please Enter X1 value:  ");
      x1 = scan.nextDouble();
     
     System.out.println("Please Enter X2 value:  ");
      x2 = scan.nextDouble();
     
     System.out.println("Please Enter Y1 value:  ");
      y1 = scan.nextDouble();
     
     System.out.println("Please Enter Y2 value:  ");
      y2 = scan.nextDouble();
     
     result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
     System.out.println("The distance between these two points is:   " + result);
     
     
   }
   
}

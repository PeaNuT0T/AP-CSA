/******************************************************************** 
/*
/*                        Talon Huang
/*                   Programming Project 2.5
********************************************************************* */
import java.util.Scanner;

public class PP2$5
{
  public static void main(String[] args)
  {
 
    double fahr,cel;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the temperature as Fahrenheit: ");
    fahr = scan.nextDouble();
    
    cel = (fahr - 32) * 5 / 9;
    
     System.out.print("The temperature is  " + cel + " degree Celsius.");
  }
}
    
    
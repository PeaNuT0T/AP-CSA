/******************************************************************** 
/*
/*                        Talon Huang
/*                   Programming Project 2.10 
********************************************************************* */
import java.util.Scanner;
import java.text.NumberFormat;
public class pp2$10 
{ 
public static void main(String[] args) 
{ 
  int total, quarters, dimes, nickels, pennies; 

  Scanner scan = new Scanner (System.in);
  System.out.print("Enter the number of quarters in the jar: "); 
  quarters = scan.nextInt();

  System.out.print("Enter the number of dimes in the jar: ");
  dimes = scan.nextInt(); 

  System.out.print("Enter the number of nickels in the jar: ");
  nickels= scan.nextInt(); 

     System.out.print("Enter the number of pennies in the jar: ");
     pennies = scan.nextInt(); 

             int total_cents = 25 * quarters + dimes * 10 + nickels * 5 + pennies;
             total = total_cents / 100;
             total_cents = total_cents % 100;

System.out.println("Total value is " + total + " dollars and " + total_cents + " cents ");
} 
}
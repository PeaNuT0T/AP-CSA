//Primes1.java  by Talon Huang
//AP CSA
import java.util.Scanner;

public class Primes1
{
  public static void main(String[] args)
  {
    int True = 0;
    int PrimeHolder = 0;
    int[] primeList = new int[10];
    int[] nonprimeList = new int[10];
    int[] NumList = new int[10];
    int NonPrimeHolder = 0;
    while(True < 10)
    {
      int True2 = True;
      int primeTester = 1;
      int[] lowPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71};
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter 0 to exit ");
      System.out.println("Enter a number from 1¡ª5000 to check if the number is prime or not: ");
      int userInput = scan.nextInt();
      
      ////////////////////////////////////////////////////////////////////////////////////////////
      if(userInput == 0)
      {
        True = 100;
        System.out.println("GoodBye!!!");
      }
      ////////////////////////////////////////////////////////////////////////////////////////////
     
      int length = lowPrimes.length - 1;
      for(int i = 0; i <= length ; i++)
      {
       int Remainder = userInput % lowPrimes[i];   //Check to see if the number is prime or not
       if(Remainder == 0)
       {
         primeTester = 0;
       }
      }
      
      for(int i = 0; i <= length ; i++)
      {
         if(userInput == lowPrimes[i])
       {
         primeTester = 1;
       }
       }
      
      ////////////////////////////////////////////////////////////////////////////////////////////
      
      if(primeTester == 0)
      {
        System.out.println(userInput + " is not a prime number!"); 
        nonprimeList[NonPrimeHolder] = userInput;
        NonPrimeHolder = NonPrimeHolder + 1;
      }
      else
      {
        System.out.println(userInput + " is a prime number!");    //Output and creating another array
        primeList[PrimeHolder] = userInput;
        PrimeHolder = PrimeHolder + 1;
      }
      NumList[True2] = userInput;
      ////////////////////////////////////////////////////////////////////////////////////////////
      if(True == 1)
      {
      System.out.println("You have checked " + (True2 + 1) + " number ");
      }
      else
      {
        System.out.println("You have checked " + (True2 + 1) + " numbers ");
      }
      System.out.print("The numbers are " );
      for(int k : NumList)
      {
        System.out.print(k + " ");
      }
      System.out.println();
      ////////////////////////////////////////////////////////////////////////////////////////////
      
      
      System.out.print("Prime numbers you've checked:");
      for(int k : primeList)
      {
        System.out.print(k + " ");
      }
      System.out.println();
      
      True = True + 1;
      
      
      System.out.print("Non-Prime numbers you've checked:");
      for(int k : nonprimeList)
      {
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }
}
//Partner Project Soda Machine Array
//Creator: Amit Bhongiri  Talon Huang
import java.util.Scanner;

public class SodaMachine
{
  public static void main(String[] args)
  {
  Scanner scan = new Scanner(System.in);
  Location[][] drinkMachine = new Location[5][9];
  
    for(int i = 0; i < 5; i++)
    {
      for(int j = 0; j < 9; j++)
      {
        if(i == 1)
        {
        drinkMachine[i][j] = new Location("Water", 1);
        }
        else if(i == 2)
        {
        drinkMachine[i][j] = new Location("Brisk", 2);
        }
        else if(i == 3)
        {
        drinkMachine[i][j] = new Location("Latte", 3);
        }
        else if(i == 4)
        {
        drinkMachine[i][j] = new Location("Mocha", 4);
        }
        else
        {
        drinkMachine[i][j] = new Location("Pepsi", 5);
        }
      }
    }
    ///////////////////////////////// Print the inventory ///////////////////////////////////////////////////

    for(int i = 0; i < 5; i++)
    {
      System.out.println();
      System.out.println();
      for(int j = 0; j < 9; j++)
      {
      System.out.print(drinkMachine[i][j] + "  ");
      }
    }
    
     ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    int True = 1;
    int GreenBack = 0; // $$$$$$$$$$$$$$$$$
    while(True == 1)
    {
    System.out.println();
    System.out.println();
    System.out.println("Please make a choice: ");
    System.out.println("1: Select a soda ");
    System.out.println("2: Print the inventory ");
    System.out.println("3: Re-stock the machine ");
    System.out.println("4: Print the total money in the machine ");
    System.out.println("5: Take money from the machine(setting back to zero) ");
    System.out.println("6: Exit ");
    int userinput = scan.nextInt();
    
    if(userinput == 1)
    {
      System.out.println("Please enter the location:  ");
      Scanner scan1 = new Scanner(System.in);
      String userC = scan1.nextLine();
      String i = userC.substring(0,1);
      int j = Integer.parseInt(userC.substring(1,2));
      int Boom = 0;
      if(i.equals("A"))
      {
        Boom = 0;
      }
      else if(i.equals("B"))
      {
        Boom = 1;
      }
      else if(i.equals("C"))
      {
        Boom = 2;
      }
      else if(i.equals("E"))
      {
        Boom = 3;
      }
      else if(i.equals("F"))
      {
        Boom = 4;
      }
      else 
      {
        System.out.println("Please double-check your selection.");
      }
      if(drinkMachine[Boom][j].getQuantity() == 0)
      {
        System.out.println("Out of Stock");
      }
      else
      {
        drinkMachine[Boom][j].minusQuant();
        GreenBack = GreenBack + drinkMachine[Boom][j].getCost();
        System.out.println("Here is your " + drinkMachine[Boom][j].getBrandName());
      }
    }
   
////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    else if(userinput == 2)
    {
        for(int i = 0; i < 5; i++)
    {
      System.out.println();
      System.out.println();
      for(int j = 0; j < 9; j++)
      {
      System.out.print(drinkMachine[i][j] + "  ");
      }
    }
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    else if(userinput == 3)
    {
      for(int i = 0; i < 5; i++)
    {
      for(int j = 0; j < 9; j++)
      {
      drinkMachine[i][j].restock();
      }
    }
       System.out.println("Complete.");
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    else if(userinput == 4)
    {
      System.out.println("The total amount of money in the machine is $" + GreenBack);
    }
    
    else if(userinput == 5)
    {
      GreenBack = 0;
      System.out.println("Complete.");
    }
    else if(userinput == 6)
    {
      True = 0;
      System.out.println("See you.");
    }
    else 
    {
      System.out.println("Please double-check your selection.");
    }
    }
  }
  }



  

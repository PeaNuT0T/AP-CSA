// AP CSA Interface/Overload Project by Talon & Hayes
import java.util.*;
  public class DiceRunner
  {
    
    public static void main(String args[])
    {
      Dice2 diceclass = new Dice2();
      int userDice = 0;
      int userChoice = 0;
      int exit = 0;
    //  Dice2 dice = new Dice2 ();
      System.out.println("This program allows you to do:");
      System.out.println("1) Set the Key value");
      System.out.println("2) Lock the dice");
      System.out.println("3) Unlock the dice");
      System.out.println("4) See the status of the dice");
      System.out.println("5) Roll Multiple Dice");
      System.out.println("6) Exit");
      Scanner scan = new Scanner(System.in);
      while(exit == 0)
      {
      System.out.println("Which option would you like to choose: ");
      userChoice = scan.nextInt();
      /*if(userChoice > 1)
      {
      
      }*/
      
      
      if(userChoice == 1)
      {
         int inputKey = 0;
         int userNewKey = 0;
         int determination = -1;
        System.out.println("Enter the key code to modify: ");
        inputKey = scan.nextInt();
        System.out.println("Enter a new 5-digit key code: ");
        userNewKey = scan.nextInt();
        determination = diceclass.setKey(inputKey, userNewKey);// Getter for determining the accuaracy of user key code
        if(determination == 1)
        {
          System.out.println("Reset Key complete!");
        }
        else
        {
          System.out.println("Reset failed! Check your key code.");
        }
      }
      
      else if(userChoice == 2)
      {
        int inputKey = 0;
        System.out.println("Enter the key code to lock the dice: ");
        inputKey = scan.nextInt();
        diceclass.lock(inputKey);
      }
      
      else if(userChoice == 3)
      {
        int inputKey = 0;
        System.out.println("Enter the key code to unlock the dice: ");
        inputKey = scan.nextInt();
        diceclass.unlock(inputKey);
      }
      
      else if(userChoice == 4)
      {
        if(diceclass.locked())
        {
          System.out.println("The dice is locked.");
        }
        else
        {
          System.out.println("The dice is unlocked.");
        }
      }
      
      else if(userChoice == 5)
      {
        System.out.println("Choose the number of dice(1-4)");
        userDice = scan.nextInt();
        if(userDice == 1){
          System.out.println("Pick a number of sides:");
          int side1 = scan.nextInt();
           System.out.println(diceclass.rollDice(side1));
        }
        if(userDice == 2){
          System.out.println("Pick a number of sides for dice 1:");
          int side1 = scan.nextInt();
          System.out.println("Pick a number of sides for dice 2:");
          int side2 = scan.nextInt();
           System.out.println(diceclass.rollDice(side1, side2));
        }
        if(userDice == 3){
          System.out.println("Pick a number of sides for dice 1:");
          int side1 = scan.nextInt();
          System.out.println("Pick a number of sides for dice 2:");
          int side2 = scan.nextInt();
          System.out.println("Pick a number of sides for dice 3:");
          int side3 = scan.nextInt();
           System.out.println(diceclass.rollDice(side1, side2, side3));
        }
        if(userDice == 4){
          System.out.println("Pick a number of sides for dice 1:");
          int side1 = scan.nextInt();
          System.out.println("Pick a number of sides for dice 2:");
          int side2 = scan.nextInt();
          System.out.println("Pick a number of sides for dice 3:");
          int side3 = scan.nextInt();
          System.out.println("Pick a number of sides for dice 4:");
          int side4 = scan.nextInt();
          System.out.println(diceclass.rollDice(side1, side2, side3, side4));
        }
       }
      
     else if(userChoice == 6)
     {
       exit = 1;
     }
      }
    }
  }
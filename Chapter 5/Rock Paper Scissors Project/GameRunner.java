/********************************************************************************************************************/
/*******************************************   Talon Huang   AP CSA     *********************************************/
/********************************************************************************************************************/
/********************************************  Rock Paper Scissor Game  *********************************************/
/*************************************************     Runner     ***************************************************/

public class GameRunner
{
  
  
  public String TheInput;
  public static void main(String args[])
  {
    Computer bilibili = new Computer();
    UserInput input = new UserInput();
    
    int loss = 0;
    int win = 0;
    int draw = 0;
    int exe = 1;
    
    
    
    System.out.println("This game is a complex version of Rock Paper Scissors.");
    System.out.println("Your choice could only be: Rock, Paper, Scissors, Lizard, and Spock.");
    System.out.println("Enter exit to leave the game."); // Print the description
    while(exe == 1)
    {
    int randomNum = bilibili.compResult();
    String UserIn = input.getInput();
   
    
    System.out.println("Please decide your choice:  ");
    
    
    System.out.println("Your choice is " + UserIn); // Print the input
    
    // Normal Mode
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    if(UserIn.equals("rock") || UserIn.equals("paper") || UserIn.equals("lizard") || UserIn.equals("scissors") || UserIn.equals("spock"))
    {
     if(randomNum <= 2)// Rock
    {
     if(UserIn.equals("lizard"))
     {
       loss = loss + 1;
       System.out.println ("Sorry, you lost. The computer's choice is ROCK.");
       
     }
     else if(UserIn.equals("scissors"))
     {
       loss = loss + 1;
       System.out.println ("Sorry, you lost. The computer's choice is ROCK.");
       
     }
      else if(UserIn.equals("paper"))
     {
       win = win + 1;
       System.out.println ("Great, you won! The computer's choice is ROCK.");
       
     }
       else if(UserIn.equals("spock"))
     {
       win = win + 1;
       System.out.println ("Great, you won! The computer's choice is ROCK.");
       
     }
    else
    {
       draw = draw + 1;
       System.out.println ("It's a draw game. The computer's choice is ROCK.");
       
     }
       }

     else if(randomNum <= 4)// lizard
    {
     if(UserIn.equals("spock"))
     {
       loss = loss + 1;
       System.out.println ("Sorry, you lost. The computer's choice is LIZARD.");
       
     }
     else if(UserIn.equals("paper"))
     {
       loss = loss + 1;
       System.out.println ("Sorry, you lost. The computer's choice is LIZARD.");
       
     }
      else if(UserIn.equals("rock"))
     {
        win = win + 1;
       System.out.println ("Great, you won! The computer's choice is LIZARD.");
       
     }
       else if(UserIn.equals("scissors"))
     {
       win = win + 1;
       System.out.println ("Great, you won! The computer's choice is LIZARD.");
     }
    else
    {
       draw = draw + 1;
       System.out.println ("It's a draw game. The computer's choice is LIZARD.");
     }
     }
     
     else if(randomNum <= 6)// spock
    {
     if(UserIn.equals("scissors"))
     {
       loss = loss + 1;
       System.out.println ("Sorry, you lost. The computer's choice is SPOCK.");
       
     }
     else if(UserIn.equals("rock"))
     {
       loss = loss + 1;
       System.out.println ("Sorry, you lost. The computer's choice is SPOCK.");
       
     }
      else if(UserIn.equals("lizard"))
     {
        win = win + 1;
       System.out.println ("Great, you won! The computer's choice is SPOCK.");
       
     }
       else if(UserIn.equals("paper"))
     {
       win = win + 1;
       System.out.println ("Great, you won! The computer's choice is SPOCK.");
     }
    else
    {
       draw = draw + 1;
       System.out.println ("It's a draw game. The computer's choice is SPOCK.");
     }
     }
     
     else if(randomNum <= 8)// scissors
    {
     if(UserIn.equals("paper"))
     {
       loss = loss + 1;
       System.out.println ("Sorry, you lost. The computer's choice is SCISSORS.");
       
     }
     else if(UserIn.equals("lizard"))
     {
       loss = loss + 1;
       System.out.println ("Sorry, you lost. The computer's choice is SCISSORS.");
     }
      else if(UserIn.equals("rock"))
     {
        win = win + 1;
       System.out.println ("Great, you won! The computer's choice is SCISSORS.");
       
     }
       else if(UserIn.equals("spock"))
     {
       win = win + 1;
       System.out.println ("Great, you won! The computer's choice is SCISSORS.");
     }
    else
    {
       draw = draw + 1;
       System.out.println ("It's a draw game. The computer's choice is SCISSORS.");
     }
     }
     
     else// paper
    {
     if(UserIn.equals("rock"))
     {
       loss = loss + 1;
       System.out.println ("Sorry, you lost. The computer's choice is PAPER.");
       
     }
     else if(UserIn.equals("spock"))
     {
       loss = loss + 1;
       System.out.println ("Sorry, you lost. The computer's choice is PAPER.");
     }
      else if(UserIn.equals("scissors"))
     {
        win = win + 1;
       System.out.println ("Great, you won! The computer's choice is PAPER.");
       
     }
       else if(UserIn.equals("lizard"))
     {
       win = win + 1;
       System.out.println ("Great, you won! The computer's choice is PAPER.");
     }
    else
    {
       draw = draw + 1;
       System.out.println ("It's a draw game. The computer's choice is PAPER.");
     }
    
  }
    }
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    else if(UserIn.equals("exit"))
    {
      System.out.println ("You won " + win + "games.");
      System.out.println ("You lost " + loss + "games.");
      System.out.println ("You tied " + draw + "games.");
      exe = 2;
    }
     
     
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // CHEAT CODE MODE
 
    else if(UserIn.equals("talon"))
    {
    System.out.println("Welcome to CHEAT MODE!!!!!  ");
    String Cheat = input.getInput();  
    System.out.println("Please decide your choice:  ");
    System.out.println("Your choice is " + UserIn); // Print the input
    
      if(Cheat.equals("rock"))
      {
      System.out.println ("Great, you won! The computer's choice is LIZARD.");
      }
      else if(Cheat.equals("scissors"))
      {
      System.out.println ("Great, you won! The computer's choice is PAPER.");
      }
      else if(Cheat.equals("paper"))
      {
      System.out.println ("Great, you won! The computer's choice is ROCK.");
      }
      else if(Cheat.equals("lizard"))
      {
      System.out.println ("Great, you won! The computer's choice is PAPER.");
      }
      else if(Cheat.equals("spock"))
      {
      System.out.println ("Great, you won! The computer's choice is ROCK.");
    }
    else
    {
      System.out.println ("I don't understand.");
    }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    

}
}
}
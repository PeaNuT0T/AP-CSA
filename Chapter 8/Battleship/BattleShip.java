// Battleship.java by Talon Huang

import java.util.*;

public class BattleShip
{
  //Rules and Check
  //This game is user vs computer version battleship (there are bugs that haven't been solved)
  //Please choose two adjacent location
  
  public int checkwinner(location[][] userBoard)
  {
    return 0;
  }
  
  
  //Method of printing the 3x3 Game Board
  public static void printBoard(location[][] userBoard){
    for(int row=0;row<3;row++){    
      System.out.print("\n"+ row + "|");
      for(int col=0;col<3;col++)
      {
        System.out.print(userBoard[row][col]+"|");    
      }
    }
    System.out.println("\n |A|B|C|");
  }
  public static void main(String[] args)
  {
    
    Random rand = new Random();
    location[][] userboard = new location[3][3];
    location[][] compboard = new location[3][3];
    for(int row=0;row<3;row++)
    {
      for(int col=0;col<3;col++)
      {
        userboard[row][col]=new location();
      }
    }
    
    for(int row=0;row<3;row++)
    {
      for(int col=0;col<3;col++)
      {
        compboard[row][col]=new location();
      }
    }
    
    System.out.println("\nCOMPUTER SHIP: ");
    printBoard(userboard);
    System.out.println("\nUSER SHIP: ");
    printBoard(compboard);
    
    
    Scanner Numscan = new Scanner(System.in);
    Scanner Letterscan = new Scanner(System.in);
    // USER INPUT
    System.out.println("Enter your first ship's  row:  ");
    int UserShip_row = Numscan.nextInt();
    int UserShip_column = -1;
    System.out.println("Enter your first ship's  column:  ");
    String a = Letterscan.nextLine();
    if(a.equals("A")) // Convert column letter into integer
    {
      UserShip_column = 0;
    }
    else if(a.equals("B"))
    {
      UserShip_column = 1;
    }
    else if(a.equals("C"))
    {
      UserShip_column = 2;
    }
    System.out.println("Enter your second ship's  row:  ");
    int UserShip_row2 = Numscan.nextInt();
    int UserShip_column2 = -1;
    System.out.println("Enter your second ship's  column:  ");
    String a1 = Letterscan.nextLine();
    if(a1.equals("A")) // Convert column letter into integer
    {
      UserShip_column2 = 0;
    }
    else if(a1.equals("B"))
    {
      UserShip_column2 = 1;
    }
    else if(a1.equals("C"))
    {
      UserShip_column2 = 2;
    }
    if(UserShip_row2 != UserShip_row && UserShip_column2 != UserShip_column)
    {
      System.out.println("Warning: Please Choose a Straight Line!!!");
    }
    //compboard[UserShip_row][UserShip_column].setS();
    //compboard[UserShip_row2][UserShip_column2].setS();
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                                                                                           //
    //                                  Computer Random Decision Code                                            //
    //                                                                                                           //
    //                                                                                                           //
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    int CompShip_row = rand.nextInt(3);
    int CompShip_column = rand.nextInt(3);
    int CompShip_column2;
    int CompShip_row2;
    if((CompShip_row == 0)&&(CompShip_column == 0))
    {
      CompShip_row2 = 1;
      CompShip_column2 = 0;
    }
    else if((CompShip_row == 2)&&(CompShip_column == 0))
    {
      CompShip_row2 = 2;
      CompShip_column2 = 1;
    }
    else if((CompShip_row == 2)&&(CompShip_column == 2))
    {
      CompShip_row2 = 2;
      CompShip_column2 = 1;
    }
    else if((CompShip_row == 0)&&(CompShip_column == 2))
    {
      CompShip_row2 = 1;
      CompShip_column2 = 2;
    }
    else if((CompShip_row == 1)&&(CompShip_column == 1))
    {
      CompShip_row2 = 1;
      CompShip_column2 = 0;
    }
    else
    {
      CompShip_row2 = CompShip_row + 1;
      CompShip_column2 = CompShip_column;
    }
    
    
    //userboard[CompShip_row][CompShip_column].setS();
    // userboard[CompShip_row2][CompShip_column2].setS();
    
    System.out.println("\nCOMPUTER SHIP: ");
    printBoard(userboard);
    System.out.println("\nUSER SHIP: ");
    printBoard(compboard);
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    while(true)
    {
      System.out.println("Now enter your row for guess 1:  ");
      int UserGuess_row = Numscan.nextInt();
      System.out.println("Now enter your column for guess 1:  ");
      int UserGuess_Column = -1900;
      String a2 = Letterscan.nextLine();
      if(a2.equals("A")) // Convert column letter into integer
      {
        UserGuess_Column = 0;
      }
      else if(a2.equals("B"))
      {
        UserGuess_Column = 1;
      }
      else if(a2.equals("C"))
      {
        UserGuess_Column = 2;
      }
      //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      if((UserGuess_row == CompShip_row)&&(UserGuess_Column == CompShip_column))
      {
        userboard[UserGuess_row][UserGuess_Column].setH();
      }
      else if((UserGuess_row == CompShip_row2) && (UserGuess_Column == CompShip_column2))
      {
        userboard[UserGuess_row][UserGuess_Column].setH();
      }
      else
      {
        userboard[UserGuess_row][UserGuess_Column].setM();
      }
      
      
      
      
      int checkpoint = 1;
      while(checkpoint == 1)
      {
        int CompGuess_row = rand.nextInt(2);
        int CompGuess_Column = rand.nextInt(2);
        String token = compboard[CompGuess_row][CompGuess_Column].getToken();
        if(token.equals(" "))
        {
          if((CompGuess_row == UserShip_row)&&(CompGuess_Column == UserShip_column))
          {
            compboard[CompGuess_row][CompGuess_Column].setH();
          }
          else if((CompGuess_row == UserShip_row2)&&(CompGuess_Column == UserShip_column2))
          {
            compboard[CompGuess_row][CompGuess_Column].setH();
          }
          else
          {
            compboard[CompGuess_row][CompGuess_Column].setM();
          }
          checkpoint = 0;
        }
      }
      System.out.println("\nCOMPUTER SHIP: ");
      printBoard(userboard);
      System.out.println("\nUSER SHIP: ");
      printBoard(compboard);
    }
    
    
    
    
  }
}
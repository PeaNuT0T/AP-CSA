// Connect Four Partner Project
// By Talon Huang & Nick Gong
import java.util.*;
public class ConnectFour
{
  //Print the 6x7 Game Board
  public static void printBoard(location[][] gameBoard){
    for(int row=0;row<6;row++){    
      System.out.print("\n|");
      for(int col=0;col<7;col++){
        System.out.print(gameBoard[row][col]+"|");
      }
    }
    System.out.println("\n|1|2|3|4|5|6|7|");
  }
  
  //Check winning condition
  public static String checkWin(location[][] gameBoard)
  {
    String winner = "";    
    //vertical
    for(int col=0;col<7;col++){
      for(int row=0;row<3;row++){
        if(gameBoard[row][col].getToken().equals(gameBoard[row+1][col].getToken())){
          if(gameBoard[row+1][col].getToken().equals(gameBoard[row+2][col].getToken())){
            if(gameBoard[row+2][col].getToken().equals(gameBoard[row+3][col].getToken())){
              if(gameBoard[row][col].getToken().equals("X")){
                winner="Player 1";
              }
              else if((gameBoard[row][col].getToken().equals("O"))){
                winner="Player 2";
              }}}}}
    }
    
    //horizontal
    for(int row=0;row<6;row++){
      for(int col=0;col<4;col++){
        if(gameBoard[row][col].getToken().equals(gameBoard[row][col+1].getToken())){
          if(gameBoard[row][col+1].getToken().equals(gameBoard[row][col+2].getToken())){
            if(gameBoard[row][col+2].getToken().equals(gameBoard[row][col+3].getToken())){
              if(gameBoard[row][col].getToken().equals("X")){
                winner="Player 1";
              }
              else if((gameBoard[row][col].getToken().equals("O"))){
                winner="Player 2";
              }}}}}
    }
    
    //Diagonal "\"
    for(int row=0;row<3;row++){
      for(int col=0;col<4;col++){
        if(gameBoard[row][col].getToken().equals(gameBoard[row+1][col+1].getToken())){
          if(gameBoard[row+1][col+1].getToken().equals(gameBoard[row+2][col+2].getToken())){
            if(gameBoard[row+2][col+2].getToken().equals(gameBoard[row+3][col+3].getToken())){
              if(gameBoard[row][col].getToken().equals("X")){
                winner="Player 1";
              }
              else if((gameBoard[row][col].getToken().equals("O"))){
                winner="Player 2";
              }}}}}
    }
    //Diagonal 2 "/"
    for(int row=0;row<3;row++){
      for(int col=6;col>2;col--){
        if(gameBoard[row][col].getToken().equals(gameBoard[row+1][col-1].getToken())){
          if(gameBoard[row+1][col-1].getToken().equals(gameBoard[row+2][col-2].getToken())){
            if(gameBoard[row+2][col-2].getToken().equals(gameBoard[row+3][col-3].getToken())){
              if(gameBoard[row][col].getToken().equals("X")){
                winner="Player 1";
              }
              else if((gameBoard[row][col].getToken().equals("O"))){
                winner="Player 2";
              }}}}}
    }
    
    return(winner);
  }
  
  public static void main(String[] args){
    //Initialize the board(6x7 array)
    location[][] board = new location[6][7];
    for(int row=0;row<6;row++)
    {
      for(int col=0;col<7;col++)
      {
        board[row][col]=new location();
      }
    }
    printBoard(board);
    int movechecker = 0; // Track moves;
    Scanner input = new Scanner(System.in);
    //While loop continues only when the winner is undetermined
    while(checkWin(board).equals("")){
      
      if(checkWin(board).equals("")){
        //Player 1's move
        System.out.println("Player 1 please enter a column.(1-7)");
        int p1col = input.nextInt()-1;
        int p1row=5;
        while(board[p1row][p1col].getToken().equals("X")||board[p1row][p1col].getToken().equals("O")){
          p1row-=1;
        }
        board[p1row][p1col].setX();
        printBoard(board);
        movechecker++;
        System.out.println("This is Move " + movechecker + ".");
      }
      //Player 2's move
      if(checkWin(board).equals("")){
        System.out.println("Player 2 please enter a column.(1-7)");
        int p2col = input.nextInt()-1;
        int p2row=5;
        while(board[p2row][p2col].getToken().equals("X")||board[p2row][p2col].getToken().equals("O")){
          p2row-=1;
        }
        board[p2row][p2col].setO();
        printBoard(board);
        movechecker++;
        System.out.println("This is Move " + movechecker + ".");
      }
    }
    movechecker = 0;
    System.out.println("Game over! The winner is "+checkWin(board)+"!");
    System.out.println("(Confetti shoot from the computer's disk drive)");
    
  }
}
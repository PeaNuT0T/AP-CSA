/********************************************************************************************************************/
/*******************************************   Talon Huang   AP CSA     *********************************************/
/********************************************************************************************************************/
/********************************************  Rock Paper Scissor Game  *********************************************/
/***********************************************     User Input     *************************************************/
import java.util.Scanner; 

public class UserInput
{
  public String userinput;
  Scanner scan = new Scanner(System.in);// Call Scanner class
  
  public String getInput()// Create a method to get user's input
  {
    userinput = scan.nextLine();
    return userinput.toLowerCase();
  }
}
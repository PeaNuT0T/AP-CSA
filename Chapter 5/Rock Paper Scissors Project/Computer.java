/********************************************************************************************************************/
/*******************************************   Talon Huang   AP CSA     *********************************************/
/********************************************************************************************************************/
/********************************************  Rock Paper Scissor Game  *********************************************/
/*************************************************     Computer     *************************************************/
import java.lang.Math;

public class Computer
{
  // define the results

  UserInput input = new UserInput();
   // define the range 
        int max = 10; 
        int min = 1; 
        int range = max - min + 1; 
  
       
  public int compResult()
  {
     // generate random numbers within 1 to 10 
     int rand = (int)(Math.random() * range) + min;  
     return rand;
   }
  }
  
  

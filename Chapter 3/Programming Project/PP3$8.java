//*********************************************************************************************************************
//**********************************************   Talon Huang   ******************************************************
//*********************************************************************************************************************
//**************************************************  PP 3.8  *********************************************************
//*********************************************************************************************************************
//*********************************************************************************************************************

import java.lang.Math;
import java.util.Random;

public class PP3$8
{
  //---------------------------------------------------------------------------
  //  This program prints a random number and calculates its trig values  -----
  //---------------------------------------------------------------------------

public static void main(String args[])
{
  Random generator = new Random();
  int num;
  
  num = generator.nextInt(20) + 20;
  System.out.println("The random integer number is:  " + num);// print a random integer number between 20 and 40
  
  double sinValue = Math.sin(num);
  double cosValue = Math.cos(num);
  double tanValue = Math.tan(num);
  // create three variables for trig values
  System.out.println("The random number's Sin value is :  " + sinValue);
    System.out.println("The random number's Cos value is :  " + cosValue);
      System.out.println("The random number's Tan value is :  " + tanValue);
      
}
}
  
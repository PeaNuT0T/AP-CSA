/************************************************************************************************************/
/***************************************    OOP Calculator    **********************************************/
/****************************************     Calculator Class       **************************************/
/*******************************************    Talon Huang        ***************************************/
/*********************************************     AP CSA              **********************************/

import java.math.*;
import java.lang.*;
import java.util.*;
// This is a calculator for business£¨for profit, appreciation, loan, and tax)
public class Calculator
{

 //Constructor
  public Calculator()
  { 
  }
  
  public double Profit_Calc(double Amount, double Total_Expanse, double Cost, double Rate)
  {
    Amount = Amount - Total_Expanse - Cost - Rate / 100 * (Amount - Total_Expanse - Cost);
    return Amount;
  }
  public double App_Calc(double Amount, double Period, double Rate)
  {
    Amount = Amount * Math.pow((1+ Rate/100), Period);
    return Amount;
  }
  public double Loan_Calc(double Amount, double Period, double Rate)
  {
    Amount = (Rate / 100 * Amount) / (1 - Math.pow((1 + Rate/100),-1 * Period));
    return Amount;
  }
  public double Tax_Calc(double Amount, double Rate)
  {
   Amount = Amount * Rate/100; 
   return Amount;
  }
}
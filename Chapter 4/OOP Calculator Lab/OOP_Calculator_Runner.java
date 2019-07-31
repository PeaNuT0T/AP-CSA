/*************************************************************************************************************/
/***************************************    OOP Calculator    ************************************************/
/****************************************        Runner Class       ******************************************/
/*******************************************        Talon Huang        ***************************************/
/*********************************************          AP CSA              **********************************/

// This is a calculator for business£¨for profit, appreciation, loan, and tax)
import java.util.Scanner;
import java.text.DecimalFormat;


public class OOP_Calculator_Runner
{
public static void main(String[] args){
   DecimalFormat fmt = new DecimalFormat("0.###");
   Calculator calc = new Calculator();
  
    int determination = 0; //Create an integer to end the code
    while(determination == 0){
    String choice; //Create a string input to let users determine calculation
    double amount = 0, rate = 0, cost = 0, total_expanse = 0;
    double period = 0; //Create input variables  
    
    //print out a message to the user
    System.out.println("\nThis is a calculator for business£¨profit, appreciation, loan, and tax)");
    
    //creates an instance of the Scanner class
    Scanner reader = new Scanner(System.in);
    
    //gets user's choice of calculation
    System.out.println("Choose the shape you would like to choose: \n A)Profit & Loss   B)Appreciation   C)Loan   D)Tax");
    choice = reader.nextLine();
    choice = choice.toLowerCase();
  
  
//Different types of inputs
    if(choice.equals("a")){
      System.out.println("Enter your total sales: ");
      amount = reader.nextDouble();
      System.out.println("Enter the tax rate (Sales Tax, GST or VAT) in percentage:   " + "%" );
      rate = reader.nextDouble();
      System.out.println("Enter the cost of sales: ");
      cost = reader.nextDouble();
      System.out.println("Enter your total expanses: ");
      total_expanse = reader.nextDouble();
      
      amount = calc.Profit_Calc(amount, total_expanse, cost, rate);
      System.out.println("Your profit would be: $" + fmt.format(amount));
      
      
    }
    
    else if(choice.equals("b")){
      System.out.println("Enter the Starting Value: ");
      amount = reader.nextDouble();
      System.out.println("Enter the Appreciation Rate: ");
      rate = reader.nextDouble();
      System.out.println("Enter the Time Period: ");
      period = reader.nextDouble();
      
      amount = calc.App_Calc(amount, period, rate);
      System.out.println("Your appreciation would be: $" + fmt.format(amount));
    }
    
    else if(choice.equals("c")){
      System.out.println("Enter the Loan amount: ");
      amount = reader.nextDouble();
      System.out.println("Enter Loan term in years: ");
      period = reader.nextDouble(); 
      System.out.println("Enter the Interest rate per year: ");
      rate = reader.nextDouble();
      
      amount = calc.Loan_Calc(amount, period, rate);
      System.out.println("Your loan would be: $" + fmt.format(amount));
    }
    
    else if(choice.equals("d")){
      System.out.println("Enter the amount: ");
      amount = reader.nextDouble();
      System.out.println("Enter the tax rate in percentage:   %");
      rate = reader.nextDouble();
      
      amount = calc.Tax_Calc(amount, rate);
      System.out.println("Your tax would be: $" + fmt.format(amount));
    }
    
    else if(choice.equals("exit")){
      determination ++;
    }
  
      else
      {
        System.out.println("Error. Please double check your input. ");
      }
      
        //create an instance of the calculation class
 
      
      
    }
  }
   }


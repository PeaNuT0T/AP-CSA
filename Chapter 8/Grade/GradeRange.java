//  GradeRange.java 
import java.io.*;
import java.util.Scanner;
public class GradeRange
{
  //-----------------------------------------------------------------
  //  Creates an array of Grade objects and prints them.
  //-----------------------------------------------------------------
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Scanner scan1 = new Scanner(System.in);
    Grade[] grades =
    {
      new Grade("A", 95), new Grade("A-", 90),
      new Grade("B+", 87), new Grade("B", 85), new Grade("B-", 80),
      new Grade("C+", 77), new Grade("C", 75), new Grade("C-", 70),
      new Grade("D+", 67), new Grade("D", 65), new Grade("D-", 60),
      new Grade("F", 0)
    };
    while(true)
    {
      System.out.println("Make a choice:  ");
      System.out.println("1: Change one of the objects name string and lowerbound int values  ");
      System.out.println("2: Change each name field in each grades Grade object to lower case  ");
      System.out.println("3: Directly set the name field in the first Grade object of the array grades to the letter ¡®R¡¯ ");
      System.out.println("4: Create a new Grade object called newGrade, aliased to the second Grade object in the grades array. ");
      System.out.println("5: Print the grades array using a for loop ");
      int userChoice = scan.nextInt();
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
      if(userChoice == 1)
      {
        System.out.println("Please enter the name:  ");
        String name = scan1.nextLine();
        System.out.println("Please enter the lowerbound int values:  ");
        int lowerB = scan.nextInt();
        
        System.out.println("Choose an object that you want to change");
        System.out.println("0: A");
        System.out.println("1: A-");
        System.out.println("2: B+");
        System.out.println("3: B");
        System.out.println("4: B-");
        System.out.println("5: C+");
        System.out.println("6: C");
        System.out.println("7: C-");
        System.out.println("8: D+");
        System.out.println("9: D");
        System.out.println("10: D-");
        System.out.println("11: F");
        int pos = scan1.nextInt();
        
        grades[pos].setName(name);
        grades[pos].setLowerBound(lowerB);
        System.out.println("Complete.  ");
        System.out.println("The name you entered is " + name + ", and the lowerbound is " + lowerB + ".");
        System.out.println();
        for (Grade letterGrade : grades)
        {
          System.out.println(letterGrade);
        }
        System.out.println();
      }
      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
      else if(userChoice == 2)
      {
        for(int k = 0; k < grades.length; k++)
        {
          grades[k].setName(grades[k].toString().toLowerCase());
        }
        System.out.println("Complete.  ");
        System.out.println();
        for (Grade letterGrade : grades)
        {
          System.out.println(letterGrade);
        }
        System.out.println();
      }
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
      else if(userChoice == 3)
      {
        grades[0].setName("R");
        System.out.println("Complete.  ");
        for (Grade letterGrade : grades)
        {
          System.out.println(letterGrade);
        }
        System.out.println();
      }
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
      else if(userChoice == 4)
      {
        Grade newGrade = new Grade("S", 90);
        newGrade = grades[1];
        newGrade.setName("S");
        for (Grade letterGrade : grades)
        {
          System.out.println(letterGrade);
        }
        System.out.println();
      }
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
      else if(userChoice == 5)
      {
        int Len =  grades.length;
        for (int ko = 0; ko < Len ; ko++)
        {
          System.out.println(grades[ko]);
        }
        System.out.println();
      }
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
      else
      {
        System.out.println("Error.");
      }
    }
  }
}

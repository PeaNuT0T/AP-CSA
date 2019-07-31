//  Talon Huang
//  DailyTemperatureStats

import java.util.*;  // needed for Scanner and ArrayList
import java.io.*;  // needed for text file reading

public class DailyTemperatureStats
{
  public static void main (String[] args) throws IOException  //throws required for the file scan to work
  {
    Scanner fileScan, lineScan; 
    String fileName;
    int value;           // pulling in the integer values
    int total = 0;
    int userinput;
    int a = 1; // needed for shutting down the program
    
    Scanner scan = new Scanner (System.in);
    ArrayList<Integer> bazinga = new ArrayList<Integer>();
    //setting the file to scan properly with direct reference
    System.out.print ("Enter the filename (with no filename extension): ");
    fileName = scan.nextLine();
    fileScan = new Scanner (new File(fileName + ".txt"));
    
    lineScan = new Scanner(fileScan.nextLine());  
    lineScan.useDelimiter(",");  // per saved data style

      while (lineScan.hasNext())  // looping to check all data in file
      {
       value = lineScan.nextInt();  
       bazinga.add(value);  // prints out each value as read
       total = total + value;
      }
      while(a == 1)
      {
      System.out.println("Please select your choice: ");
      System.out.println("1. Find min and max");  
      System.out.println("2. Determine a range and find the average"); 
      System.out.println("3. Toggle between Celsius and Fahrenheit."); 
      System.out.println("4. Print the entire list"); 
      System.out.println("5. Exit"); 
      userinput = scan.nextInt(); // Create instructions and get user input
      
      int i = 0;                 // Find maximum
          int max = bazinga.get(0);
          do{
          if(max < bazinga.get(i+1))
          {
            max = bazinga.get(i+1);
            i++;
          }
          else
          {
            i++;
          }
        }while(i < bazinga.size() - 1);
         int maxpos = bazinga.indexOf(max) + 1; // get the index of minimum
         
          int k = 0;                          // Find minimum
          int min = bazinga.get(0);
          do{
          if(min > bazinga.get(k+1))
          {
            min = bazinga.get(k+1);
            k++;
          }
          else
          {
            k++;
          }
        }while(k < bazinga.size() - 1);
         int minpos = bazinga.indexOf(min) + 1; // get the index of minimum
      
      
      switch(userinput)
      {
        case 1: // Find min and max
         System.out.println("The maximum temperature is: " + max + " degree at " + maxpos + ":00.");
         System.out.println("The maximum temperature is: " + min + " degree at " + minpos + ":00.");
         System.out.println();
         break;
         
        case 2:
          int userChoice, avrg;
          int totalTemp = 0;
          System.out.println("Determine the range");  
          System.out.println("Choice 1: 1:00 ¨C 24:00");
          System.out.println("Choice 2: 1:00 - 10:00 ");
          System.out.println("Choice 3: 11:00 - 14:00");
          System.out.println("Choice 4: 15:00 - 24:00");
          userChoice = scan.nextInt();//get userinput
        if(userChoice == 1)
        {
          for(i=0; i<24; i++)
          {
            totalTemp = totalTemp + bazinga.get(i);
          }
          avrg = totalTemp / 24;
          System.out.println("The average temperature is " + avrg + " degree.");
          System.out.println();
        }
        else if(userChoice == 2)
        {
          for(i=0; i<9; i++)
          {
            totalTemp = totalTemp + bazinga.get(i);
          }
          avrg = totalTemp / 9;
          System.out.println("The average temperature is " + avrg + " degree.");
          System.out.println();
        }
        else if(userChoice == 3)
        {
          for(i=10; i<13; i++)
          {
            totalTemp = totalTemp + bazinga.get(i);
          }
          avrg = totalTemp / 3;
          System.out.println("The average temperature is " + avrg + " degree.");
          System.out.println();
        }
        else if(userChoice == 3)
        {
          for(i=14; i<23; i++)
          {
            totalTemp = totalTemp + bazinga.get(i);
          }
          avrg = totalTemp / 9;
          System.out.println("The average temperature is " + avrg + " degree.");
          System.out.println();
        }
         else
         {
           System.out.println("Bazinga!");
           System.out.println();
         }
         break;
         
        case 3:
      
          System.out.println("Choose 1: Toggle to Fahrenheit.");
          System.out.println("Choose 2: Toggle to Celsius.");
          userChoice = scan.nextInt();//get userinput
          
          if(userChoice == 1) // Toggle to Fahrenheit
          {
            for(i=0;i<24;i++)
            {
              bazinga.set(i,  bazinga.get(i) * 9 / 5 + 32 ) ;
            }
            System.out.println("The temperature in Fahrenheit:  ");
            for(i = 0; i < bazinga.size(); i++) 
            {   
              System.out.print(bazinga.get(i));
              System.out.println();
            }
            
          }
          else if(userChoice == 2) // Toggle to Celsius
          {
            for(i=0;i<24;i++)
            {
              bazinga.set(i, ( bazinga.get(i) - 32 ) * 5 / 9);
            }
            
            System.out.println("The temperature in Celsius:  ");
            for(i = 0; i < bazinga.size(); i++) 
            {   
              System.out.print(bazinga.get(i));
              System.out.println();
            }
          }
          else
          {
           System.out.println("Bazinga!");
           System.out.println();
          }
          break;
          
        case 4: //Print out the list
          System.out.println("Here is the list!");
          for(i = 0; i < bazinga.size(); i++) 
            {   
              System.out.print(bazinga.get(i));
              System.out.println();
            }
          break;
          
        case 5: // Exit the program
          System.out.println("Goodbye!");
          System.out.println("Bazinga!");
           System.out.println();
          a = 0;
          break;
          
        default:
           System.out.println("Bazinga!");
           System.out.println();
          
      }
      }
  }

}
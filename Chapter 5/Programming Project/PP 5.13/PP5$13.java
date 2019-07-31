// Talon Huang
// AP CSA
// Programming Project 5.13


import java.io.*;
import java.util.Scanner;
public class PP5$13 {
  
    public static void main(String[] args) throws IOException 
    {
      String file1, file2;
      Scanner file1Scan, file2Scan;
      
      file1Scan = new Scanner(new File("f1.txt"));
      file2Scan = new Scanner(new File("f2.txt"));
      
      while(file1Scan.hasNext()||file2Scan.hasNext())
      {
        file1 = file1Scan.nextLine();
        file2 = file2Scan.nextLine();
        
        if(!file1.equals(file2))
        {
          System.out.println(file1);
          System.out.println(file2);
        }
      }
    }
}
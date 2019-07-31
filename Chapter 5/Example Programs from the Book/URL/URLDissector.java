//*********************************************************************************************************************
// Talon Huang   AP CSA
//
// URLDissector from the book.
//*********************************************************************************************************************

import java.util.Scanner;
import java.io.*;

public class URLDissector
{
  public static void main(String[] args) throws IOException
  {
    String url;
    Scanner fileScan, urlScan;
    
    fileScan = new Scanner(new File("urls.inp"));
    
    while(fileScan.hasNext())
    {
      url = fileScan.nextLine();
      System.out.println("URL: " + url);
      
      urlScan = new Scanner(url);
      urlScan.useDelimiter("/");
      
      while(urlScan.hasNext())
      {
        System.out.println(" " + urlScan.next());
      }
      
      System.out.println();
    }
  }
}

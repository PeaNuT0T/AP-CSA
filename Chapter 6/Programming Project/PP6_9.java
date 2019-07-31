// Programming Project 6.9
// Talon Huang 
// AP CSA
import java.util.*;
public class PP6_9{
  public static void main(String args[])
  {
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter your word to count the number of vowels and nonvowel characters:");
  String userinput1 = scan.nextLine();// Get user input
  String userinput = userinput1.toLowerCase();
  int VowelCount = 0, aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
  for(int i = 0; i < userinput.length(); i++)
  {
    String a = userinput.substring(i, i+1);
    if(a.equals("a")||a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u"))
    {
      VowelCount++;
      if(a.equals("a"))           // Checker for vowels and count the number of them
      {
        aCount++;
      }
      else if(a.equals("e"))
      {
        eCount++;
      }
      else if(a.equals("i"))
      {
        iCount++;
      }
      else if(a.equals("o"))
      {
        oCount++;
      }
      else
      {
        uCount++;
      }
    }
  } 
  int nonVowelCount = userinput.length() - VowelCount;
  System.out.println("Your word has " + VowelCount + " vowels plus " + nonVowelCount + " nonvowel characters");
  System.out.println("Your word has " + aCount + " letter A, " + eCount + " letter E, " + iCount + " letter I, " + oCount + " letter O, ");
  System.out.println("and " + uCount + " letter U, ");
    
}
}
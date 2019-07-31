// Chp6 Loops Worksheet
// Talon Huang 
// AP CSA 
import java.util.*;
public class loopsWorksheet
{
  public static void main(String args[]){
   ArrayList<String> Bazinga = new ArrayList<String>();
   int count = 0; // Exercise 1
   Bazinga.add("T");   // Create an ArrayList
   Bazinga.add("A");
   Bazinga.add("L");
   Bazinga.add("O");
   Bazinga.add("N");
   Bazinga.add(" ");
   Bazinga.add("H");
   Bazinga.add("U");
   Bazinga.add("A");
   Bazinga.add("N");
   Bazinga.add("G");
   while(count < 11)
   {
     System.out.print(Bazinga.get(count));// Print the elements from the arraylist
       count++;
   }
   System.out.println("");
   System.out.println("");
   int k = 0; // Exercise 2
   while(k<=10)
   {
     System.out.println(10 - k);// Countdown
     k++;
  }
   System.out.println("Blast Off!");
   
  
   
   System.out.println(""); // Exercise 3 For-Loop Countdown
   int j;
   for(j=0; j<11; j++)
   {
     System.out.println(10 - j);
  }
   
   ArrayList<String> BirthdayPartyItems = new ArrayList<String>();// Exercise 4 Birthday Party 
   BirthdayPartyItems.add("Candles");
   BirthdayPartyItems.add("Posters");
   BirthdayPartyItems.add("Xbox One X");
   BirthdayPartyItems.add("Flags");
   BirthdayPartyItems.add("Banner");
   BirthdayPartyItems.add("Ballons");
   BirthdayPartyItems.add("Cake");
   BirthdayPartyItems.add("Birthday Hat");
   BirthdayPartyItems.add("Food");
   BirthdayPartyItems.add("Plates");
   int count1;
   for(count1 = 0; count1 < 10; count1++)
   {
     System.out.println(BirthdayPartyItems.get(count1));
   }
   
   int count2 = 2; // Exercise 5 Using a while loop to print even numbers from 1 to 50
   while(count2 <= 50)
   {
     if(count2 % 2 == 0)
     {
       System.out.println(count2);
       count2++;
     }
     else{
       count2++;
     }
     
   }
   
   int count3 = 1; // Exercise 6 Using a while loop to print odd numbers from 1 to 50
   while(count3 <= 50)
   {
     if(count3 % 2 != 0)
     {
       System.out.println(count3);
       count3++;
     }
     else{
       count3++;
     }
   }
   
   String bigword = "parsimonious";// Exercise 7 Count the number of letters in a big word
   int last = bigword.length() - 1;
   int count4 = 0;
   while(count4 <= last)
   {
     count4++;
   }
   System.out.println("The big word has " + count4 + " words.");
   
   String longword = "circumlocution";
   int count5 = 0;
   int wordcount = 0;
   while(count5 < longword.length())// Exercise 8 Count the number of a specific letter (C) in a long word
   {
     if(longword.substring(count5, count5+1).equals("c"))
     {
       wordcount++;
       count5++;
     }
     else
     {
       count5++;
     }
   }
   System.out.println(longword + " has " + wordcount + " \"C\"s.");
   
   
  Random gen = new Random();// Exercise 9 Grades
  ArrayList<Integer> Genghis = new ArrayList<Integer>();
  int thenumber;
  int count6 = 0;
  while(count6 <= 25) // Generate some random grades
  {
    thenumber = gen.nextInt(100);
    Genghis.add(thenumber);
    count6++;
  }
  for(thenumber=0;thenumber<Genghis.size();thenumber++)
  {
    System.out.println(Genghis.get(thenumber)+"%");
  }
  int total1 = 0;
  
  for(thenumber=0;thenumber<Genghis.size();thenumber++) // Get total grade
  {
   total1 +=  Genghis.get(thenumber);
  }
  int avg = total1 / Genghis.size();
  System.out.println("The average grade is " + avg + "%"); // Print the average
  int countF = 0, countA = 0, countB = 0, countC = 0, countD = 0;
  for(thenumber = 0; thenumber<Genghis.size();thenumber++)
  {
    if(Genghis.get(thenumber) >= 90)
    {
      countA++;
    }
    else if(Genghis.get(thenumber) >= 80)
    {
      countB++;
    }
    else if(Genghis.get(thenumber) >= 70)
    {
      countC++;
    }
    else if(Genghis.get(thenumber) >= 60)
    {
      countD++;
    }
    else
    {
      countF++;
    }
  }
  System.out.println("There are " + countA + " A grades," + countB + " B grades," + countC + " C grades," + countD + " D grades," + " and " + countF + " F grades,");
   
  System.out.println( );
  System.out.println(  );
  /////////////  Exercise 10   ////////////////////
  ArrayList<String> MovieStars = new ArrayList<String>();
  MovieStars.add("Robert De Niro");
  MovieStars.add("Jack Nicholson");
  MovieStars.add("Leonardo DiCaprio");
  MovieStars.add("Tom Hanks");
  MovieStars.add("Johnny Depp");
  MovieStars.add("Mao Zedong");
  MovieStars.add("Al Pacino");
  MovieStars.add("Josephi Krokrawski");
  MovieStars.add("Brad Pitt");
  MovieStars.add("Tom Cruise");
  Collections.sort(MovieStars);
  System.out.println(MovieStars);
  
  }
           
  }
  
  

     
     
     
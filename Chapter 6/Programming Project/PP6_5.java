// Programming Project 6.5
// Talon Huang
// Rolling Dice 1000 times
import java.util.Random;
public class PP6_5{
  public static void main(String args[])
  {
    int count = 0;
    for(int i=0;i<1000;i++)
    {
      Random gen = new Random();
   int dice1 = gen.nextInt(6)+1;
   int dice2 = gen.nextInt(6)+1;
   if(dice1 == 6 && dice2 == 6)
   {
     count++;
   }
    }
    System.out.println(count + " times box cars (two sixes) occur");
  }
}
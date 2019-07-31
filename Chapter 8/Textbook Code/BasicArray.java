// BasicArray.java from the textbook
// AP CSA Talon Huang

public class BasicArray
{
  public static void main(String args[])
  {
    final int LIMIT = 15, MULTIPLE = 10;
    int[] list = new int[LIMIT];
    
    for(int index = 0; index < LIMIT; index++)
    {
      list[index] = index * MULTIPLE;
    }
    list[5] = 999;// change one array value
    
    for(int value : list)
    {
      System.out.print(value + " ");
    }
  }
}
      
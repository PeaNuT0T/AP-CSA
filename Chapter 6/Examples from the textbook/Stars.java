// Stars.java
// Talon Huang
// AP CSA

public class Stars
{
  public void first()
  {
    final int MAX_ROWS = 10;
    
    for(int row = 1; row<= MAX_ROWS;row++)
    {
      for(int star = 1; star <= row; star++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public void second()
  {
    
    final int MAX_ROWS = 10;
    for(int row = 1; row<= MAX_ROWS;row++)
    {
       for(int space = MAX_ROWS; space >= row; space--)
      {
        System.out.print(" ");
      }
      for(int star = 0; star < row; star++)
      {
        System.out.print("*");
      }
     
      
      System.out.println();
    }
  }
  
  public void third()
  {
    final int MAX_ROWS = 10;
    for(int row = 1; row<= MAX_ROWS;row++)
    {
      for(int star = 0; star <= row; star++)
      {
        System.out.print(" ");
      }
      for(int space = MAX_ROWS; space >= row; space--)
      {
        System.out.print("*");
      }
      
      System.out.println();
    }
  }
  public void fourth()
  {
    final int MAX_ROWS = 10;
    for(int row = 0; row<= 5;row++)
    {
       for(int space = MAX_ROWS; space >= row; space--)
      {
        System.out.print(" ");
      }
      for(int star = 2; star <= row*2; star++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
     for(int row = 5; row>= 0;row--)
    {
        for(int space = row; space <= 10; space++)
      {
        System.out.print(" ");
      }
        for(int star = 2; star <= row*2; star++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public void fifth()
  {
     final int MAX_ROWS = 10;
    for(int row = 1; row<= MAX_ROWS;row++)
    {
      for(int star = 0; star <= row; star++)
      {
        System.out.print(" ");
      }
      for(int space = MAX_ROWS; space >= row; space--)
      {
        System.out.print("*");
      }
      
      System.out.println();
    }

    
    for(int row = 1; row<= MAX_ROWS;row++)
    {
      for(int star = 1; star <= row; star++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
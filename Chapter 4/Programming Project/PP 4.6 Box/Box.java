// Programming Project 4.6
// Talon Huang
// AP CSA

public class Box
{
  private int height, width, depth; // Declare variables
  private boolean full;
  
  
  public Box(int height,int width,int depth, boolean full) // Constructor
  {
    this.height = height;
    this.width = width;
    this.depth = depth;
    full = false;
  }
  // Create methods
  

  public String toString()
  {
    if(full)
    {
    return("The box is " + height + " meter high, " + width + " meter wide and " + depth + " meter long. It is full.");
    } 
    else
    {
      return("The box is " + height + " meter high, " + width + " meter wide and " + depth + " meter long. It is empty.");
    }
  }
  }

  
  
    
    
   
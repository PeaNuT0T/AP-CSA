//*******************************************************************************************************
//                                            Dice Class
//                                           Talon AP CSA
//*******************************************************************************************************

public class Die
{
  private final int MAX = 6; //Maximum face value
  
  private int faceValue;
  
  //-------------------------------------------------------------------------------------
  //  Constructor: Sets the initial face value.
  //-------------------------------------------------------------------------------------
  
  public Die()
  {
    faceValue = 1;
  }
  
  // Rolls the die and returns its value
  
  public int roll()
  {
    faceValue = (int)(Math.random() * MAX) + 1;
    return faceValue;
  }
  
  // Face Value mutator
  
  public void setFaceValue(int value)
  {
    faceValue = value;
  }
  
  // Face Value accessor
  public int getFaceValue()
  {
    return faceValue;
  }
  
  // Return a string representation of this die.
  
  public String toString()
  {
    String result = Integer.toString(faceValue);
    
    return result;
  }
}
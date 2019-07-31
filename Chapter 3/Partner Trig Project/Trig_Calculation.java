// Rilee White and Talon Huang
// Right Triangle Trig Calculation Class

import java.util.Random;
import java.text.DecimalFormat;

public class Trig_Calculation
{
  private int min;
  private int max;
  private int side; 
  private double angle;
  private double radian;
  
  public Trig_Calculation(int min, int max, int side)
  {
    this.min = min;
    this.max = max;
    this.side = side;
  }
   
  // Gets the random angle
  public double angle()
  {
    Random gen = new Random();
    int range = max - min;
    angle = gen.nextDouble();
    angle = (range * angle) + min;
    return (double) angle;
  }
  
  // Converts to radians
  public double radian()
  {
    radian = angle / 180;
    return (double) radian;
  }
   
  // Trig functions
  public double sine()
  {
    double sine = Math.sin(Math.toRadians(angle));
    return (double) sine;
  }
  public double cosine()
  {
    double cosine = Math.cos(Math.toRadians(angle));
    return (double) cosine;
  }
  public double tangent()
  {
    double tangent = Math.tan(Math.toRadians(angle));
    return (double) tangent;
  }
  
  // Side/angle calculations
  public double hypotenuse()
  {
    double hypotenuse = this.side / (Math.sin(Math.toRadians(angle)));
    return (double) hypotenuse;
  }
  public double thirdSide()
  {
    double thirdSide = (Math.cos(Math.toRadians(angle))) * (this.side / (Math.sin(Math.toRadians(angle))));
    return (double) thirdSide;
  }
  public double thirdAngle()
  {
    double thirdAngle = 90 - angle;
    return (double) thirdAngle;
  }
 }
    
  
  
    
    
  
  
  
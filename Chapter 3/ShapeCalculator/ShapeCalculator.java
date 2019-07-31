//*********************************************************************************************************************
//*********************************        Talon Huang & Nick Gong        *********************************************
//*********************************************************************************************************************
//***********************************          3D Shape Program           *********************************************
//*********************************************************************************************************************
import java.lang.Math.*;
public class ShapeCalculator
{
  
  // This program calculates the volume and the surface area of Sphere, Cone, and Cube
  private double Radius, Height, Side;
  private double volume, Area;
  
  //Constructor
  public ShapeCalculator(double x, double y, double z)
  {
    Radius = x;
    Height = y;
    Side = z;
  }
  
  //Methods
  public double SphereVolume()
  {
    volume = 4 / 3 * Math.PI * Math.pow(Radius, 3);
    return volume;
  }
  public double ConeVolume()
  {
    volume = Math.PI * Math.pow(Radius, 2) * Height / 3 ;
    return volume;
  }
  public double CubeVolume()
  {
    volume = Math.pow(Side, 3);
    return volume;
  }
  
  public double SphereArea()
  {
    Area = 4 * Math.PI * Math.pow(Radius, 2);
    return Area;
  }
  public double ConeArea()
  {
    Area = Math.PI * Radius * (Radius + Math.sqrt(Math.pow(Height, 2) + Math.pow(Radius, 2)));
    return Area;
  }
  public double CubeArea()
  {
    Area = 6 * Math.pow(Side, 2);
    return Area;
  }
  
}
  //Creating the methods
  
  
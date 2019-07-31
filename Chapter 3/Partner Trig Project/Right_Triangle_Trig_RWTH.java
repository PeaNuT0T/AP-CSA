// Rilee White and Talon Huang
// Right Triangle Trig

import java.util.Scanner;
import java.text.DecimalFormat;

public class Right_Triangle_Trig_RWTH
{
  public static void main(String args[])
  {
    int min;
    int max;
    int side;
    DecimalFormat fmt1 = new DecimalFormat("0.#");
    DecimalFormat fmt2 = new DecimalFormat("0.####");
    DecimalFormat fmt3 = new DecimalFormat("0.##");    

    // Getting user inputs
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the minimum possible value of the acute angle in degrees:");
    min = scan.nextInt();
    System.out.print("Enter the maximum possible value of the acute angle in degrees:");       
    max = scan.nextInt();
    System.out.print("Enter the side length in centimeters for the side opposite the angle:");
    side = scan.nextInt();
    
    Trig_Calculation trig = new Trig_Calculation(min, max, side);
    String pi = "\u03c0";
      
    // Printing results
    System.out.println("Original random angle in degrees: " + fmt1.format(trig.angle()));
    System.out.println("Angle in radians: " + fmt2.format(trig.radian()) + pi);
    System.out.println("Sine of the angle: " + fmt2.format(trig.sine()));
    System.out.println("Cosine of the angle: " + fmt2.format(trig.cosine()));
    System.out.println("Tangent of the angle: " + fmt2.format(trig.tangent()));
    System.out.println("Length of side across from random angle: " + fmt3.format(side));
    System.out.println("Length of hypotenuse: " + fmt3.format(trig.hypotenuse()));
    System.out.println("Length of final side: " + fmt3.format(trig.thirdSide()));
    
    scan.close();
  }
}
    
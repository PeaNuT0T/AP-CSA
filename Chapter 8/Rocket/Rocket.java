//********************************************************************
//  Rocket.java       Author: Lewis/Loftus
//
//  Demonstrates the use of polygons and polylines.
//********************************************************************

import javax.swing.JFrame;
import java.util.*;
public class Rocket
{
  //-----------------------------------------------------------------
  //  Creates the main frame of the program.
  //-----------------------------------------------------------------
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    JFrame frame = new JFrame("Rocket");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    System.out.println("Enter a value to enlarge the rocket's size.(Recommends 1¡ª5)");
    int value = scan.nextInt();
    
    RocketPanel panel = new RocketPanel(value);
    
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
  }
}

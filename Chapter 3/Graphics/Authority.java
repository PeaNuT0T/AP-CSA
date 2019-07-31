//********************************************************************
//  
//        Authority.java       Author: Talon Huang
//  
//********************************************************************

import java.awt.*;
import javax.swing.*;

public class Authority
{
   //-----------------------------------------------------------------
   //  Displays some words of wisdom.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Dr.Pepper");

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel primary = new JPanel();
      primary.setBackground(Color.white);
      primary.setPreferredSize(new Dimension(1000, 2000));

      JLabel label1 = new JLabel("SoftBank doesn't do banking.\n");
      JLabel label2 = new JLabel("They do baking.");
      label1.setFont(label1.getFont().deriveFont(18.0F));
      label2.setFont(label2.getFont().deriveFont(18.10F));
      label1.setForeground(Color.blue);
      label2.setForeground(Color.yellow);

      primary.add(label1);
      primary.add(label2);

      frame.getContentPane().add(primary);
      frame.pack();
      frame.setVisible(true);
   }
}

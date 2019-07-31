// Talon Huang
// AP CSA
// RockectPanel.java
import javax.swing.JPanel;
import java.awt.*;

public class RocketPanel extends JPanel
{
  private int[] xRocket = {100, 120, 120, 130, 130, 70, 70, 80, 80};
  private int[] yRocket = {15, 40, 115, 125, 150, 150, 125, 115, 40};
  
  private int[] xWindow = {95, 105, 110, 90};
  private int[] yWindow = {45, 45, 70, 70};
  
  private int[] xFlame = {70, 70, 75, 80, 90, 100, 110, 115, 120,
    130, 130};
  private int[] yFlame = {155, 170, 165, 190, 170, 175, 160, 185,
    160, 175, 155};
  
  //-----------------------------------------------------------------
  //  Constructor: Sets up the basic characteristics of this panel.
  //-----------------------------------------------------------------
  public RocketPanel(int scale)
  {
    setBackground(Color.black);
    setPreferredSize(new Dimension(scale * 200, scale * 200));
    for(int i=0;i < xRocket.length;i++)
    { 
      xRocket[i]=xRocket[i] * scale;
    }
    for(int i=0;i < yRocket.length;i++)
    {
      yRocket[i]=yRocket[i] * scale;
    }
    for(int i=0;i < xWindow.length;i++)
    {
      xWindow[i]=xWindow[i] * scale;
    }
    for(int i=0;i < yWindow.length;i++)
    {
      yWindow[i]=yWindow[i] * scale;
    }
    for(int i=0;i < xFlame.length;i++)
    {
      xFlame[i]=xFlame[i] * scale;
    }
    for(int i=0;i < yFlame.length;i++)
    {
      yFlame[i]=yFlame[i] * scale;
    }
  }
  
  //-----------------------------------------------------------------
  //  Draws a rocket using polygons and polylines.
  //-----------------------------------------------------------------
  public void paintComponent(Graphics page)
  {
    super.paintComponent(page);
    
    page.setColor(Color.cyan);
    page.fillPolygon(xRocket, yRocket, xRocket.length);
    
    page.setColor(Color.gray);
    page.fillPolygon(xWindow, yWindow, xWindow.length);
    
    page.setColor(Color.red);
    page.drawPolyline(xFlame, yFlame, xFlame.length);
  }
}

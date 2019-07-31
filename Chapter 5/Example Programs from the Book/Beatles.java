// Beatles.java
// Talon Huang AP CSA

import java.util.ArrayList;

public class Beatles
{
  public static void main(String[] args)
  {
    ArrayList<String> band = new ArrayList();
    
    band.add("Mike");
    band.add("Brad");
    band.add("Dave");
    band.add("Joe");
    band.add("Rob");
    band.add("Mark");
    band.add("Chester"); // My favorite band is Linkin Park
    
    // It is an American rock band from Agoura Hills, California. Formed in 1996
    // Linkin Park was founded by three high school friends: Mike Shinoda, Rob Bourdon, and Brad Delson.
    // Their music is integrated into alternative rock, hip-hop rhythm, dazzling electronic music and other elements.
    // Their lead vocal, Chester Bennington, committed suicide last year.
    
    System.out.println(band);
    int location = band.indexOf("Chester");
    band.remove(location);
    
    System.out.println(band);
    System.out.println("At index 1: " + band.get(1));
    band.add(2, "Kyle");
    
    System.out.println("Size of the band: " + band.size());
    int index = 0;
    while(index < band.size())
    {
      System.out.println(band.get(index));
      index++;
    }
  }
}
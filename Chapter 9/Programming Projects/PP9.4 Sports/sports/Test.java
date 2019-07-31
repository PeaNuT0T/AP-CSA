// PP 9.4
// AP CSA
// Talon Huang
package sports;
import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        baseball Nick = new baseball("Nick", 36, 50000);
        football Sam = new football("Sam", 12, 55000);
        // create admins
        basketball Blake = new  basketball("Blake", 15, 85000);
        basketball Rob = new  basketball("Rob", 10, 85000);
       
      System.out.println("Nick's number is " + Nick.getNumber());
      System.out.println("Sam's number is " + Sam.getNumber());
      System.out.println("Blake's number is " + Blake.getNumber());
      System.out.println("Rob's number is " + Rob.getNumber());
      System.out.println();
      System.out.println("Nick's salary is $" + Nick.getSalary());
      System.out.println("Sam's salary is $" + Sam.getSalary());
      System.out.println("Blake's salary is $" + Blake.getSalary());
      System.out.println("Rob's salary is гд" + Rob.getSalary());
    }
}
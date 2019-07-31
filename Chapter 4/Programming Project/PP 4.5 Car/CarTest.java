// Programming Project 4.5
// Talon Huang
// AP CSA

public class CarTest
{
  
  
  public static void main(String args[])
  {
    Car car1 = new Car("Lamborghini", "Aventador", 2018);
    Car car2 = new Car("Ferrari", "LaFerrari", 2016);

    System.out.println("Brand: " + car1);
    System.out.println("Year: " + car1.getCarAge());
    System.out.println(car1.toString());
    System.out.println();
    System.out.println();
    System.out.println("Brand: " + car2);
    System.out.println("Year: " + car2.getCarAge());
    System.out.println(car2.toString());
    

  }
}
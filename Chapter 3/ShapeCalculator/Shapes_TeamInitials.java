//*********************************************************************************************************************
//*********************************        Talon Huang & Nick Gong        *********************************************
//*********************************************************************************************************************
//***********************************          3D Shape Program           *********************************************
//*********************************************************************************************************************
import java.util.Scanner;

public class Shapes_TeamInitials{
  public static void main(String[] agrs){
    while(true){
    String choice;
    double a = 0, b = 0, c = 0;
    
    //print out a message to the user
    System.out.println("\nThis program calculates the volume and the surface area of Sphere, Cone, or Cube");
    
    //creates an instance of the Scanner class
    Scanner reader = new Scanner(System.in);
    
    //gets shape from the user
    System.out.println("Choose the shape you would like to choose: \n A)Sphere B)Cone C)Cube");
    choice = reader.nextLine();

    if(choice.equals("A")){
      System.out.println("Enter the radius: ");
      a = reader.nextDouble();
    }
    else if(choice.equals("B")){
      System.out.println("Enter the radius: ");
      a = reader.nextDouble();
      System.out.println("Enter the height: ");
      b = reader.nextDouble();
    }
    else if(choice.equals("C")){
      System.out.println("Enter the side: ");
      c = reader.nextDouble();
    }
      
    
    //create an instance of the slope class
    ShapeCalculator shape = new ShapeCalculator(a, b, c);
    
    //determine which shape the user choose
    double volume = 0, area = 0;
    if(choice.equals("A")){
      volume = shape.SphereVolume();
      area = shape.SphereArea();
    }
    else if(choice.equals("B")){
      volume = shape.ConeVolume();
      area = shape.ConeArea();
    }
    else if(choice.equals("C")){
      volume = shape.CubeVolume();
      area = shape.CubeArea();
    }
    System.out.println("The shape of your choice's volume is " + volume + ".");
    System.out.println("The shape of your choice's surface area is " + area + ".");
    }
  }
}
    
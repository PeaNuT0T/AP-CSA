/******************************************************************** 
/*
/*                        Talon Huang
/*                   Programming Project 2.12
********************************************************************* */
import java.util.Scanner;

public class PP2$12 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int area, perimeter, side;
        
        System.out.print("Enter the value of side: ");
        
        side = in.nextInt();
        area=side*side;//define variables for perimeter and areas
        perimeter=side*4;
        
        System.out.println("Value of area: " + area);
        
        System.out.println("Value of perimeter: " + perimeter);
    }

}
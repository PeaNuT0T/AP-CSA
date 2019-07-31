// Talon Huang AP CSA
// PP 5.4


import java.util.Random;
import java.util.Scanner;
 
public class PP5$4 {
 
   public static void main(String[] args) {
 
      
       
      Random random = new Random(); // Random number generator
      Scanner scanner = new Scanner(System.in); // Scanner Class
 
      int number = random.nextInt(100);
      int guess = -1;
       
      // Loop until the user has guessed the number
       
      while (guess != number) {
          
         // Prompt the user for their next guess
          
         System.out.print("Enter your guess: "); // Get input from user
         guess = scanner.nextInt();
          
         if (guess<number) {
             
            // Guess is too low
             
            System.out.println("Too low, please try again");
             
         } else if (guess>number) {
 
            // Guess is too high
 
            System.out.println("Too high, please try again");
             
         } else {
             
            // Guess is correct !!
             
            System.out.println("Correct, the number was " + number);
         }
      }
   }
 
}
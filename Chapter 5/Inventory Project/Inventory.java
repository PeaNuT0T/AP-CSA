/**
 * AP CSA
 * Zoya Goel, Talon Huang
 * ArrayList Project ¡ª¡ª¡ª¡ª Supreme Shop
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Inventory {
  
  
  public static void main(String[] args) { 
    ArrayList<products> inventory = new ArrayList<products>();
    
    //instantiate, add products to list
    products supremeSweater = new products();
    inventory.add(supremeSweater);
    
    supremeSweater.setValueName("Supreme/Champion 3D Metallic Crew Neck (olive)");
    supremeSweater.setValueQuant(5);
    supremeSweater.setValueTrack("34859");
    supremeSweater.setValuePrice(148);
   
    products supremeHat = new products();
    inventory.add(supremeHat);
    
    supremeHat.setValueName("Fleece Pullcord Camp cap (coral)");
    supremeHat.setValueQuant(10);
    supremeHat.setValueTrack("23874");
    supremeHat.setValuePrice(48);
    
    products supremeBag = new products();
    inventory.add(supremeBag);
   
    supremeBag.setValueName("Backpack (yellow)");
    supremeBag.setValueQuant(15);
    supremeBag.setValueTrack("32984");
    supremeBag.setValuePrice(158);
 
    Scanner scan = new Scanner(System.in);
    Scanner scanString = new Scanner(System.in);
    
    int program = 1;
    
    while(program==1){
      System.out.println("Press 1 to add a product, 2 to delete a product, 3 to change the quantity of a product, 4 to print the inventory, 5 to print the two newest items, 6 to print total of all quantities");
      System.out.println("Press ¡°0¡± to shut down the program.");
      int choose = scan.nextInt();
      
      if(choose == 1){
        //add product
        products newProducts = new products();
        
        System.out.println("enter the product name.");
        String name = scanString.nextLine();
        newProducts.setValueName(name);
        
        System.out.println("enter the quantity.");
        int quant = scan.nextInt();
        newProducts.setValueQuant(quant);
        
        System.out.println("enter the tracking number.");
        String track = scanString.nextLine();
        newProducts.setValueTrack(track);
        
        System.out.println("enter the price.");
        int price = scan.nextInt();
        newProducts.setValuePrice(price);
        inventory.add(newProducts);
      }
      //remove item
      else if(choose == 2)
      {
        int count = 0;
        int size = inventory.size();
        System.out.println("choose index of item you want removed.");
        while(count< size){
          System.out.println((inventory.get(count)).getValueName() +"is at index "+count);
          count++;
        }
        int location = scan.nextInt();
        inventory.remove(location);
      }
      //change quantity
      else if(choose == 3)
      {
        int count = 0;
        int size = inventory.size();
        System.out.println("choose index of item you want to change quantity");
        while(count< size){
          System.out.println((inventory.get(count)).getValueName() +" quantity: "+(inventory.get(count)).getValueQuant()+": is at index "+count);
          count++;
        }
        int productInt = scan.nextInt();
        if(productInt<0 || productInt>size){
          System.out.println("Invalid, please try again");
        }
        else{
          System.out.println("enter desired quantity.");
          int newQuant = scan.nextInt();
          inventory.get(productInt).setValueQuant(newQuant);
        }
        
      }
      else if(choose == 4)
      {
        int count = 0;
        int size = inventory.size();
        System.out.println("choose index of item you want to change quantity");
        while(count< size){
          System.out.println((inventory.get(count)).getValueName() +", quantity: "+(inventory.get(count)).getValueQuant()+", tracking number: "+(inventory.get(count)).getValueTrack()+ " price: "+(inventory.get(count)).getValuePrice()+" index: "+count);
          count++;
        }
      }
      else if(choose == 5)
      {
        int size = inventory.size()-1;
        System.out.println((inventory.get(size-1)).getValueName());
        System.out.println((inventory.get(size)).getValueName());
      }
      else if(choose == 6)
      {
        int count = 0;
        int size = inventory.size();
        int total = 0;
        while(count< size){
          total = total+inventory.get(count).getValueQuant();
          count++;
        }
        System.out.println("total: "+total);
      }
      else if(choose == 0)
      {
        program = 2;
      }
      else
      {
        System.out.println("I don't understand, please try again.");
      }
    
    }
  }
}

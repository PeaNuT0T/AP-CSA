//Dice2.java//
//Talon and Hayes//
import java.util.Random;
public class Dice2 implements LockableDice{
  public Dice2(){}
  int key = 12345;
  int d1 = 0, d2 = 0, d3 = 0, d4 = 0;
  boolean lockStatus = true;
  Random r = new Random();
  
  public int setKey(int currentKey, int newKey){
    if(currentKey == key){
      key = newKey;
      return 1;
    }
    return 0;
  }
  
  public void lock(int currentKey){
    if(currentKey == key){
      lockStatus = true;
      System.out.println("Complete.");
    }
    else
    {
      System.out.println("Incomplete. Check your key code.");
    }
  }
  
  public void unlock(int currentKey)
  {
    if(currentKey == key){
      lockStatus = false;
      System.out.println("Complete.");
    }
    else
    {
      System.out.println("Incomplete. Check your key code.");
    }
  }
  
  public Boolean locked(){
    return lockStatus;
  }

  public String rollDice(int side1){
    if(!lockStatus){
      d1 = r.nextInt(side1) + 1;
      return d1 + "";
    } else {
      return "LOCKED";
    }
  }
  
  public String rollDice(int side1, int side2){
    if(!lockStatus){
      d1 = r.nextInt(side1) + 1;
      d2 = r.nextInt(side2) + 1;
      return (d1 + d2) + "";
    } else {
      return "LOCKED";
    }
  }
  
  public String rollDice(int side1, int side2, int side3){
    if(!lockStatus){
      d1 = r.nextInt(side1) + 1;
      d2 = r.nextInt(side2) + 1;
      d3 = r.nextInt(side3) + 1;
      return "" + (d1 + d2 + d3);
    } else {
      return "LOCKED";
    }
  }
  
  public String rollDice(int side1, int side2, int side3, int side4){
    if(!lockStatus){
      d1 = r.nextInt(side1) + 1;
      d2 = r.nextInt(side2) + 1;
      d3 = r.nextInt(side3) + 1;
      d4 = r.nextInt(side4) + 1;
      return "" + (d1 + d2 + d3 + d4);
    } else {
      return "LOCKED";
    }
  }
}
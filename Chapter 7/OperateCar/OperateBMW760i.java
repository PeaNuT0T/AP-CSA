public class OperateBMW760i implements OperateCar{
  public int turn(String direction, double radius, double startSpeed, double endSpeed)
  {
    System.out.println("You are turning " + direction + ". The radius is " + radius + ", the start speed is "+ startSpeed + " , the end speed is " + endSpeed);
    return 0;
  }
   public int changeLanes(String direction, double startSpeed, double endSpeed)
   {
     System.out.println("You are changing lane to the " + direction + ". Start speed is " + startSpeed + ". End speed is " + endSpeed + ".");
     return 0;
   }
   public int signalTurn(String direction, boolean signalOn)
   {
     if(signalOn){
     System.out.println(direction + " Turn signal is on.");
     }
     else
     {
       System.out.println(direction + "Turn signal is off.");
     }
     return 0;
   }
   public  int getRadarFront(double distanceToCar, double speedOfCar)
   {
     System.out.println("Front Radar activated. The speed of car is " + speedOfCar + " mph. One object is " + distanceToCar + " feet to your car.");
     return 0;
   }
   public int getRadarRear(double distanceToCar, double speedOfCar)
   {
     System.out.println("Rear Radar activated. The speed of car is " + speedOfCar + " mph. One object is " + distanceToCar + " feet to your car.");
     return 0;
     
   }
}
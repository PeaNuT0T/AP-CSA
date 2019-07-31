public class runner
{
  public static void main(String args[])
  {
    people america_persons = new american(); 
    people india_persons = new indians(); 
    people mexico_persons = new mexican(); 
    
    america_persons.printInfo();
    india_persons.printInfo();
    mexico_persons.printInfo();
  }
}
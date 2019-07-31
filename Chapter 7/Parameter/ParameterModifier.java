//ParameterModifier.java from the textbook
//AP CSA
public class ParameterModifier
{
  public static void changeValues(int f1, Num f2, Num f3)
  {
    System.out.println("Before calling changeValues: ");
    System.out.println("f1\tf2\tf3");
    System.out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");
    
    f1 = 999;
    f2.setValue(888);
    f3 = new Num(777);
    
    System.out.println("After calling changeValues: ");
    System.out.println("f1\tf2\tf3");
    System.out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");
  }
}
    
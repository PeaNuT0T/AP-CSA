public class SeasonTester
{
  public static void main(String[] args)
  {
    Season time1, time2;
    time1 = Season.winter;
    time2 = Season.summer;
    System.out.println(time1);
    System.out.println(time2.name());
    System.out.println(time1.ordinal());
    System.out.println(time2.getSpan());
  }
}
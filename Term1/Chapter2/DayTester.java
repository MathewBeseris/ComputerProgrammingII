

public class DayTester{
  public static void main(String[] args){
    Day myDay = new Day(2012, 10, 31);
    Day newDay = myDay.addDays(10);
    System.out.println(newDay.compareTo(myDay));
    
  }
}
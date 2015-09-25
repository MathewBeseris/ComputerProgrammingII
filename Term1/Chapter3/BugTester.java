public class BugTester{
  public static void main(String[] args){
    Bug bug1 = new Bug(5);
    bug1.move();
    bug1.move();
    bug1.move();
    bug1.move();
    bug1.turn();
    bug1.move();
    bug1.move();
    bug1.turn();
    bug1.move();
    System.out.println("Expected: 8  Actual: " + bug1.getPosition());
  }
}
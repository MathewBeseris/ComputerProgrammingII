

public class HollePrinter{
  public static void main(String[] args){
    String s1 = "Hello, World";
    s1.replace('e','2');
    s1.replace('o','e');
    s1.replace('2','e');
    System.out.println(s1);
  }
}

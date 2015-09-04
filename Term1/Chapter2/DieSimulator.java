import java.util.Random;


public class DieSimulator{
  public static void main(String[] args){
    Random rn = new Random();
    float price = (rn.nextInt(995)+1001);
    price *= .01;
    System.out.println("The price is: $" + price);
  }
}
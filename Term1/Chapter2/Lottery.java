import java.util.Random;

public class Lottery{
  public static void main(String[] args){
    Random rn = new Random();
    int[] numbers = new int[5];
    for(int i = 0; i<5; i++){
      numbers[i] = rn.nextInt(49)+1;
    }
  }
}
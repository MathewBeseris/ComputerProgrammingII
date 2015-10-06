import java.util.Scanner;

public class Chapter4{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    
    String number = keyboard.nextLine();
    for(int i = 1; i < number.length(); i+=2){
      number = number.substring(i,i+1) + " " + number.substring(i+1,number.length());
    }
    System.out.println(number);
  }
}
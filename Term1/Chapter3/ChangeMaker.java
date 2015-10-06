import java.util.Scanner;



public class ChangeMaker{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    
    int twenty = 0, ten = 0, five = 0, one = 0, quarter = 0, dime = 0, nickel = 0, penny = 0;
    
    
    System.out.println("Enter Cost:");
    double cost = keyboard.nextDouble();
    System.out.println("Enter Amount Given To Cashier:");
    double received = keyboard.nextDouble();
    double change = received-cost;
    
    
    while(change>20){
      change -= 20;
      twenty++;
    }
    
    while(change>10){
      change -= 10;
      ten++;
    }
    
    while(change>5){
      change -= 20;
      five++;
    }
    
    while(change>1){
      change -= 1;
      one++;
    }
    
    while(change>.25){
      change -= .25;
      quarter++;
    }
    
    while(change>.1){
      change -= .1;
      dime++;
    }
    
    while(change>.05){
      change -= .05;
      nickel++;
    }
    
    while(change>.01){
      change -= .01;
      penny++;
    }
    
    System.out.println("The change to be given is: " + twenty + " twenty dollar bills, " + ten + " ten dollar bills, " + five + " five dollar bills, " + one + " one dollar bills, " + quarter + " quarters, " + dime + " dimes" + nickel + " nickels, and " + penny + " pennies.");
  }
}
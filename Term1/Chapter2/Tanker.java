import java.util.Scanner;

public class Tanker{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = keyboard.nextLine();
    
    System.out.println("What year were you born in?");
    int userBY = keyboard.nextInt();
    System.out.println("What month were you born in?");
    int userBM = keyboard.nextInt();
    System.out.println("What day were you born on?");
    int userBD = keyboard.nextInt();
    
    Day userBirthDate = new Day(userBY,userBM,userBD);
    
    System.out.println("How long do you want to live in years?");
    float years = keyboard.nextFloat();
    
    System.out.println("On average, how many ounces of fluid do you consume per day?");
    float ounces = keyboard.nextFloat();
    
    double gallons = ounces*.0078125;
    double gallonsInLifetime = years*365*gallons;
    double trucks = gallonsInLifetime/8000;
    
    System.out.println("It would take "+ trucks +" 8000 gallon trucks to contain the amount of fluids you would consume in your life");
    
    
  }
}
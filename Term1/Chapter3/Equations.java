
import java.util.Scanner;


public class Equations{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    
    //Equation 1
    System.out.println("Input initial position");
    double s0 = keyboard.nextDouble();
    System.out.println("Input initial velocity");
    double v0 = keyboard.nextDouble();
    final double g = 9.81;
    System.out.println("Input time");
    double t = keyboard.nextDouble();  
      
    System.out.println("Position at t= " + t + " " + s);
    System.out.println("Position at t= " + t + " " + s);
    
    
    //Equation 2
    System.out.println("Input astronomical units");
    double a = keyboard.nextDouble();
    System.out.println("Input period");
    double p = keyboard.nextDouble();
    System.out.println("Input mass of first object");
    double m1 = keyboard.nextDouble();
    System.out.println("Input mass of second object");
    double m2 = keyboard.nextDouble();
    
    double G = 4*Math.pow(Math.PI,2)* (  (Math.pow(a,3))/ ((Math.pow(p,2))*(m1+m2) ));
    System.out.println("Gravitational force: " + G);
    
    
    //Equation 3
    System.out.println("Input principal");
    double PV = keyboard.nextDouble();
    System.out.println("Input rate of interest");
    double INT = keyboard.nextDouble();
    System.out.println("Input time in years");
    double YRS = keyboard.nextDouble();
    
    double FV = PV*Math.pow(1+(INT/100),YRS);
    System.out.println("Amount after interest: " + FV);
    
    
    //Equation 4
    System.out.println("Input a");
    double A = keyboard.nextDouble();
    System.out.println("Input b");
    double B = keyboard.nextDouble();
    System.out.println("Input angle");
    double angle = keyboard.nextDouble();
    
    double c = Math.sqrt(Math.pow(A,2)+Math.pow(B,2)-2*A*B*Math.cos(angle));
    System.out.println("Side c: " + c);
  }
}
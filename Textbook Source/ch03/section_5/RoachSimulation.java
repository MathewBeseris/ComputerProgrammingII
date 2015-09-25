

public class RoachSimulation{
  public static void main(String[] args){
    RoachPopulation roach1 = new RoachPopulation(10);
    roach1.breed();
    roach1.spray(10);
    System.out.println(roach1.getRoaches());
    roach1.breed();
    roach1.spray(10);
    System.out.println(roach1.getRoaches());
    roach1.breed();
    roach1.spray(10);
    System.out.println(roach1.getRoaches());
    
    RoachPopulation roach2 = new RoachPopulation(500);
    roach2.breed();
    roach2.spray(10);
    System.out.println(roach2.getRoaches());
    roach2.breed();
    roach2.spray(40);
    System.out.println(roach2.getRoaches());
    roach2.breed();
    roach2.spray(90);
    System.out.println(roach2.getRoaches());
    
    
  }
}
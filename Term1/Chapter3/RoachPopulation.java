

public class RoachPopulation{
  private double population;
  
  public RoachPopulation(double population){
    this.population = population;
  }
  
  public void breed(){
    population *= 2;
  }
  
  public void spray(double percent){
    population = Math.round(population*(1-(percent*.01)));
  }
  
  public double getRoaches(){
    return population;
  }
}
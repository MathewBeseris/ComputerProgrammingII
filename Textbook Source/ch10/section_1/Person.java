public class Person implements Measurable{
	private String name;
	private double height;
	
	public Person(String name, double height){
		this.name = name;
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public String getName(){
		return name;
	}
	
	
	//Must have getMeasure to compile if you're implementing Measurable
	public double getMeasure(){
		return height;
	}
}
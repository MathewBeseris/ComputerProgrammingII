class PersonTester {
	public static void main(String[] args) {
		Measurable persons[] = new Measurable[3];
		
		persons[0] = new Person("Joe",183);
		persons[1] = new Person("Chris",158);
		persons[2] = new Person("Bill",175);
		
		double avg = Data.average(persons);
		
		Person max = (Person) Data.max(persons);
		
		
		System.out.println("Average height: " + avg);
		
	}
}
public class EmployeeTester{
  public static void main(String[] args){
    Employee employee1 = new Employee("Jared", 2000);
    
    System.out.println(employee1.getName());
    System.out.println(employee1.getSalary());
    employee1.raiseSalary(20);
    System.out.println(employee1.getSalary());
  }
}
public class SavingsAccountTester{
  public static void main(String[] args){
    SavingsAccount acc1 = new SavingsAccount(1000,10);
    acc1.addInterest();
    
    System.out.println("Expected: 1100  Actual:" + acc1.getBalance());
  }
}
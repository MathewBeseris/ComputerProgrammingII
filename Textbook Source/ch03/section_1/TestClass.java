public class TestClass{
  public static void main(String[] args){
    BankAccount myMoney = new BankAccount(1000);
    myMoney.addInterest(10);
    System.out.println("Expected: 1100 Actual: "+ myMoney.getBalance());
  }
}

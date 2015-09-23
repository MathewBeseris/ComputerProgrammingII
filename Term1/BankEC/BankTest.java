public class BankTest{
  public static void main(String[] args){
    BankAccount account1 = new BankAccount();
    BankAccount account2 = new BankAccount(500);
    
    account1.deposit(20);
    System.out.println("Balance predicted for account 1: 20  Actual Balance: " +account1.getBalance());
    account2.withdraw(200);
    System.out.println("Balance predicted for account 2: 300  Actual Balance: " +account2.getBalance());
  }
}
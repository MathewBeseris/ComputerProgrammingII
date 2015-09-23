public class SavingsAccount{
  private double balance;
  private double interest;
  
  public SavingsAccount(){
    balance = 0;
    interest = 5;
  }
  
  public SavingsAccount(double initialBalance,double initialInterest){
    balance = initialBalance;
    interest = initialInterest;
  }
  
  public void addInterest(){
    balance = balance + interest*.01*balance;
  }
  
  public double getBalance(){
    return balance;
  }
}
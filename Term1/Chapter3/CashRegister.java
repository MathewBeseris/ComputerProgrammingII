/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double taxRate;
   private double purchase;
   private double taxablePurchase;
   private double payment;
   private String receipt;
   private double receiptPrice;
   private int salesCount;

   /**
      Constructs a cash register with no money in it.
      @param rate the tax rate for taxable purchases
   */
   public void reset(){
     salesCount = 0;
     receiptPrice = 0;
   }
   
   public int salesCount(){
     return salesCount;
   }
   
   public double getSalesTotal(){
     return receiptPrice;
   }
   
   public CashRegister(double rate)
   {
      taxRate = rate;
      purchase = 0;
      payment = 0;
   }

   
   public String printReceipt(){
     String r = "Prices of items purchased: " + receipt + " Total price: " + receiptPrice;
     return(r);
   }
   /**
      Records the sale of a tax-free item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
      receipt.concat(String.valueOf(amount));
      receipt.concat(" ");
      receiptPrice += amount;
      salesCount++;
   }

   /**
      Records the sale of a taxable item.
      @param amount the price of the item
   */
   public void recordTaxablePurchase(double amount)
   {
      taxablePurchase = taxablePurchase + amount;
   }

   /**
      Processes a payment received from the customer.
      @param amount the amount of the payment
   */
   public void receivePayment(double amount)
   {
      payment = payment + amount;
   }

   /**
      Processes the sales tax due.
      @return the sales tax due
   */
   public double getSalesTax()
   {
      return taxablePurchase * taxRate / 100;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double change = payment - purchase - getSalesTax();
      purchase = 0;
      payment = 0;
      return change;
   }
}

/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double balance;
   private double interestPct;

   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount(double amount, double balPct)
   {
      balance = amount;
      interestPct = balPct;
      
  
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
	   if(balance > amount)
		  	balance = balance - amount;
	   else
	   {
		   System.out.println("Insufficient funds to support withdrawl");
		   
	   }
   }
   public double calcInterest() {
	   double totalInterest = balance + (interestPct * balance);
	   return totalInterest; 
   }
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
}
import java.util.Scanner; 
public class BankAccountTester {
//note for project
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount to start your account:  ");
		double newAmt = input.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(newAmt, 0.05);
		System.out.println("Created new account with "+newAmt +" balance");
		
	
		System.out.println("Bank account beginning balance is: ");
		System.out.println("$"+myBankAccount.getBalance());
		
		myBankAccount.withdraw(250);//runs BankAccount code line 31-34
		System.out.println("Withdraw: - $250.00 ");
		
		System.out.println("Balance " +"$"+myBankAccount.getBalance());
		
		myBankAccount.deposit(500);//runs BankAccount code lines 21-24
		System.out.println("Deposit: $500.00");
		System.out.println("Balance " +"$"+myBankAccount.getBalance());
		
		
		System.out.println("Your current balance with interest is: ");
		System.out.println("$"+myBankAccount.calcInterest());//runs BankAccount code lines 39-42
		input.close();
	}

}



public class BankAccountTester {
//note for project
	public static void main(String[] args) {
		BankAccount myBankAccount = new BankAccount(1000.00);//invokes BankAccount code lines 12-15
		System.out.println("Bank account beginning balance is: ");
		System.out.println(myBankAccount.getBalance());
		
		myBankAccount.withdraw(500);//runs BankAccount code line 31-34
		System.out.println("Withdraw: ");
		System.out.println(myBankAccount.getBalance());
		
		myBankAccount.deposit(1500);//runs BankAccount code lines 21-24
		System.out.println("Deposit: ");
		System.out.println(myBankAccount.getBalance());
		
		System.out.println("Your current balance is: ");
		System.out.println(myBankAccount.getBalance());//runs BankAccount code lines 39-42
		
	}

}

import java.util.Scanner;

public class ATMBankTest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		double balance;
		ATMBank.annualInterestRate = .04;
		
		System.out.println("Enter a initial balance");
		balance = sc.nextDouble();
		
		ATMBank bObj = new ATMBank(balance);
		
		System.out.println("Enter a deposit");
		balance = sc.nextDouble();
		
		bObj.deposit(balance);
		
		//do the above for withdraw
		
		
		//show ending balance with applied interest
		
		
		
		

	}

}
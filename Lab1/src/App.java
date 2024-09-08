import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // scanner setup
        Scanner sc = new Scanner (System.in);
		double balance;

		ATMBank.annualInterestRate = .04;
		

        // Create the account object
		System.out.println("Enter a initial balance");
		balance = sc.nextDouble();
		
		ATMBank account = new ATMBank(balance);
		
        // deposit checkpoint
		System.out.println("Enter a deposit");
        while true {
		    balance = sc.nextDouble();
            if (balance <0) System.out.println("Please enter a positive balance");
            else break;
        }

		account.deposit(balance);
		

        //withdraw checkpoint
		System.out.println("Enter a withdraw");
		balance = sc.nextDouble();

        account.withdraw(balance);
		

        
		//show ending balance with applied interest
        System.out.println("

        //close scanner
		sc.close();
    }
}



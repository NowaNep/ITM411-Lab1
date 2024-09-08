public class ATMBank {
    double balance;
    static double annualInterestRate;

    public ATMBank(double bal){
        if (bal < 0) throw new IllegalArgumentException("bal must be positive");
        else this.balance = bal;
    }

    public void deposit(double bal){
        this.balance += bal;
    }


    // TO DO: 
    	// verify current balance and bal passed in
		// doesn't drop below 50!!!!
		// if so adjust to match limit
    public void withdraw(double ammount){
        if (ammount < 0) throw new IllegalArgumentException("balance must be above fifty ($50) after withdraw");
        else this.balance -= ammount;
    }


    // getting theitems
    public double getBalance(){
        return this.balance;
    }

    public double getAnnualInterestRate(){
        return this.balance * (annualInterestRate / 12.0);
    }
}
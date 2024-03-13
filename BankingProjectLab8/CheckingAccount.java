public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = this.balance + 50000;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && this.overdraftLimit - amount >= 500) {
            System.out.println("Money debited successfulli!");
            this.balance -= amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "CheckingAccount [overdraftLimit=" + overdraftLimit + "]";
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
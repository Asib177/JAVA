import java.util.Calendar;

public class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;
    private Calendar dataCreated;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dataCreated = Calendar.getInstance();

    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Calendar getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(Calendar dataCreated) {
        this.dataCreated = dataCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterestAmount() {
        return this.balance * (this.getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance - amount >= 500) {
            System.out.println("Money debited successfully!");
            this.balance -= amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void deposite(double amount) {
        if (amount > 0) {
            System.out.println("Money credited successfully!");
            this.balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
                + ", dataCreated=" + dataCreated.getTime() + "]";
    }

    public double getOverdraftLimit() {
        return 0;
    }

    public Calendar getExpiryDate() {
        return null;
    }
}

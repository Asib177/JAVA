import java.util.Calendar;

public class SavingsAccount extends Account {
    private String creditCardNo;
    private Calendar expiryDate;
  
    public SavingsAccount(int id, double balance, double annualInterestRate, String creditCardNo) {
        super(id, balance, annualInterestRate);
        this.creditCardNo = creditCardNo;
        
    }

    
}

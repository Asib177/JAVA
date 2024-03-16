package Q04;

public class LowBatteryException extends Exception {
    private int chargeAmount;

    public LowBatteryException(int chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public String getMessage() {
        if (chargeAmount <= 20) {
            return "Battery is low! Should be above 20.\nCurrent value: " + chargeAmount;
        } else {
            return "Enough charge in battery.";
        }
    }
}

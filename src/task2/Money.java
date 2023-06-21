package task2;

public class Money {
    // pulun miqdari
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }

    @Override
    public String toString() {
        return amount + "$";
    }
}

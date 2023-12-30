package Startegy;

public class EasterDiscounter implements Discounter {
    public double applyDiscount(double amount) {
        amount = amount - (amount * 50 / 100);
        return amount;
    }
}

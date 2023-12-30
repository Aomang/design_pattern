package Startegy;

public class ChristmasDiscounter implements Discounter {
    public double applyDiscount(double amount) {
        amount = amount - (amount * 10 / 100);
        return amount;
    }
}

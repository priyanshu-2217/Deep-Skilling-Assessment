package DesignPatterns.StrategyPattern;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(double amount) {
        if (strategy == null) {
            System.out.println("Payment method not selected.");
        } else {
            strategy.pay(amount);
        }
    }
}

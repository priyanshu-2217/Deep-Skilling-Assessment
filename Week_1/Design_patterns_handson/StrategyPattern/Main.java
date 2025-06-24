package StrategyPattern;
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();


        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(250.0);


        context.setPaymentStrategy(new PayPalPayment());
        context.makePayment(600.0);
    }
}

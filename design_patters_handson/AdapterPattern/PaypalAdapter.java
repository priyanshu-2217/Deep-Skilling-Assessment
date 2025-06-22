package DesignPatterns.AdapterPattern;

public class PaypalAdapter implements PaymentProcessor {
    private PayPalGateway paypal = new PayPalGateway();

    @Override
    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}


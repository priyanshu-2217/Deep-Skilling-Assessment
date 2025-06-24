package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PaypalAdapter();
        PaymentProcessor stripeProcessor = new StripeAdapter();

        paypalProcessor.processPayment(500.0);
        stripeProcessor.processPayment(1000.0);
    }
}

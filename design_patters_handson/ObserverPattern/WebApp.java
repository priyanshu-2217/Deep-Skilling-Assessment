package DesignPatterns.ObserverPattern;

public class WebApp implements Observer {
    public void update(String stockName, double price) {
        System.out.println("WebApp: " + stockName + " price updated to ₹" + price);
    }
}

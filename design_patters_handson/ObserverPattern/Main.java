package DesignPatterns.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStockPrice("TCS", 3525.50);
        market.setStockPrice("INFY", 1449.00);
    }
}

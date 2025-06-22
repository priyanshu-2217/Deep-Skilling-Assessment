package DesignPatterns.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");


        image1.display();
        image1.display();

        System.out.println();

        Image image2 = new ProxyImage("photo2.jpg");
        image2.display();
    }
}

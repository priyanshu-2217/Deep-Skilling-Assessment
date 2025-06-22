package DesignPatterns.ProxyPattern;

public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // Lazy loading
        } else {
            System.out.println("Using cached " + fileName);
        }
        realImage.display();
    }
}

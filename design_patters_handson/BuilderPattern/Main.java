package DesignPatterns.BuilderPattern;

// File: src/Main.java
// File: src/Main.java
public class Main {
    public static void main(String[] args) {
        // Create first computer
        Computer computer1 = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println(computer1);

        // Create another computer with different config
        Computer computer2 = new Computer.Builder()
                .setCpu("AMD Ryzen 5")
                .setRam("16GB")
                .build(); // No storage provided

        System.out.println(computer2);
    }
}


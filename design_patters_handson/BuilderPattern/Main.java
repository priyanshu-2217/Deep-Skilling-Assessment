package DesignPatterns.BuilderPattern;


public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println(computer1);


        Computer computer2 = new Computer.Builder()
                .setCpu("AMD Ryzen 5")
                .setRam("16GB")
                .build();

        System.out.println(computer2);
    }
}


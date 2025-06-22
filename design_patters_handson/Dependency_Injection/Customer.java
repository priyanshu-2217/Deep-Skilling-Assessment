package DesignPatterns.Dependency_Injection;

public class Customer {
    private String id;
    private String name;
    private String email;

    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}


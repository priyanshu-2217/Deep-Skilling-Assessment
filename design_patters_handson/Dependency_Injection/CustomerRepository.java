package DesignPatterns.Dependency_Injection;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}

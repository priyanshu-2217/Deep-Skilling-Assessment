package DesignPatterns.Dependency_Injection;
public class CustomerRepositoryImpl implements CustomerRepository {


    public CustomerRepositoryImpl() {
    }

    @Override
    public Customer findCustomerById(String id) {
        return new Customer(id, "Rahul Sharma", "rahul@example.com");
    }
}

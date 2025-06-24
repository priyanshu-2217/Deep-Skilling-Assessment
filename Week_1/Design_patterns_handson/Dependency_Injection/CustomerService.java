package Dependency_Injection;
public class CustomerService {
    private CustomerRepository customerRepo;

    // Constructor Injection
    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    public void showCustomer(String id) {
        Customer customer = customerRepo.findCustomerById(id);
        customer.displayInfo();
    }
}

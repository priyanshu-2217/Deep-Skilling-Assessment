package Dependency_Injection;

public class Main {
    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepositoryImpl();


        CustomerService service = new CustomerService(repository);


        service.showCustomer("C102");
    }
}

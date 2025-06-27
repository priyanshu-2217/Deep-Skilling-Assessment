package Employee_Management;

public class  ManageEmployee{
    static Employee[] employees = new Employee[10];
    static int count = 0;

    public static void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
        } else {
            System.out.println("Employee list is full.");
        }
    }

    public static void showEmployees() {
        System.out.println("\nAll Employees:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static Employee searchById(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    public static void deleteById(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Deleted employee with ID: " + id);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        addEmployee(new Employee(1, "Ravi", "Manager", 50000));
        addEmployee(new Employee(2, "Anita", "Clerk", 25000));
        addEmployee(new Employee(3, "Rohit", "HR", 30000));

        showEmployees();

        System.out.println("\nSearch Employee with ID 2:");
        Employee found = searchById(2);
        if (found != null)
            System.out.println("Found: " + found);
        else
            System.out.println("Not found");

        System.out.println("\nDelete Employee with ID 2:");
        deleteById(2);

        showEmployees();
    }
}

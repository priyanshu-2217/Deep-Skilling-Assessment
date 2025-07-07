package Week_3.SpringData_JDA.src.main.java.repository;

import model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // ✅ JPQL Query: Get all permanent employees
    @Query("SELECT e FROM Employee e WHERE e.permanent = true")
    List<Employee> getAllPermanentEmployees();

    // ✅ JPQL Query: Get average salary of all employees
    @Query("SELECT AVG(e.salary) FROM Employee e")
    Double getAverageSalary();

    // ✅ Native SQL Query: Get all employees sorted by date of birth
    @Query(value = "SELECT * FROM employee ORDER BY date_of_birth", nativeQuery = true)
    List<Employee> getAllEmployeesSortedByDob();

    // ✅ Named Parameters: Employees with salary greater than
    @Query("SELECT e FROM Employee e WHERE e.salary > :minSalary")
    List<Employee> findEmployeesWithSalaryAbove(@Param("minSalary") double minSalary);
}

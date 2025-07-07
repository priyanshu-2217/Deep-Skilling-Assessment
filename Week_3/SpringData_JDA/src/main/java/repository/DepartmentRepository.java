// DepartmentRepository.java
package Week_3.SpringData_JDA.src.main.java.repository;
import model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}

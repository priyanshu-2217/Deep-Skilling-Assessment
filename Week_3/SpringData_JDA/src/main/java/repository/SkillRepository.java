// SkillRepository.java
package Week_3.SpringData_JDA.src.main.java.repository;
import model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
}

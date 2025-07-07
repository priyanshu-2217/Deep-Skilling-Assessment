package Week_3.SpringData_JDA.src.main.java.service;

import model.Department;
import model.Employee;
import model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DepartmentRepository;
import repository.EmployeeRepository;
import repository.SkillRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private SkillRepository skillRepository;

    public Employee get(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
    public List<Employee> getAllPermanentEmployees() {
        return employeeRepository.getAllPermanentEmployees();
    }

    public double getAverageSalary() {
        return employeeRepository.getAverageSalary();
    }

    public List<Employee> getAllSortedByDob() {
        return employeeRepository.getAllEmployeesSortedByDob();
    }

    public List<Employee> getEmployeesWithSalaryAbove(double salary) {
        return employeeRepository.findEmployeesWithSalaryAbove(salary);
    }

    public void assignSkillToEmployee(int employeeId, int skillId) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        Optional<Skill> optionalSkill = skillRepository.findById(skillId);
        if (optionalEmployee.isPresent() && optionalSkill.isPresent()) {
            Employee employee = optionalEmployee.get();
            Skill skill = optionalSkill.get();
            Set<Skill> skills = employee.getSkillList();
            skills.add(skill);
            employee.setSkillList(skills);
            employeeRepository.save(employee);
        }
    }
}

CREATE OR REPLACE PACKAGE EmployeeManagement IS
  PROCEDURE HireEmployee(p_id NUMBER, p_name VARCHAR2, p_position VARCHAR2, p_salary NUMBER, p_dept VARCHAR2, p_date DATE);
  PROCEDURE UpdateEmployee(p_id NUMBER, p_salary NUMBER);
  FUNCTION AnnualSalary(p_id NUMBER) RETURN NUMBER;
END;
/
CREATE OR REPLACE PACKAGE BODY EmployeeManagement IS
  PROCEDURE HireEmployee(p_id NUMBER, p_name VARCHAR2, p_position VARCHAR2, p_salary NUMBER, p_dept VARCHAR2, p_date DATE) IS
  BEGIN
    INSERT INTO Employees VALUES (p_id, p_name, p_position, p_salary, p_dept, p_date);
  END;

  PROCEDURE UpdateEmployee(p_id NUMBER, p_salary NUMBER) IS
  BEGIN
    UPDATE Employees SET Salary = p_salary WHERE EmployeeID = p_id;
  END;

  FUNCTION AnnualSalary(p_id NUMBER) RETURN NUMBER IS
    v_salary NUMBER;
  BEGIN
    SELECT Salary * 12 INTO v_salary FROM Employees WHERE EmployeeID = p_id;
    RETURN v_salary;
  END;
END;
/

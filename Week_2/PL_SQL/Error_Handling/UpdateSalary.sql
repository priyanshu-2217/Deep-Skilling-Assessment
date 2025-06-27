CREATE OR REPLACE PROCEDURE UpdateSalary(
  p_emp_id NUMBER,
  p_percent NUMBER
) IS
  v_old_salary NUMBER;
BEGIN
  SELECT Salary INTO v_old_salary
  FROM Employees
  WHERE EmployeeID = p_emp_id;

  UPDATE Employees
  SET Salary = Salary + (Salary * p_percent / 100)
  WHERE EmployeeID = p_emp_id;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Salary updated for Employee ID: ' || p_emp_id);
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Error: Employee not found with ID ' || p_emp_id);
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Other error: ' || SQLERRM);
END;
/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  p_department VARCHAR2,
  p_bonus_percent NUMBER
) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_bonus_percent / 100)
  WHERE Department = p_department;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Bonus applied to department: ' || p_department);
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error applying bonus: ' || SQLERRM);
END;
/

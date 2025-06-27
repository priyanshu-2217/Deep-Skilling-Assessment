CREATE OR REPLACE PROCEDURE AddNewCustomer(
  p_cust_id NUMBER,
  p_name VARCHAR2,
  p_dob DATE,
  p_balance NUMBER
) IS
BEGIN
  INSERT INTO Customers(CustomerID, Name, DOB, Balance, LastModified)
  VALUES(p_cust_id, p_name, p_dob, p_balance, SYSDATE);

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Customer added successfully: ' || p_name);
EXCEPTION
  WHEN DUP_VAL_ON_INDEX THEN
    DBMS_OUTPUT.PUT_LINE('Error: Customer ID already exists - ' || p_cust_id);
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error inserting customer: ' || SQLERRM);
END;
/

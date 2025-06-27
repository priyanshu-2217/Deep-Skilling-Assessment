CREATE OR REPLACE PACKAGE AccountOperations IS
  PROCEDURE OpenAccount(p_id NUMBER, p_cust_id NUMBER, p_type VARCHAR2, p_balance NUMBER);
  PROCEDURE CloseAccount(p_id NUMBER);
  FUNCTION TotalCustomerBalance(p_cust_id NUMBER) RETURN NUMBER;
END;
/
CREATE OR REPLACE PACKAGE BODY AccountOperations IS
  PROCEDURE OpenAccount(p_id NUMBER, p_cust_id NUMBER, p_type VARCHAR2, p_balance NUMBER) IS
  BEGIN
    INSERT INTO Accounts VALUES (p_id, p_cust_id, p_type, p_balance, SYSDATE);
  END;

  PROCEDURE CloseAccount(p_id NUMBER) IS
  BEGIN
    DELETE FROM Accounts WHERE AccountID = p_id;
  END;

  FUNCTION TotalCustomerBalance(p_cust_id NUMBER) RETURN NUMBER IS
    v_total NUMBER;
  BEGIN
    SELECT SUM(Balance) INTO v_total FROM Accounts WHERE CustomerID = p_cust_id;
    RETURN NVL(v_total, 0);
  END;
END;
/

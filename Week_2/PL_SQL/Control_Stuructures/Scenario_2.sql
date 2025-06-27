// First create the column isVip
ALTER TABLE Customers ADD IsVIP CHAR(1);

BEGIN
  FOR rec IN (
    SELECT CustomerID, Balance FROM Customers
    WHERE Balance > 10000
  ) LOOP
    UPDATE Customers
    SET IsVIP = 'Y'
    WHERE CustomerID = rec.CustomerID;

    DBMS_OUTPUT.PUT_LINE('Promoted to VIP: Customer ID ' || rec.CustomerID);
  END LOOP;
END;
/

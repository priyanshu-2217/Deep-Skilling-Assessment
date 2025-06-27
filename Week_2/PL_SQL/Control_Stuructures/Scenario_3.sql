BEGIN
  FOR rec IN (
    SELECT l.LoanID, l.EndDate, c.Name, c.CustomerID
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || rec.LoanID ||
                         ' for Customer ' || rec.Name ||
                         ' (ID: ' || rec.CustomerID || ') is due on ' || TO_CHAR(rec.EndDate, 'DD-Mon-YYYY'));
  END LOOP;
END;
/

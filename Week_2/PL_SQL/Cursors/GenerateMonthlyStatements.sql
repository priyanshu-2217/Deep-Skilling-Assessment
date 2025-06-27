DECLARE
  CURSOR txn_cursor IS
    SELECT t.TransactionID, c.Name, t.AccountID, t.Amount, t.TransactionType, t.TransactionDate
    FROM Transactions t
    JOIN Accounts a ON t.AccountID = a.AccountID
    JOIN Customers c ON a.CustomerID = c.CustomerID
    WHERE TO_CHAR(t.TransactionDate, 'MM-YYYY') = TO_CHAR(SYSDATE, 'MM-YYYY');

  txn_rec txn_cursor%ROWTYPE;
BEGIN
  OPEN txn_cursor;

  LOOP
    FETCH txn_cursor INTO txn_rec;
    EXIT WHEN txn_cursor%NOTFOUND;

    DBMS_OUTPUT.PUT_LINE(
      'Customer: ' || txn_rec.Name ||
      ', AccountID: ' || txn_rec.AccountID ||
      ', Type: ' || txn_rec.TransactionType ||
      ', Amount: ' || txn_rec.Amount ||
      ', Date: ' || txn_rec.TransactionDate
    );
  END LOOP;

  CLOSE txn_cursor;
END;
/

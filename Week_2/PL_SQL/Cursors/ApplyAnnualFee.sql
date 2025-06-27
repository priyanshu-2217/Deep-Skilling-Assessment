DECLARE
  CURSOR acc_cursor IS
    SELECT AccountID, Balance FROM Accounts;

  acc_rec acc_cursor%ROWTYPE;
BEGIN
  OPEN acc_cursor;

  LOOP
    FETCH acc_cursor INTO acc_rec;
    EXIT WHEN acc_cursor%NOTFOUND;

    UPDATE Accounts
    SET Balance = Balance - 200,
        LastModified = SYSDATE
    WHERE AccountID = acc_rec.AccountID;

    DBMS_OUTPUT.PUT_LINE('Annual fee applied to AccountID: ' || acc_rec.AccountID);
  END LOOP;

  CLOSE acc_cursor;
END;
/

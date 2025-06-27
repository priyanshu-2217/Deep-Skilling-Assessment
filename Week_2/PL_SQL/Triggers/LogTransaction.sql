//First create this table before trigger
CREATE TABLE AuditLog (
  LogID NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  AccountID NUMBER,
  Amount NUMBER,
  TransactionType VARCHAR2(10),
  ActionTime DATE
);
CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
  INSERT INTO AuditLog (AccountID, Amount, TransactionType, ActionTime)
  VALUES (:NEW.AccountID, :NEW.Amount, :NEW.TransactionType, SYSDATE);
END;
/

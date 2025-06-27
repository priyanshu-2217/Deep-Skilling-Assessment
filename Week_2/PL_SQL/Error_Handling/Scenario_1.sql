CREATE OR REPLACE PROCEDURE SafeTransferFunds(
  p_from_account_id NUMBER,
  p_to_account_id NUMBER,
  p_amount NUMBER
) IS
  v_balance NUMBER;
BEGIN
  -- Check balance of from-account
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = p_from_account_id;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
  END IF;

  -- Deduct from sender
  UPDATE Accounts
  SET Balance = Balance - p_amount
  WHERE AccountID = p_from_account_id;

  -- Add to receiver
  UPDATE Accounts
  SET Balance = Balance + p_amount
  WHERE AccountID = p_to_account_id;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Transfer successful');
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/

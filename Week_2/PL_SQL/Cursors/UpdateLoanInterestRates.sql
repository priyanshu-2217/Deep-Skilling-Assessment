DECLARE
  CURSOR loan_cursor IS
    SELECT LoanID, InterestRate FROM Loans;

  loan_rec loan_cursor%ROWTYPE;
BEGIN
  OPEN loan_cursor;

  LOOP
    FETCH loan_cursor INTO loan_rec;
    EXIT WHEN loan_cursor%NOTFOUND;

    UPDATE Loans
    SET InterestRate = loan_rec.InterestRate + 0.5
    WHERE LoanID = loan_rec.LoanID;

    DBMS_OUTPUT.PUT_LINE('Updated LoanID: ' || loan_rec.LoanID ||
                         ', New Rate: ' || (loan_rec.InterestRate + 0.5));
  END LOOP;

  CLOSE loan_cursor;
END;
/

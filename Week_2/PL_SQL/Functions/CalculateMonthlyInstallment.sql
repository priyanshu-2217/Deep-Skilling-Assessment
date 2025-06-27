CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
  p_loan_amount NUMBER,
  p_annual_rate NUMBER,
  p_years NUMBER
)
RETURN NUMBER
IS
  monthly_rate NUMBER;
  total_months NUMBER;
  emi NUMBER;
BEGIN
  monthly_rate := p_annual_rate / 12 / 100;
  total_months := p_years * 12;

  emi := (p_loan_amount * monthly_rate * POWER(1 + monthly_rate, total_months)) /
         (POWER(1 + monthly_rate, total_months) - 1);

  RETURN ROUND(emi, 2);
END;
/

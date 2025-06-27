# Oracle PL/SQL Bank Management Assignment

This repository contains structured PL/SQL scripts simulating a mini Bank Management System. It includes all key PL/SQL concepts such as control structures, functions, procedures, triggers, error handling, cursors, and packages.

---

## 📁 Folder Structure

| Folder/File            | Purpose                                                                 |
|------------------------|-------------------------------------------------------------------------|
| `Control_Structures/`  | PL/SQL blocks with conditional logic (e.g., age-based interest discount) |
| `Cursors/`             | Explicit cursor examples for batch operations like monthly statements    |
| `Error_Handling/`      | Procedures using exception handling in operations like fund transfer     |
| `Functions/`           | User-defined functions like `CalculateAge`, `HasSufficientBalance`       |
| `Package/`             | Modularized packages like `CustomerManagement`, `AccountOperations`      |
| `Stored_Procedure/`    | Reusable stored procedures like `TransferFunds`, `UpdateSalary`          |
| `Triggers/`            | Business rule automation and audit logging                               |
| `Create_Tables.sql`    | Creates base tables (Customers, Loans, Accounts, etc.)                   |
| `Insert_Tables.sql`    | Inserts sample data into the tables                                      |
| `Readme.md`            | You're reading it!                                                       |

---

## ✅ How to Run

### 🔹 Option 1: Oracle Live SQL (Recommended for beginners)
1. Open [Oracle Live SQL](https://livesql.oracle.com)
2. Log in or sign up (free Oracle account)
3. Run files in this **order**:
    - `Create_Tables.sql`
    - `Insert_Tables.sql`
    - Then open each folder and copy/run files:
        - `Control_Structures/`
        - `Functions/`
        - `Stored_Procedure/`
        - `Error_Handling/`
        - `Cursors/`
        - `Package/`
        - `Triggers/`
4. Outputs from `DBMS_OUTPUT.PUT_LINE` appear in **Step 3 (Results)** tab.

### 🔹 Option 2: Run Locally via Oracle SQL Developer or Oracle XE

#### Requirements:
- Oracle XE or Oracle Database installed
- [Oracle SQL Developer](https://www.oracle.com/tools/downloads/sqldev-downloads.html)

#### Steps:
1. Open SQL Developer and connect to your local database.
2. Open and run each `.sql` script manually in correct order.
3. To see output from `DBMS_OUTPUT`, do:
    - Go to `View → DBMS Output`
    - Enable it using the green “+” button
4. Run anonymous blocks to test procedures or functions if needed.

---

## 💡 Concepts Covered

- ✅ Table creation, primary and foreign keys
- ✅ Loops, IF-ELSE, control logic in PL/SQL
- ✅ Stored procedures and custom exception handling
- ✅ Triggers for business logic and auditing
- ✅ Explicit Cursors for record-by-record processing
- ✅ User-defined Functions with RETURN values
- ✅ Modular Packages for clean code organization

---

## 📌 Notes

- You can run function/procedure logic in anonymous blocks like:
```sql
DECLARE
  v_result BOOLEAN;
BEGIN
  v_result := HasSufficientBalance(1, 500);
  DBMS_OUTPUT.PUT_LINE('Has Balance: ' || CASE WHEN v_result THEN 'YES' ELSE 'NO' END);
END;
/

Exercise 4: Employee Management System

🎯 Objective:
Create a simple system to add, search, delete, and display employee records using arrays.

🧾 Setup:
- Employee.java → Holds employeeId, name, position, salary
- ManageEmployees.java → Uses an array of Employee objects
- Capacity of array is fixed (10 employees)

🛠 Operations:
- Add: Adds employee if space is available
- Search: Finds employee by ID
- Traverse: Loops through the array to print all employees
- Delete: Removes employee by ID and shifts elements

📈 Time Complexities:
- Add: O(1) (if space is available)
- Search: O(n) (linear search)
- Traverse: O(n)
- Delete: O(n) (shifting needed)

⚠️ Limitations of Arrays:
- Fixed size: Cannot grow dynamically
- Insert/delete in middle is slow
- Searching is not efficient for large data

✅ Use arrays for small and simple data.
Use ArrayList, HashMap or databases for larger and more flexible systems.

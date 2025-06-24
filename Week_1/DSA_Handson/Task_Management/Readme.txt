Exercise 5: Task Management System

📌 Goal:
Build a simple task manager using a Singly Linked List to dynamically add, delete, search and display tasks.

📦 Setup:
- Task.java → Node with taskId, name, status, and next pointer
- TaskManager.java → Contains methods for all operations

🛠 Operations:
1. Add Task → Adds to end of the list
2. Search Task → Searches by taskId
3. Traverse/Show Tasks → Loops through list
4. Delete Task → Removes by ID

🧠 Time Complexities:
- Add: O(n)
- Search: O(n)
- Delete: O(n)
- Traverse: O(n)

✅ Linked List vs Array:
- Linked List allows **dynamic size**, no need to define size in advance
- Easier **insertion/deletion** compared to arrays
- No shifting needed like arrays

⚠️ Limitation: No random access like arrays (you can't jump to an index directly)

✍️ Notes:
- Used simple logic for beginner understanding
- Use `Scanner` to take input if needed

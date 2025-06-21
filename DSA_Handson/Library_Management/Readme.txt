Exercise 6: Library Management System

📌 Goal:
Build a system where users can search for books by title using linear and binary search.

🧾 Setup:
- Book.java: Contains bookId, title, and author
- Library.java: Stores books and provides search functionality

🛠 Methods:
1. linearSearch(title) → Loops through each book, checks title
2. binarySearch(title) → Works only if the array is sorted by title

🧠 Time Complexity:
- Linear Search: O(n)
- Binary Search: O(log n) (Only on sorted list)

✅ When to Use What:
- Linear Search: Use when data is small or **unsorted**
- Binary Search: Use when data is **sorted**, and fast search is needed

📌 Note:
- Used `Arrays.sort()` to sort books alphabetically by title before binary search

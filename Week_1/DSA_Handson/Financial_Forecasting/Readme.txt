Exercise 7: Financial Forecasting

📌 Goal:
Use a recursive function to predict future value based on past growth rate.

🧾 Method Used:
Recursive function:
- Base Case: if years == 0 → return current value
- Recursive Step: value * (1 + rate) → for remaining years

🔢 Example:
Initial Value = ₹10,000
Growth Rate = 10%
Years = 5
Output: ₹16,105.10

🧠 Time Complexity:
- Without optimization: O(n), where n = number of years

⚡ How to Optimize:
- Recursion is fine for small years (<= 10–20)
- Use **iteration or memoization** for large inputs to avoid stack overflow

🚀 Alternative:
Use formula-based approach:
Future Value = P × (1 + r)^n

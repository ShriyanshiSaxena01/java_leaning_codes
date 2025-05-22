public class datatypeincrndecre7 {
    

// ✅ 1. Data Type of Expressions in Java
// In Java, the data type of an expression depends on the types of the values involved and Java’s type promotion rules.

// 🔹 Type Promotion Rules:
// If different types are used in an expression, Java automatically promotes smaller types to larger types.

// byte, short, and char are promoted to int when used in expressions.

// If one operand is double, the entire expression becomes double.

// 🔸 Examples:
// java
// Copy
// Edit
// int a = 10;
// double b = 5.5;
// double result = a + b;  // 'a' is promoted to double, result is double

// byte x = 10;
// byte y = 20;
// int z = x + y;          // x and y are promoted to int, so result is int

// char ch = 'A';
// int code = ch + 1;      // char is promoted to int (Unicode of 'A' is 65), so code = 66
// ✅ 2. Increment/Decrement Operators in Java
// Java supports two types of increment (++) and decrement (--) operators:

// 🔹 Prefix: ++x or --x
// The variable is updated first, then used.

// 🔹 Postfix: x++ or x--
// The variable is used first, then updated.

// 🔸 Example:

// int a = 5;
// System.out.println(++a);  // Output: 6 (a is incremented, then printed)
// System.out.println(a++);  // Output: 6 (a is printed, then incremented)
// System.out.println(a);    // Output: 7

// int b = 10;
// System.out.println(--b);  // Output: 9
// System.out.println(b--);  // Output: 9
// System.out.println(b);    // Output: 8
// ✅ Important Notes:
// These operators only work with numeric types (byte, short, int, long, float, double, and char).

// They modify the original variable directly.

// They are often used in loops or counters.





}

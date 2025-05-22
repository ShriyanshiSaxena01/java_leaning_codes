public class operator6 {
    









// In Java, operators are special symbols or keywords used to perform operations on variables and values. The types of operators in Java are:

// 1. Arithmetic Operators
// Used for basic mathematical operations.

// Operator	Description	Example (a = 10, b = 5)
// +	Addition	a + b → 15
// -	Subtraction	a - b → 5
// *	Multiplication	a * b → 50
// /	Division	a / b → 2
// %	Modulus (remainder)	a % b → 0

// 2. Relational (Comparison) Operators
// Used to compare two values.

// Operator	Description	Example (a = 10, b = 5)
// ==	Equal to	a == b → false
// !=	Not equal to	a != b → true
// >	Greater than	a > b → true
// <	Less than	a < b → false
// >=	Greater than or equal	a >= b → true
// <=	Less than or equal	a <= b → false

// 3. Logical Operators
// Used to combine multiple boolean expressions.

// Operator	Description	Example
// &&	Logical AND	a > 5 && b < 10 → true
// `		`
// !	Logical NOT	!(a > b) → false

// 4. Assignment Operators
// Used to assign values to variables.

// Operator	Description	Example
// =	Assign	a = 5
// +=	Add and assign	a += 2 → a = a + 2
// -=	Subtract and assign	a -= 2
// *=	Multiply and assign	a *= 2
// /=	Divide and assign	a /= 2
// %=	Modulus and assign	a %= 2

// 5. Unary Operators
// Work with a single operand.

// Operator	Description	Example
// +	Unary plus	+a
// -	Unary minus	-a
// ++	Increment	a++ or ++a
// --	Decrement	a-- or --a
// !	Logical NOT	!true → false

// 6. Bitwise Operators
// Work on bits and perform bit-by-bit operations.

// Operator	Description
// &	Bitwise AND
// `	`
// ^	Bitwise XOR
// ~	Bitwise Complement
// <<	Left shift
// >>	Right shift
// >>>	Zero fill right shift

// 7. Ternary Operator
// Short form of if-else condition.

// java
// Copy code
// condition ? expression1 : expression2
// Example:

// java
// Copy code
// int result = (a > b) ? a : b;
// 8. Instanceof Operator
// Checks whether an object is an instance of a specific class or subclass.

// java
// Copy code
// obj instanceof ClassName
// Let me know if you want examples or a simple PDF/notes version!






// You said:
// operator precidence and associativivty


// ChatGPT said:
// In Java, operator precedence and associativity determine how expressions are evaluated when multiple operators are used.

// 🔹 What is Operator Precedence?
// It defines which operator is evaluated first in an expression.

// For example:

// java
// Copy code
// int result = 10 + 2 * 5;  // result = 10 + (2 * 5) = 20
// Here, * has higher precedence than +, so multiplication happens first.

// 🔹 What is Associativity?
// It defines the direction in which operators of the same precedence are evaluated — either left to right or right to left.

// For example:

// java
// Copy code
// int a = 5, b = 10, c = 15;
// int result = a + b + c; // (5 + 10) + 15 → evaluated left to right
// 🔸 Java Operator Precedence Table (Highest to Lowest)
// Precedence	Operators	Associativity	Description
// 1	()	Left to Right	Parentheses
// 2	++, --, +, -, ~, !	Right to Left	Unary
// 3	*, /, %	Left to Right	Multiplicative
// 4	+, -	Left to Right	Additive
// 5	<<, >>, >>>	Left to Right	Shift
// 6	<, <=, >, >=, instanceof	Left to Right	Relational
// 7	==, !=	Left to Right	Equality
// 8	&	Left to Right	Bitwise AND
// // 9	^	Left to Right	Bitwise XOR
// // 10	`	`	Left to Right
// // 11	&&	Left to Right	Logical AND
// // 12	`		`
// // 13	? :	Right to Left	Ternary (conditional)
// // 14	=, +=, -=, *=, /=, etc.	Right to Left	Assignment

// // 🔹 Example to Show Precedence & Associativity
// // java
// // Copy code
// // int a = 10, b = 5, c = 2;
// // int result = a - b + c * 3;
// // // = 10 - 5 + (2 * 3) → 10 - 5 + 6 → 11
// // 🔸 Tips to Remember
// // Use parentheses () to make expressions clear.

// // Unary, assignment, and ternary operators are evaluated right to left.

// // Most other operators are left to right.











// int a = 10;
// int b = 3;
// // Now, here's the result of all Java operators using a = 10 and b = 3:

// // ✅ 1. Arithmetic Operators

// a + b = 10 + 3 = 13
// a - b = 10 - 3 = 7
// a * b = 10 * 3 = 30
// a / b = 10 / 3 = 3 (integer division)
// a % b = 10 % 3 = 1

// // ✅ 2. Relational Operators

// a == b → 10 == 3 → false  
// a != b → 10 != 3 → true  
// a > b  → 10 > 3  → true  
// a < b  → 10 < 3  → false  
// a >= b → 10 >= 3 → true  
// a <= b → 10 <= 3 → false  

// // ✅ 3. Logical Operators
// (Using comparison results)

// java
// Copy code
// (a > b) && (b < 5) → true && true → true  
// (a > b) || (b > 5) → true || false → true  
// !(a < b) → !false → true  
// ✅ 4. Assignment Operators
// java
// Copy code
// a = 10;

// a += b → a = a + b → a = 13  
// a -= b → a = a - b → a = 10  
// a *= b → a = a * b → a = 30  
// a /= b → a = a / b → a = 3  
// a %= b → a = a % b → a = 1  
// ✅ 5. Unary Operators
// java
// Copy code
// +a = +10 → 10  
// -a = -10 → -10  
// ++a = 11 (pre-increment)  
// a++ = 11 (post-increment, then a = 12)  
// --a = 11 (pre-decrement)  
// a-- = 11 (post-decrement, then a = 10)  
// ✅ 6. Bitwise Operators
// java
// Copy code
// a = 10 → 1010  
// b = 3  → 0011  

// a & b = 10 & 3 = 1010 & 0011 = 0010 = 2  
// a | b = 10 | 3 = 1010 | 0011 = 1011 = 11  
// a ^ b = 10 ^ 3 = 1010 ^ 0011 = 1001 = 9  
// ~a = ~10 = -(10 + 1) = -11  
// a << 1 = 10 << 1 = 20  
// a >> 1 = 10 >> 1 = 5  
// ✅ 7. Ternary Operator
// java
// Copy code
// int max = (a > b) ? a : b;
// → (10 > 3) ? 10 : 3 → max = 10
// ✅ 8. instanceof Operator
// java
// Copy code
// String str = "Hello";
// str instanceof String → true




}

// import java.lang.reflect.Method;

// public class string8 {
    
//     Introduction to Strings
// A string is a sequence of characters.
// Strings are objects that represent a char array. For example :
// char[] str = {'S','h','R','R','Y'};
// String s = new String(str);
// is same as :

// String s = "shivi";
// Strings are immutable and cannot be changed.
// java.lang.String class is used to create a String object.
// The string is a class but can be used as a data type.
// Syntax of strings in Java :
// String <String_name> = "<sequence_of_string>";
// Example :
//  String str = "CodeWithHarry";
// In the above example, str is a reference, and “CodeWithHarrt” is an object.

// Different ways to create a string in Java :
// In Java, strings can be created in two ways :

// By using string literal
// By using the new 
// Creating String using String literal :
// String s1= "String literal"
// We use double quotes("") to create string using string literal. Before creating a new string instance, JVM verifies if the same string is already present in the string pool or not. If it is already present, then JVM returns a reference to the pooled instance otherwise, a new string instance is created.



// In the above diagram, notice that string "Harry" is already present in the string pool, which is pointed by the str1. When we try to create the same string object using str2, JVM finds that string object with the value "Harry" is already present in the string pool; therefore, instead of creating a new object, a reference to the same object is returned.

// Creating String using new :
// String s=new String("shivi");
// When we create a string using "new", a new object is always created in the heap memory.



// In the above diagram, you can see that although the value of both string objects is the same, i.e., "Harry" still two different objects are created, and they are referred by two different reference variables, i.e., str1 and str2.

// See the examples given below to get a better understanding of String literal and String object :

// String str1 = "shivito";
// String str2 = "shivito"
// System.out.println(str1 == str2); 
// Output :
// True
// Returns true because str1 and str2 are referencing the same object present in the string constant pool. Now, let's see the case of the String object :

// String str1 = new String("Keep coding"); 
// String str2 = new String("Keep coding""); 
// System.out.println(str1 == str2); 
// Output :
// False
// Although the value of both the string object is the same, still false is displayed as output because str1 and str2 are two different string objects created in the heap. That's why it is not considered a good practice two compare two strings using the == operator. Always use the equals() method to compare two strings in Java.

// Different ways to print in Java :
// We can use the following ways to print in Java:

// System.out.print() // No newline at the end
// System.out.println() // Prints a new line at the end
// System.out.printf()
// System.out.format()
// System.out.printf("%c",ch)
//   %d for int
//   %f for float
//   %c for char
//   %s for string 
// Code as written in the video
// package com.company;
// import java.util.Scanner;

// public class cwh_13_strings {
//     public static void main(String[] args) {
//         // String name = new String("shivi");
//         // String name = "shivi";
//         // System.out.print("The name is: ");
//         // System.out.print(name);
//         int a = 6;
//         float b = 5.6454f;
//         System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
//         //System.out.format("The value of a is %d and value of b is %f", a, b);
//         Scanner sc = new Scanner(System.in);
// // String Methods in Java
// String Methods operate on Java Strings. They can be used to find the length of the string, convert to lowercase, etc.

// Some of the commonly used String methods are:

// String name = “Harry”;
// (Indexes of the above string are as follows: 0-H, 1-a, 2-r, 3-r, 4-y)

// Method	Description
// 1. length()	Returns the length of String name. (5 in this case)
// 2. toLowerCase()	Converts all the characters of the string to the lower case letters.
// 3. toUpperCase()	Converts all the characters of the string to the upper case letters.
// 4. trim()	Returns a new String after removing all the leading and trailing spaces from the original string.
// 5. substring(int start)	
// Returns a substring from start to the end. Substring(3) returns “ry”. [Note that indexing starts from 0]

// 6. substring(int start, int end)	Returns a substring from the start index to the end index. The start index is included, and the end is excluded.
// 7. replace(‘r’, ‘p’)	Returns a new string after replacing r with p. Happy is returned in this case. (This method takes char as argument)
// 8. startsWith(“Ha”)	Returns true if the name starts with the string “Ha”. (True in this case)
// 9. endsWith(“ry”)	Returns true if the name ends with the string “ry”. (True in this case)
// 10. charAt(2)	Returns the character at a given index position. (r in this case)
// 11. indexOf(“s”)	Returns the index of the first occurrence of the specified character in the given string.
// 12. lastIndexOf(“r”)	Returns the last index of the specified character from the given string. (3 in this case)
// 13. equals(“Harry”)	Returns true if the given string is equal to “Harry” false otherwise [Case sensitive]
// 14.equalsIgnoreCase(“harry”)	Returns true if two strings are equal, ignoring the case of characters.
 

// Escape Sequence Characters : 
// The sequence of characters after backslash ‘\’ = Escape Sequence Characters
// Escape Sequence Characters consist of more than one character but represent one character when used within the strings.
// Examples: \n (newline), \t (tab), \’ (single quote), \\ (backslash), etc.


















// }




public class string8 {
    public static void main(String[] args) {
        String name = "shivi";

        // 1. length()
        System.out.println("Length: " + name.length());  // 5

        // 2. charAt()
        System.out.println("Char at index 2: " + name.charAt(2));  // i

        // 3. substring()
        System.out.println("Substring(1, 4): " + name.substring(1, 4));  // hiv

        // 4. toUpperCase()
        System.out.println("Uppercase: " + name.toUpperCase());  // SHIVI

        // 5. toLowerCase()
        System.out.println("Lowercase: " + name.toLowerCase());  // shivi

        // 6. equals()
        System.out.println("Equals 'shivi': " + name.equals("shivi"));  // true

        // 7. equalsIgnoreCase()
        System.out.println("EqualsIgnoreCase 'SHIVI': " + name.equalsIgnoreCase("SHIVI"));  // true

        // 8. contains()
        System.out.println("Contains 'vi': " + name.contains("vi"));  // true

        // 9. indexOf()
        System.out.println("Index of 'i': " + name.indexOf('i'));  // 2 (first 'i')

        // 10. lastIndexOf()
        System.out.println("Last index of 'i': " + name.lastIndexOf('i'));  // 4

        // 11. replace()
        System.out.println("Replace 'i' with 'e': " + name.replace('i', 'e'));  // sheve

        // 12. startsWith()
        System.out.println("Starts with 'sh': " + name.startsWith("sh"));  // true

        // 13. endsWith()
        System.out.println("Ends with 'vi': " + name.endsWith("vi"));  // true

        // 14. isEmpty()
        System.out.println("Is empty: " + name.isEmpty());  // false

        // 15. trim()
        String nameWithSpaces = "  shivi  ";
        System.out.println("Trimmed: '" + nameWithSpaces.trim() + "'");  // 'shivi'

        // 16. split()
        String[] parts = name.split("i");
        System.out.print("Split by 'i': ");
        for(String part : parts) {
            System.out.print(part + " ");  // sh v 
        }

        // 17. concat()
        System.out.println("\nConcatenated: " + name.concat("123"));  // shivi123

        // 18. compareTo()
        System.out.println("Compare to 'shiva': " + name.compareTo("shiva"));  // positive value

        // 19. toCharArray()
        char[] chars = name.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");  // s h i v i 
        }
    }
}

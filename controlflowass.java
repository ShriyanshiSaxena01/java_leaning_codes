import java.util.Scanner;

public class controlflowass {

    public static void main(String[] args) {




//     Q1. Write a java program to print number from -5 to 5
// -5
// -4
// -3
// -2
// -1
// 0
// 1
// 2
// 3
// 4
// 5


// for(int i=-5;i<=5;i++)
// {
//     System.out.println(i);

// }



// =====================================================================================



// Q2. Write a java program to print number from 100 to  91
// 100
// 99
// 98
// 97
// 96
// 95
// 94
// 93
// 92
// 91


      

// for(int i=100;i>=91;i--)
// {
//     System.out.println(i);

// }



// =====================================================================================



// Q3. Write a program to  print alternate number from 80 To 70.
// 80
// skip
// 78
// skip
// 76
// skip
// 74
// skip
// 72
// skip
// 70

// for(int i = 80; i>=70;i-=2)
// {
//     System.out.println(i);
// }



// =====================================================================================


// Q4. Write a program to print Sqaure of Even number from 10 To 20
// 10 Square is : 100
// 12 Square is : 144
// 14 Square is : 196
// 16 Square is : 256
// 18 Square is : 324
// 20 Square is : 400


// for(int i = 10; i<=20;i+=2)
// {
//     int c= i*i;
//     System.out.println(c);
// }



// =====================================================================================



// Q5. Write a program to print cube of odd number from 1 to 10.
// Cube of 1 = 1
// Cube of 3 = 27
// Cube of 5 = 125
// Cube of 7 = 343
// Cube of 9 = 729




// for(int i = 1; i<=10;i++)
// {

//     if(!(i%2==0))
//     {
//     int c= i*i*i;
//     System.out.println(c);
//     }
    
// }


// =====================================================================================



// Q6. A spy number is a number where the sum of its digits equals the product of its digits. 
// For example, 1124 is a spy number, 
// the sum of its digits is 1+1+2+4=8 and 
// the product of its digits is 1*1*2*4=8.

// Enter Number : 1124
// This is Spy Number


//  Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Number: ");
//         int num = sc.nextInt();
//         int originalNum = num;

//         int sum = 0;
//         int product = 1;

//         while (num > 0) {
//             int digit = num % 10;      // get last digit
//             sum += digit;             // add digit to sum
//             product *= digit;         // multiply digit to product
//             num = num / 10;           // remove last digit
//         }

//         if (sum == product) {
//             System.out.println(originalNum + " is a Spy Number");
//         } else {
//             System.out.println(originalNum + " is NOT a Spy Number");
//         }





// =====================================================================================




// Q7. A number is said to be unique , if the digits in it are not repeated. for 
// example, 12345 is a unique number. 123445 is not a unique number.
// Enter Any Number: 12345
// This is unique Number



//  Scanner sc = new Scanner(System.in);

//          System.out.print("Enter Any Number: ");
//         int num = sc.nextInt();
//         int originalNum = num;

//         boolean[] digits = new boolean[10]; // to store digits 0-9

//         boolean isUnique = true;

//         while (num > 0) {
//             int digit = num % 10;
//             if (digits[digit]) {
//                 isUnique = false;
//                 break;
//             }
//             digits[digit] = true;
//             num = num / 10;
//         }

//         if (isUnique) {
//             System.out.println(originalNum + " is a Unique Number");
//         } else {
//             System.out.println(originalNum + " is NOT a Unique Number");
//         }



















        
    }
   




}

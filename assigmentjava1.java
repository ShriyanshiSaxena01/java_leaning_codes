
// Q1. Create a Java Application and write a Program that displays “Hello World” on the Screen.
   

// public class assigmentjava1 {

//       public static void main(String[] args) {
//          System.out.println("hello world");
//       }


// }



// Q2. Write a Program that accepts 2 numbers and display thei sum, product, difference,and quotient of the two numbers
   
// import java.util.Scanner;
// public class assigmentjava1 {

//       public static void main(String[] args) {
        
//         Scanner obj= new Scanner(System.in);
//         System.out.println("enter a number1 ");
//         int number1 = obj.nextInt();
         
//        System.out.println("enter a number2 ");
//         int number2 = obj.nextInt();


//         System.out.println(number1+number2);
//         System.out.println(number1*number2);
//         System.out.println(number1-number2);
//         System.out.println(number1/number2);
//       }


// }

 
// Q3. Write a Program that accepts a String by your name and display it on the screen?

// import java.util.Scanner;

// public class assigmentjava1 {

//       public static void main(String[] args) {
     
//         Scanner person=new Scanner(System.in);
//         System.out.println("enter your name");
//         String n=person.nextLine();


//         System.out.println(n);
//       }


// }






 
// Q4.Write a Program that accepts a float variable by radius and display the area and circumference.

// import java.util.Scanner;

// public class assigmentjava1 {

//       public static void main(String[] args) {
     
//         Scanner num=new Scanner(System.in);
//         System.out.println("enter radious");
//         Float radious=num.nextFloat();
//         float pie=3.14f;

//         // Area=πr2
//         // Circumference=2πr
//         // π≈3.14


//          System.out.println("area of circle "+  pie*radious*radious);
//          System.out.println("circumference of circle "+  2*pie*radious);
//       }


// }








 
// Q5.Write a Program that accepts a float variable by radius and display the area and circumference.

// import java.util.Scanner;

// public class assigmentjava1 {

      
        
//         public static void main(String[] args) {
            
//             Scanner input = new Scanner(System.in);
            
//             System.out.println("Enter width of the rectangle:");
//             float width = input.nextFloat();
            
//             System.out.println("Enter height of the rectangle:");
//             float height = input.nextFloat();
    
//             float area = width * height;
//             float perimeter = 2 * (width + height);
    
//             System.out.println("Area of rectangle: " + area);
//             System.out.println("Perimeter of rectangle: " + perimeter);

// }

// }









// Q6.Enter Principle Amount: 1000
// Enter Rate of Interest : 2.5
// Enter Time in Month: 3
// Simple Interest : 75
// Compound Interest: 1075


// import java.util.Scanner;

// public class assigmentjava1 {

//       public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Principal Amount: ");
//         double principal = sc.nextDouble();

//         System.out.print("Enter Rate of Interest (monthly in %): ");
//         double rate = sc.nextDouble();

//         System.out.print("Enter Time in Months: ");
//         int time = sc.nextInt();

//         double simpleInterest = (principal * rate * time) / 100;

//         double compoundAmount = principal * Math.pow((1 + rate / 100), time);
//         double compoundInterest = compoundAmount - principal;

//         System.out.println("Simple Interest: " + simpleInterest);
//         System.out.println("Compound Interest: " + compoundInterest);
//         System.out.println("Compound Amount: " + compoundAmount);
         
//       }


// }






 
// Q7.Write a Program that accepts and displays your name, address and phone on the screen.

// import java.util.Scanner;

// class assigmentjava1 {

//       public static void main(String[] args) {
     
//         Scanner num=new Scanner(System.in);

//         System.out.println("enter your name");
//         String names=num.nextLine();
//         System.out.println("enter your number");
//         String phone=num.nextLine();
//         System.out.println("enter your address");
//         String ads=num.nextLine();
       

//         System.out.println("-----shiYour Details------ ");
//          System.out.println("Your is name : " + names);
//          System.out.println("Your is number : " + phone);
//          System.out.println("Your is address : " + ads);
         
//       }


// }










 
// Q8.Write a Program that accepts and displays your name, address and phone on the screen.

// import java.util.Scanner;

// class assigmentjava1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

       
//         System.out.print("Input seconds: ");
//         int totalSeconds = sc.nextInt();

        
//         int hours = totalSeconds / 3600;
//         int remainingSeconds = totalSeconds % 3600;
//         int minutes = remainingSeconds / 60;
//         int seconds = remainingSeconds % 60;

       
//         System.out.println("There are:");
//         System.out.println("H:M:S - " + hours + ":" + minutes + ":" + seconds);
//     }
// }








 
// Q9.Write a java program to convert a given integer (in days) to years, months and
// days, assumes that all months have 30 days and all years have 365 days. Test Data
// : Input no. of days: 2535




// import java.util.Scanner;

// class assigmentjava1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Input number of days: ");
//         int totalDays = sc.nextInt();//25300

       
//         int years = totalDays / 365;  //69
//         int remainingDays = totalDays % 365;  

//         int months = remainingDays / 30;
//         int days = remainingDays % 30;

       
//         System.out.println(years + " Year(s)");
//         System.out.println(months + " Month(s)");
//         System.out.println(days + " Day(s)");
//     }
// }






 
// Q10. Write a java program that read 5 numbers and sum of all odd values between them
// Test Data :
// Input the first number: 11
// Input the second number: 17
// Input the third number: 13
// Input the fourth number: 12
// Input the fifth number: 5
// Expected Output:
// Sum of all odd values: 46



 
// import java.util.Scanner;

// class assigmentjava1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sumOfOdds = 0;

//         for (int i = 1; i <= 5; i++) {
//             System.out.print("Input number " + i + ": ");
//             int num = sc.nextInt();
//             if (num % 2 != 0) {
//                 sumOfOdds = sumOfOdds+num;
//             }
//         }

//         System.out.println("Sum of all odd values: " + sumOfOdds);
//     }
// }











 
// Q11. Write a Java program that reads an integer between 1 and 12 and print the month
// of the year in English.
// Test Data :
// Input a number between 1 to 12 to get the month name: 8
// Expected Output:
// August



// import java.util.Scanner;

// class assigmentjava1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Input the first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Input the second number: ");
//         int num2 = sc.nextInt();

        
//         if (num1 % num2 == 0 || num2 % num1 == 0) {
//             System.out.println("One number is a multiple of the other.");
//         } else {
//             System.out.println("The numbers are not multiples of each other.");
//         }
//     }
// }









 
// Q12. Write a Java program that reads two integers and checks whether they are
// multiplied or not.
// Test Data :
// Input the first number: 5
// Input the second number: 15
// Expected Output:



// import java.util.Scanner;

// class assigmentjava1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Input a number between 1 to 12 to get the month name: ");
//         int monthNumber = sc.nextInt();

//         switch (monthNumber) {
//             case 1:
//                 System.out.println("January");
//                 break;
//             case 2:
//                 System.out.println("February");
//                 break;
//             case 3:
//                 System.out.println("March");
//                 break;
//             case 4:
//                 System.out.println("April");
//                 break;
//             case 5:
//                 System.out.println("May");
//                 break;
//             case 6:
//                 System.out.println("June");
//                 break;
//             case 7:
//                 System.out.println("July");
//                 break;
//             case 8:
//                 System.out.println("August");
//                 break;
//             case 9:
//                 System.out.println("September");
//                 break;
//             case 10:
//                 System.out.println("October");
//                 break;
//             case 11:
//                 System.out.println("November");
//                 break;
//             case 12:
//                 System.out.println("December");
//                 break;
//             default:
//                 System.out.println("Invalid input! Please enter a number between 1 and 12.");
//         }
//     }
// }





 
// Q13. Write a java program that read 5 numbers and counts the number of positive
// numbers and negative numbers. Test Data :
// Input the first number: 5
// Input the second number: -4
// Input the third number: 10
// Input the fourth number: 15
// Input the fifth number: -1
// Expected Output:
// Number of positive numbers: 3
// Number of negative numbers: 2



//  import java.util.Scanner;

//  class assigmentjava1 {
//      public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);

// int positiveCount = 0;
// int negativeCount = 0;


// for (int i = 1; i <= 5; i++) {
//     System.out.print("Input number " + i + ": ");
//     int num = sc.nextInt();

//     if (num > 0) {
//         positiveCount++;
//     } else if (num < 0) {
//         negativeCount++;
//     }
// }


// System.out.println("Number of positive numbers: " + positiveCount);
// System.out.println("Number of negative numbers: " + negativeCount);

//      } }







 
// Q14. Write a java program that read 5 numbers and counts the number of positive
// numbers and print the average of all positive values.
// Test Data :
// Input the first number: 5
// Input the second number: 8
// Input the third number: 10
// Input the fourth number: -5
// Input the fifth number: 25
// Expected Output:
// Number of positive numbers: 4
// Average value of the said positive numbers: 12.00



// import java.util.Scanner;

// class assigmentjava1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int positiveCount = 0;
//         int positiveSum = 0;

        
//         for (int i = 1; i <= 5; i++) {
//             System.out.print("Input number " + i + ": ");
//             int num = sc.nextInt();

//             if (num > 0) {
//                 positiveCount++;
//                 positiveSum += num;
//             }
//         }

       
//         System.out.println("Number of positive numbers: " + positiveCount);

       
//         if (positiveCount > 0) {
//             double average = (double) positiveSum / positiveCount;
//             System.out.printf("Average value of the said positive numbers: %.2f\n", average);
//         } else {
//             System.out.println("No positive numbers entered.");
//         }
//     }
// }






 
// Q15. 15. Write a java program that read 5 numbers and sum of all odd values
// between them.
// Test Data :
// Input the first number: 5
// Input the second number: 7
// Input the third number: 9
// Input the fourth number: 10
// Input the fifth number: 13
// Expected Output:
// Sum of all odd values: 34



// import java.util.Scanner;

// class assigmentjava1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sumOfOdds = 0;

       
//         for (int i = 1; i <= 5; i++) {
//             System.out.print("Input number " + i + ": ");
//             int num = sc.nextInt();
//             if (num % 2 != 0) {
//                 sumOfOdds += num;
//             }
//         }

       
//         System.out.println("Sum of all odd values: " + sumOfOdds);
//     }
// }






 
// Q16.Write a java program that
// converts Centigrade to Fahrenheit.



// import java.util.Scanner;

// class assigmentjava1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Input temperature in Centigrade: ");
//         double celsius = sc.nextDouble();

       
//         double fahrenheit = (celsius * 9 / 5) + 32;

       
//         System.out.printf("%.2f°C is %.2f°F%n", celsius, fahrenheit);
//     }
// }





 
// Q17.Write a java program to integral quotient and remainder of a division

// Input numerator : 2500
// Input denominator : 235
// quotient = 10, remainder = 150



// import java.util.Scanner;

// class assigmentjava1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Input numerator : ");
//         int numerator = sc.nextInt();

//         System.out.print("Input denominator : ");
//         int denominator = sc.nextInt();

        
//         int quotient = numerator / denominator;
//         int remainder = numerator % denominator;

//         System.out.println("quotient = " + quotient + ", remainder = " + remainder);
//     }
// }



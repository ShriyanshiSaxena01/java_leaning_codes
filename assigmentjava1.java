
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

//class assigmentjava1 {

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

//         // Input seconds
//         System.out.print("Input seconds: ");
//         int totalSeconds = sc.nextInt();

//         // Conversion
//         int hours = totalSeconds / 3600;
//         int remainingSeconds = totalSeconds % 3600;
//         int minutes = remainingSeconds / 60;
//         int seconds = remainingSeconds % 60;

//         // Output
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

//         // Conversion
//         int years = totalDays / 365;  //69
//         int remainingDays = totalDays % 365;  

//         int months = remainingDays / 30;
//         int days = remainingDays % 30;

//         // Output
//         System.out.println(years + " Year(s)");
//         System.out.println(months + " Month(s)");
//         System.out.println(days + " Day(s)");
//     }
// }

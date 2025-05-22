package java;
// /     **********************   while loop    ************************************


// / import java.util.Scanner;
// class loops {
    
// public static void main(String[] args) {
    

//     Scanner input = new Scanner(System.in);

//     System.out.println("enter any number");
     
//     int x=input.nextInt();
   

//     while(x<=5)
//     {
//         System.out.println(x);
//         x++;
//     }

// }


// }




// import java.util.Scanner;
// class loops {
    
// public static void main(String[] args) {
    

//     Scanner input = new Scanner(System.in);

//     System.out.println("enter any number");
     
//     int x=input.nextInt();
   

//     while(x>=1)
//     {
//         System.out.println(x);
//         x--;
//     }

// }


// }




// import java.util.Scanner;
// class loops {
    
// public static void main(String[] args) {
    
//     int x=10;
   

//     while(x<=20)
//     {
//         if(x%2==0)
//         {
//             System.out.println(x);
//         }
//         x++;
//     }

// }


// }





// import java.util.Scanner;
// class loops {
    
//     public static void main(String[] args) {
//         int x = 10;

//         while (x <= 20) {
//             System.out.println(x);
//             x += 2; // directly jump to next even number
//         }
//     }


// }









// import java.util.Scanner;
// class loops {
    
// public static void main(String[] args) {
    
//     int x=50;
   

//     while(x<=100)
//     {
//         if(x%5==0)
//         {
//             System.out.println(x);
//         }
//         x++;
//     }

// }


// }








// import java.util.Scanner;
// class loops {
    
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter any number:");
//         int x = input.nextInt();

//         int i = 1;

//         while (i <= 10) {
//             System.out.println(x + " x " + i + " = " + (x * i));
//             i++;
//         }
//     }

// }






// import java.util.Scanner;
// class loops {
    
// public static void main(String[] args) {
    
//     int x=10;
   

//     while(x<=60)
//     {
//         if(x%5==0 && x%3==0)
//         {
//             System.out.println(x);
//         }
//         x++;
//     }

// }


// }











// **********************************      do while loop   ****************************************


 



// import java.util.Scanner;
// class loops {
    
// public static void main(String[] args) {
    
//     int x=5;
   
//     do
//     {
        
//             System.out.println(x);
//             x--;
        
//     }
    
//     while(x>=1);
   
    

// }


// }













 



// import java.util.Scanner;
// class loops {
    
// public static void main(String[] args) {
    
//     int x=11;
   
//     do
//     {
        
//             System.out.println(x);
//             x += 2;
        
//     }
    
//     while(x<=19);
   
    

// }


// }






// import java.util.Scanner;
// class loops {
    
// public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);

        
//         System.out.print("Input a number: ");
//         int number = sc.nextInt();
//         int remainder;
//         int sum=0
//         ;

//    while (number!=0) {
    
//     remainder=number%10;
//     sum=sum+remainder;
//     number=number/10;    

//    }
//    System.out.println("sum of all digits"+sum);

// }


// }




// import java.util.Scanner;
// class loops {
    
// public static void main(String[] args) {
    
//             Scanner sc = new Scanner(System.in);

        
//         System.out.print("Input a number: ");
//         int number = sc.nextInt();
//         int remainder;
//         int sum=0
//         ;

//    while (number!=0) {
    
//     remainder=number%10;
    
//     number=number/10;  
//     if (remainder%2==0)  {
//         sum=sum+remainder;
        
//     }
    
//    }
//    System.out.println("sum of even digits : "+sum);

// }
// }





// import java.util.Scanner;

// class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Input a number: ");
//         int number = sc.nextInt();

//         int position = 0;
//         int sum = 0;

//         while (number != 0) {
//             int digit = number % 10;

//             if (position % 2 == 1) { 
//                 sum += digit;
//             }

//             number = number / 10;
//             position++;
//         }

//         System.out.println("Sum of alternate digits (from 2nd last): " + sum);
//     }
// }






// ==========================loop pattern========================


// *****
// *****
// *****
// *****
// *****

// class loop {  

//     public static void main(String[] args) {  
//         for(int i = 1; i <= 5; i++) {  
//             for(int j=1; j<=5;j++)
//             {
//                 System.err.print("* ");           

//             }  
//             System.err.println("1");       
//         }
//     }
// }


// *****
// *   *
// *   *
// *   *
// *****



// class loop {  

//     public static void main(String[] args) {  
//         int i , c;
//         for(i = 1; i <= 5; i++) { 
            
//             for(c=5; c>i;c--)
//             {
               
//                 System.err.print(" "); 
               
//             }
          
//             for(c=1;c<=i;c++){
//                 System.err.print("*"); 
                
//             }  
//             for(c=1;c<=i;c++){
//                 System.err.print("*"); 
//             } 
//             System.err.println(""); 
            
                
//         }
//     }
// }




// ===================  jumping   ======================

// brake
// continu
// system.exit(0)
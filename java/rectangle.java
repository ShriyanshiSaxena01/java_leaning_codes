import java.util.Scanner;

public class  rectangle

{
    

   int l, b;

// member ddata

   void getdata()
   {
    
       Scanner sk= new Scanner(System.in);

       System.out.println("enter length");

       l=sk.nextInt();

        System.out.println("enter birth");

       b=sk.nextInt();

   }
       void showdata()
       {

        System.out.println("length :"+ l);
          System.out.println("width :"+ b);

       }

       void getarea()
       {
 
           System.out.println("area :"+ (l*b));

       }

       void getpera()
       {

         System.out.println("parameter :"+ 2*(l+b));


       }



       public static void main(String[] args) {
        
        rectangle r=new  rectangle ();

r.getdata();
r.showdata();
r.getarea();
r.getpera();



       }



   }




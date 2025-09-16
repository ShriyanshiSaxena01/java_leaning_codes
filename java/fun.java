// import java.util.Scanner;

// class fun{

// // taking something returning nothing

// // primt sum of two nmber


// public void add(float a , float b){  //formal argu

//     System.out.println("addition :" + (a+b));


// }


// public static void main(String[] args) {
//     fun obj= new fun();

//     Scanner sk=new Scanner(System.in);
//     System.out.println("enter any number 1 : ");
//     float n1 = sk.nextFloat();
//     System.out.println("enter any number 2 : ");
//     float n2 = sk.nextFloat();
 
//     obj.add(n1,n2);//actual arg
//     obj.add(2.5f,3.5f);

// }



// }















import java.util.Scanner;

class fun{

// taking something returning nothing

// primt sum of two nmber


public int add(){  //formal argu
    float a,b,c;
    Scanner sk=new Scanner(System.in);
    System.out.println("enter any number 1 : ");
    a = sk.nextFloat();
    System.out.println("enter any number 2 : ");
    b = sk.nextFloat();
 c=a+b;
 return (int)c;  // explicit type casting changing float to int

}


public static void main(String[] args) {
    fun obj =  new fun();
   System.out.println("addition : "+ obj.add() );

}



}
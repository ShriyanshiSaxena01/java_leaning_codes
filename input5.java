import java.util.Scanner;
public class input5 {
 
    
    public static void main(String[] args) {
        

        Scanner ma = new Scanner(System.in);
        System.out.println("enter  number marks");


        float mark1 = ma.nextFloat();
        float mark2 = ma.nextFloat();
        float mark3 = ma.nextFloat();
        float mark4 = ma.nextFloat();
        float mark5 = ma.nextFloat();

        float total = (mark1 +mark2 +mark3 +mark4 +mark5);
        float pre= (total*100)/500;

        System.out.println(pre);

    }


}




// In Java, to take input from the keyboard, we commonly use the Scanner class from the java.util package. Here's a simple guide on how to use it, along with commonly used input methods like nextInt(), nextLine(), etc.

// ✅ 1. Import the Scanner Class
// java
// Copy code
// import java.util.Scanner;
// ✅ 2. Create Scanner Object
// java
// Copy code
// Scanner sc = new Scanner(System.in);
// ✅ 3. Common Input Methods in Scanner
// Method	Data Type	Description	Example
// nextInt()	int	Reads an integer	int num = sc.nextInt();
// nextFloat()	float	Reads a float	float f = sc.nextFloat();
// nextDouble()	double	Reads a double	double d = sc.nextDouble();
// next()	String	Reads a single word (until space)	String s = sc.next();
// nextLine()	String	Reads a whole line (until Enter)	String line = sc.nextLine();
// nextBoolean()	boolean	Reads a boolean (true or false)	boolean b = sc.nextBoolean();
// nextLong()	long	Reads a long integer	long l = sc.nextLong();
// nextShort()	short	Reads a short integer	short s = sc.nextShort();

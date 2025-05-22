package java;
import java.util.Scanner;

public class oi {
   public static void main(String[] args) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter age and name:");

      // Read the integer input
      int var2 = var1.nextInt();
      var1.nextLine(); // Consume the leftover newline

      // Read the string input
      String var3 = var1.nextLine();

      // Display the output
      System.out.println("The value is " + var2 + " " + var3);

      // Close the scanner
      var1.close();
   }
}

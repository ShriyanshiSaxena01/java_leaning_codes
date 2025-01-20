import java.util.Scanner;

public class oi { // Ensure the class name matches the file name

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age;
        String name;

        System.out.println("Enter age and name:");

        age = obj.nextInt(); // Reads integer
        obj.nextLine(); // Consumes the leftover newline character
        name = obj.nextLine(); // Reads the full line for the name

        System.out.println("The value is " + age + " " + name);
        obj.close(); // Close the scanner to avoid resource leaks
    }
}

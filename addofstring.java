import java.util.Scanner;
public class addofstring {
    public static void main (String[] args)
    {
        Scanner obj= new Scanner(System.in);
        String color1="red";
        String color2="black";
        String color=color1+color2;

        if(color.equals("redblack"))
        {
            System.out.println(color);
        }
        else
        {
            System.out.println("wriong");
        }
    }
}

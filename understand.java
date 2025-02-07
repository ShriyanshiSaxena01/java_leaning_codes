import java.util.Scanner;
public class understand {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int r;
        double pie,c;
        System.out.println("enter radious of circle");
        r=obj.nextInt();
        pie=3.14159;
        c=pie*r*r;
        System.out.println(c);
    }

}

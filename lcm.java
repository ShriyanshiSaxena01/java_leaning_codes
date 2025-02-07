import java.util.Scanner;
public class lcm {
    
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int num1=6;
        int num2=7;
        
        int lcm;

        for(int i=num2; ;i=i+num2)
        {
            if(i%num1==0 && i%num2==0)
            {
                lcm=i;
                break;
            
            }
        };
       System.out.println(lcm);




    }

}

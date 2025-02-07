import java.util.Scanner;
public class PRIMENO {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int num1;
        int count=0;
        System.out.println("enter number to check prime or not : ");
        num1=inp.nextInt();
        

        for (int i=1; i<=num1; i++){

            if(num1%i==0)
            {
                count++;
                
            
            }
            
        }
        if(count==2)
                {
                    System.out.println("prime");
                }
                else{
                    System.out.println("not prime");
                }
        


    }
    
}

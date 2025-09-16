public class Recursion {

    // public static void printnum(int n) { // now it's static
    //     if (n == 0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printnum(n - 1); // recursive call
    // }

    // public static void main(String[] args) {
    //     int n = 5;
    //     printnum(n); // no object needed
    // }




    // public static void printsum(int n, int i, int sum) { // now it's static
    // if(i==n){
    //     sum= sum+i;
    //     System.out.println(sum);
    //     return;
    // }    
    // sum= sum+i;
    //    printsum(n, i + 1, sum);

    // }

    // public static void main(String[] args) {
    //    printsum(5, 1, 0);
    // }




    


    // public static int calfac(int n) { // now it's static
    // if(n==1||n==0){
        
    //     return 1;
    // }  
    // int facn= calfac(n-1);
    // int fast = n*facn;
    // return fast;
    // }

    // public static void main(String[] args) {
    //     int n= 5;
    //     int ans =calfac(n);
    //    System.out.println(ans);
    // }








 
    // public static void calfac(int a ,int b ,int n) { // now it's static
    //    if(n==0)
    //    {
    //     return;
    //    }
    //    int c = a+b;
    //    System.out.println(c);
    //    calfac(b,c,n-1);//decrease n each call
    // }

    // public static void main(String[] args) {

    //     int a=0;
    //     int b=1;
    //     int n= 7;
    //     System.out.println(a);
    //     System.out.println(b);
    //     calfac(a,b,n-2); // after two number
        






    // hanoi

// public static void tower(int n, String s, String h, String d) {
//     if (n == 1) {
//         System.out.println("transfer " + n + " from " + s + " to " + d);
//         return;
//     }
//     tower(n - 1, s, d, h); // move n-1 disks from source to helper
//     System.out.println("transfer " + n + " from " + s + " to " + d); // move largest
//     tower(n - 1, h, s, d); // move n-1 disks from helper to destination
// }

// public static void main(String[] args) {
//     int n = 2;
//     tower(n, "S", "H", "D");
// }







public static void tower(int n, String s, String h, String d) {
    if (n == 1) {
        System.out.println("transfer " + n + " from " + s + " to " + d);
        return;
    }
    tower(n - 1, s, d, h); // move n-1 disks from source to helper
    System.out.println("transfer " + n + " from " + s + " to " + d); // move largest
    tower(n - 1, h, s, d); // move n-1 disks from helper to destination
}

public static void main(String[] args) {
    int n = 2;
    tower(n, "S", "H", "D");
}






}
 
public class Main {
    static int fib(int n) {
        if (n == 0)
            return 0;       // base case
        else if (n == 1)
            return 1;       // base case
        else
            return fib(n - 1) + fib(n - 2); // recursive call
    }

    public static void main(String[] args) {
        int n = 7; // Print Fibonacci series up to 7 terms
        System.out.print("Fibonacci series up to " + n + " terms: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}

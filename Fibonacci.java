public class Fibonacci {
    static int a = 0, b = 1, c;

    public static void main(String[] args) {

        // int n = 6;
        // for (int i = 0; i <= n; i++) {
        // System.out.print(a);
        // c = b + a;
        // a = b;
        // b = c;

        // }

        System.out.print(a + "" + b);

        Fibonacci obj = new Fibonacci();

        obj.fib(10);
    }

    void fib(int n) {
        if (n >= 1) {
            c = a + b;
            System.out.print(" " + c);
             a = b;
            b = c;
            fib(n - 1);
        }
    }
}
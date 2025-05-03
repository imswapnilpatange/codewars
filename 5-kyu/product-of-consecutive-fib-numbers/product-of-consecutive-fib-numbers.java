public class ProdFib {
  
  public static long[] productFib(long prod) {
    long fib1 = 0;
    long fib2 = 1;
​
    while (true) {
        long product = fib1 * fib2;
​
        if (product == prod) {
            return new long[]{fib1, fib2, 1};
        } else if (product > prod) {
            return new long[]{fib1, fib2, 0};
        }
​
        // Generate the next Fibonacci number
        long nextFib = fib1 + fib2;
        fib1 = fib2; // Shift the sequence
        fib2 = nextFib; // Shift the sequence
    }
   }
}
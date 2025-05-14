import java.util.stream.IntStream;
​
public class Primes {
  public static IntStream stream() {
    // Start from 2, the first prime number
        return IntStream.iterate(2, n -> n + 1)
                .filter(Primes::isPrime);
  }
  
  private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        // Check divisibility up to sqrt(n)
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
​
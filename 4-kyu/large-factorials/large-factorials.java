import java.math.BigInteger;
​
public class Kata{
​
  public static String Factorial(int n) {
    BigInteger result = BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
        result = result.multiply(BigInteger.valueOf(i));
    }
    return result.toString();
  }
}
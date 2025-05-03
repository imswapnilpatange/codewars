import java.util.function.IntPredicate;
​
public class BitCounting {
​
  private static final IntPredicate isOne = ch -> ch == '1';
​
  public static int countBits(int n){
    String binaryString = Integer.toBinaryString(n);
    long bits = binaryString.chars()
                            .filter(isOne)
                            .count();
    
    return (int) bits;
  }
  
}
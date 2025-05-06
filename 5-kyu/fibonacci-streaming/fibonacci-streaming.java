import java.util.stream.IntStream;
import java.util.concurrent.atomic.AtomicInteger;
​
public class Utility {
​
    public static IntStream generateFibonacciSequence() {
       AtomicInteger fibonacci = new AtomicInteger(1);
        return IntStream.iterate(1, x -> fibonacci.getAndAdd(x));
    }
​
}
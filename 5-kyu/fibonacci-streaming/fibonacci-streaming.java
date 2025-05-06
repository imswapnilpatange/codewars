import java.util.function.UnaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;
​
public class Utility {
  
    /**
     * Defines the logic to generate the next Fibonacci pair from the current pair.
     * Takes an array representing the current and next Fibonacci numbers [current, next]
     * and returns an array representing the next pair [next, current + next].
     */
    private static final UnaryOperator<int[]> NEXT_FIBONACCI_PAIR =
            fib -> new int[]{fib[1], fib[0] + fib[1]};
​
    /**
     * Defines the logic to extract the current Fibonacci number from a pair.
     * Takes an array representing a Fibonacci pair [current, next]
     * and returns the current Fibonacci number (the first element).
     */
    private static final ToIntFunction<int[]> EXTRACT_CURRENT_FIBONACCI =
            fib -> fib[0];
​
    public static IntStream generateFibonacciSequence() {
        return Stream.iterate(
                // Initial state: an array holding the current and next Fibonacci numbers (starting with 1 and 1).
                new int[]{1, 1}, // Changed initial state
                NEXT_FIBONACCI_PAIR
        )
        .mapToInt(EXTRACT_CURRENT_FIBONACCI);
    }
​
}
import java.util.HashMap;
import java.util.Map;
​
public class ScreenLock {
​
    // Map point labels to their grid positions
    private static final Map<Character, int[]> points = new HashMap<>();
​
    // Skip matrix: skip[i][j] gives the point that must be visited to move directly from point i to j
    // or 0 if no intermediate point is needed.
    private static final int[][] skip = new int[10][10];
​
    // Static block to initialize static variables
    static {
        // Initialize points mapping
        points.put('A', new int[]{0, 0});
        points.put('B', new int[]{0, 1});
        points.put('C', new int[]{0, 2});
        points.put('D', new int[]{1, 0});
        points.put('E', new int[]{1, 1});
        points.put('F', new int[]{1, 2});
        points.put('G', new int[]{2, 0});
        points.put('H', new int[]{2, 1});
        points.put('I', new int[]{2, 2});
​
        // Initialize skip matrix with 0 (no skip needed)
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                skip[i][j] = 0;
            }
        }
​
        // Set intermediate points for moves that require passing through another point
        // For example, A(1) to C(3) passes through B(2)
        skip[1][3] = 2; skip[3][1] = 2;
        skip[1][7] = 4; skip[7][1] = 4;
        skip[3][9] = 6; skip[9][3] = 6;
        skip[7][9] = 8; skip[9][7] = 8;
        skip[1][9] = 5; skip[9][1] = 5;
        skip[3][7] = 5; skip[7][3] = 5;
        skip[2][8] = 5; skip[8][2] = 5;
        skip[4][6] = 5; skip[6][4] = 5;
    }
​
    // Instance method to calculate number of patterns from a start point with specified pattern length
    public int calculateCombinations(char startPosition, int patternLength) {
        // Validate input
        startPosition = Character.toUpperCase(startPosition);
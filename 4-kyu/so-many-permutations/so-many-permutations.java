import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
​
class Permutations {
    
    public static List<String> singlePermutations(String s) {
       List<String> permutations = new ArrayList<>();
        if (s == null || s.length() == 0) {
            permutations.add(""); // Return an empty string for an empty input
            return permutations;
        }
​
        // Start the recursive helper function
        generatePermutations(s.toCharArray(), 0, permutations);
      
        permutations = permutations.stream()
                .distinct() // This intermediate operation keeps only unique elements
                .collect(Collectors.toList());
      
        return permutations;
    }
  
    private static void generatePermutations(char[] chars, int index, List<String> permutations) {
        // Base case: If we have processed all characters, add the current permutation
        if (index == chars.length - 1) {
            permutations.add(String.valueOf(chars));
            return;
        }
​
        // Recursive step: Iterate through the remaining characters
        for (int i = index; i < chars.length; i++) {
            // Swap the current character with the character at 'index'
            swap(chars, index, i);
​
            // Recursively generate permutations for the rest of the string
            generatePermutations(chars, index + 1, permutations);
​
            // Backtrack: Swap back to restore the original order for the next iteration
            swap(chars, index, i);
        }
      }
​
      private static void swap(char[] chars, int i, int j) {
          char temp = chars[i];
          chars[i] = chars[j];
          chars[j] = temp;
      }
}
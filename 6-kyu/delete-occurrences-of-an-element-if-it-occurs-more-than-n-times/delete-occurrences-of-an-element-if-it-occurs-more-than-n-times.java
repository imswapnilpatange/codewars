import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
​
public class EnoughIsEnough {
​
  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    if (elements == null || elements.length == 0) {
            return new int[0]; // Return an empty array for null or empty input
        }
​
        // Use a HashMap to track the count of each element encountered so far
        Map<Integer, Integer> elementCounts = new HashMap<>();
​
        // Use a List to build the new array, as we don't know the final size
        List<Integer> filteredList = new ArrayList<>();
​
        for (int element : elements) {
            // Get the current count of the element, defaulting to 0 if not present
            int currentCount = elementCounts.getOrDefault(element, 0);
​
            // If the current count is less than the maximum allowed occurrences,
            // add the element to the filtered list and increment its count.
            if (currentCount < maxOccurrences) {
                filteredList.add(element);
                elementCounts.put(element, currentCount + 1);
            }
            // If the current count is already equal to or greater than maxOccurrences,
            // we simply skip this element.
        }
​
        // Convert the List back to an int array
        int[] filteredArray = filteredList.stream()
                                    .mapToInt(Integer::intValue)
                                    .toArray();
    
    return filteredArray;
  }
​
}
import java.util.ArrayList;
import java.util.List;
public class Kata{
  public static int[] capitals(String s){
    List<Integer> indices = new ArrayList<>();
​
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                indices.add(i);
            }
        }
​
        // Convert List<Integer> to int[]
        return indices.stream().mapToInt(Integer::intValue).toArray();
  }
}
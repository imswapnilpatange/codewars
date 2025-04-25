import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
​
public class WhichAreIn { 
  
  public static String[] inArray(String[] array1, String[] array2) {
    
    List<String> resultList = new ArrayList<>();
    
    //convert array to list
    List<String> array2List = Arrays.asList(array2);
      
    for(String array1Element: array1){      
      if(array2List.stream().anyMatch(array2Element -> array2Element.contains(array1Element)))
        resultList.add(array1Element);
     }
​
    //convert list to array
    String[] result = resultList.stream().toArray(String[]::new);
    
    //Sort the result array in lexicographical order
    Arrays.sort(result);
    
    return result;
  }
}
​
public class Max {
  public static int sequence(int[] arr) {
    if(arr.length == 0)
      return 0;
    
    int max = 0;
    int currentMax = 0;
    for(int i = 0; i < arr.length; i++){
      // Update currentMax to be either the current element or current element + previous max
      currentMax = Math.max(arr[i], currentMax + arr[i]);
      // Update max if currentMax is greater
      max = Math.max(max, currentMax);
    }
    
    return max;
  }
}
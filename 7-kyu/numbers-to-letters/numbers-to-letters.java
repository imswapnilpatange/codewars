public class Kata{
  public static String switcher(String[] arr){
    
    StringBuilder result = new StringBuilder();
​
        for (String numStr : arr) {
            int num = Integer.parseInt(numStr);
​
            if (num >= 1 && num <= 26) {
                result.append((char)(123 - num));
            } else if (num == 27) {
                result.append('!');
            } else if (num == 28) {
                result.append('?');
            } else if (num == 29) {
                result.append(' ');
            }
        }
​
        return result.toString();
  }
}
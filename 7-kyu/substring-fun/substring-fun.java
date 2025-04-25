public class SubstringFun {
  public static String nthChar(String[] words) {
​
    StringBuffer result = new StringBuffer();
    for(int i = 0; i < words.length; i++){
      String s = words[i];
      result.append(s.charAt(i));
    }
    return result.toString();
  }
}
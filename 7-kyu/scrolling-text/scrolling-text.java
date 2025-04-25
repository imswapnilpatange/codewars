public class Kata {
    public static String[] scrollingText(String text) {
        
      if (text == null || text.isEmpty()) {
            return new String[0];
      }
        
      int len = text.length();
      String[] rotations = new String[len];
​
      for (int i = 0; i < len; i++) {
          String rotation = text.substring(i) + text.substring(0, i);
          rotations[i] = rotation.toUpperCase();
      }
​
        return rotations;
    }
}
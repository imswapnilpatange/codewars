import org.apache.commons.lang3.StringUtils;
​
public class Kata {
​
  public static String add(String a, String b) {
​
    // Handle null or empty input strings
    if (StringUtils.isBlank(a))
        return b;
​
    if (StringUtils.isBlank(b))
        return a;
​
        // Convert strings to character arrays for easier access to digits
        char[] digits1 = a.toCharArray();
        char[] digits2 = b.toCharArray();
​
        int i = digits1.length - 1; // Pointer for num1
        int j = digits2.length - 1; // Pointer for num2
        int carry = 0;
        StringBuilder result = new StringBuilder();
​
        // Perform addition from right to left (least significant digit)
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? Character.getNumericValue(digits1[i]) : 0;
            int digit2 = (j >= 0) ? Character.getNumericValue(digits2[j]) : 0;
​
            int sum = digit1 + digit2 + carry;
            result.append(sum % 10); // Append the current digit to the result
            carry = sum / 10;          // Calculate the carry for the next position
​
            i--; // Move to the next digit in num1
            j--; // Move to the next digit in num2
        }
​
        // The result is built in reverse order (least significant digit first)
        // Reverse the StringBuilder to get the correct order
        result.reverse();
​
        // Handle leading zeros in the result (except for the number 0 itself)
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
​
        return result.toString();
  }
}
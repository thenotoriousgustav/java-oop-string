package ValueOf;

import java.util.Arrays;

public class ValueOfChar {
    public static void main(String[] arg) {

    char[] data = { 'H', 'E', 'L', 'L', 'O', 'W', 'O', 'R', 'L', 'D'};
    String result;

    System.out.println(Arrays.toString(data));

    // Return all the string of charArray
    result = String.valueOf(data);
    System.out.println(result);

    // Returns the string of charArray 0 to 5
    result = String.valueOf(data, 0, 5);
    System.out.println(result);

    /* Returns the string of charArray starting from
       index 5 and total count from 5 is 5 */
    result = String.valueOf(data, 5 , 5);
    System.out.println(result);
    }
}

package ValueOf;

public class ValueOfNumber {
    public static void main(String[] args) {

        //declare variable
        int valueInt = 10;
        double valueDouble = 3.14;

        String strInt = String.valueOf(valueInt);
        String strDouble = String.valueOf(valueDouble);

        String result = strInt.concat(strDouble);

        // return output
        System.out.println("Value strInt = " + strInt);
        System.out.println("Value strDouble = " + strDouble);
        System.out.println("result of strInt + strDouble  = " + result);

    }
}

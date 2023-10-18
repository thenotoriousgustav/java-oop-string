package ValueOf;

public class ValueOfBoolean {
    public static void main(String[] args) {
        // declare a String
        String result;
        String data = "Hello World";

        // check if String value contains a specific string
        boolean bool = data.contains("Hello");

        // print the string equivalent of our boolean check
        result   = String.valueOf(bool);
        System.out.println(result);

        // checking what type of variable
        Object obj = result;
        Class cls = obj.getClass();
        System.out.println("result is an instance of " + cls.getSimpleName());

    }
}

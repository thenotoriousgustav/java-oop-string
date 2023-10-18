package Quiz;

import java.util.Scanner;

public class ValueOfQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input int number: ");
        int numberOne = scanner.nextInt();

        System.out.print("input double number: ");
        Double numberTwo = scanner.nextDouble();
        scanner.close();

        // convert primitive data type to string
        String strNumberOne = String.valueOf(numberOne);
        String strNumberTwo = String.valueOf(numberTwo);

        String result = strNumberOne + strNumberTwo;

        System.out.println("result: " + result);

        // checking what type of variable
        Object obj = result;
        Class cls = obj.getClass();
        System.out.println("result is an instance of " + cls.getName());
    }
}

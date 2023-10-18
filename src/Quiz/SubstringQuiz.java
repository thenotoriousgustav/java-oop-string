package Quiz;

public class SubstringQuiz {
    public static void main(String[] args) {
        String originalString = "Hari ini adalah hari yang cerah.";

        String substring1 = originalString.substring(5, 8);
        System.out.println("substring 1: " + substring1);

        String substring2 = originalString.substring(9);
        System.out.println("substring 2: " + substring2);
    }
}

public class Concat {
    public static void main(String[] args) {

        // Example One
        String firstName = "John ";
        String lastName = "Doe";

        System.out.println(firstName.concat(lastName));

        // Example Two
        String firstText = "Coding ";
        String secondText = "Bersama ";
        String thirdText = "Kelompok Tiga";
        String combinedText = firstText.concat(secondText).concat(thirdText);

        System.out.println(combinedText);

        // Example Three
        String text = "Hello ";
        text = text.concat("World!!!");

        System.out.println(text);

    }
}

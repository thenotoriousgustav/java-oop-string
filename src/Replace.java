public class Replace {
    public static void main(String[] args) {
        String text = "Hello World!!!";

        // replace a string text
        String replaceString = text.replace("World", "Gundar");

        // replace only one letter
        String replaceWord = text.replace("o", "os");

        System.out.println(replaceString);
        System.out.println(replaceWord);
    }
}

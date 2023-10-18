package Quiz;

public class ReplaceQuiz {
    public static void main(String[] args) {
        String originalString = "Ini adalah contoh penggunaan metode replace dalam Java.";
        char targetChar = 'a'; // Karakter yang akan diganti
        char replacementChar = 'X'; // Karakter pengganti

        // Mengganti semua kemunculan targetChar dengan replacementChar
        String modifiedString = replaceChar(originalString, targetChar, replacementChar);

        System.out.println("String asli: " + originalString);
        System.out.println("String setelah penggantian: " + modifiedString);
    }

    public static String replaceChar(String originalString, char targetChar, char replacementChar) {
        // Menggunakan metode replace() untuk mengganti semua kemunculan targetChar dengan replacementChar
        String modifiedString = originalString.replace(targetChar, replacementChar);
        return modifiedString;
    }

}

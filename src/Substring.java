public class Substring {
    public static void main(String[] args) {
        String text = "Belajar Java Bersama Kelompok Tiga";

        String str1 = text.substring(8);
        String str2 = text.substring(0, 12);

        // length of variable str
        System.out.println("The length of the string is: " + text.length());
        System.out.println(text + "\n");

        System.out.println("text.substring(8) = " +str1);
        System.out.println("text.substring(0, 12) = " +str2);
    }
}

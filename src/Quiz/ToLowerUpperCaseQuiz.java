package Quiz;

import java.util.Scanner;

public class ToLowerUpperCaseQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String inputText = scanner.nextLine();

        System.out.print("Pilih operasi (1 untuk UPPERCASE, 2 untuk lowercase): ");
        int choice = scanner.nextInt();

        String resultText = "";

        switch (choice) {
            case 1:
                resultText = inputText.toUpperCase();
                break;
            case 2:
                resultText = inputText.toLowerCase();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Hasil operasi: " + resultText);
    }
}

package Quiz;

import java.util.Scanner;

public class AppendStringgBufferQuiz {
    public static void main(String[] args){
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan beberapa kata
        System.out.print("Masukkan kata pertama: ");
        String inputKataSatu = scanner.nextLine();

        System.out.print("Masukkan kata kedua: ");
        String inputKataDua = scanner.next();

        // Membuat objek StringBuffer
        StringBuffer stringBuffer = new StringBuffer();

        // Menggabungkan input pengguna dengan metode append
        stringBuffer.append(inputKataSatu);
        stringBuffer.append(inputKataDua);

        // Menampilkan string yang telah digabung
        System.out.println("String awal: " + stringBuffer);

        // Memutar (reverse) string menggunakan metode reverse
        stringBuffer.reverse();

        // Menampilkan string yang telah di-reverse
        System.out.println("String yang di-reverse: " + stringBuffer);

        // Menutup objek Scanner
        scanner.close();
    }
}

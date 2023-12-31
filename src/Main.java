import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan beberapa kata
        System.out.print("Masukkan beberapa kata: ");
        String inputKata = scanner.nextLine();

        // Membuat objek StringBuffer
        StringBuffer stringBuffer = new StringBuffer();

        // Menggabungkan input pengguna dengan metode append
        stringBuffer.append(inputKata);

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
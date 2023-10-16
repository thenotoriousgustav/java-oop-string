package StringBuffer;

public class Append {
    public static void main(String[] args){
        // Mendefinisikan Objek Beserta Nilainya
        StringBuffer data = new StringBuffer("Belajar");

        // Menambahkan Beberapa Nilai/Karakter String
        data.append(" Java");
        data.append(" Bersama");
        data.append(" Kelompok Tiga");

        //Menampilkan Output
        System.out.println(data);
        System.out.println(data.length());
        System.out.println(data.capacity());

        int addressBuilder = System.identityHashCode(data);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }
}

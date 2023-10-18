package StringBuffer;

public class Append {
    public static void main(String[] args){

        // define string buffer
        StringBuffer data = new StringBuffer("Belajar");

//        // add/append a string
        data.append(" Java");
        data.append(" Bersama");
        data.append(" Kelompok Tiga");

        // return output
        System.out.println(data);
        System.out.println(data.length());
        System.out.println(data.capacity());

        // checking the memory address
        int addressBuilder = System.identityHashCode(data);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }
}

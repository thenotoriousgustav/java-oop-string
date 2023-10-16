package StringBuffer;

public class Insert {
    public static void main(String[] args){
        StringBuffer data = new StringBuffer("Kelompok Tiga");

        // insert a string
        data.insert(0, "Belajar Java ");
        data.insert(13, "Bersama ");

        // output return
        System.out.println("length of data : " + data.length());
        System.out.println(data);
    }
}

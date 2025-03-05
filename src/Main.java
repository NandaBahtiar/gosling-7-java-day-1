public class Main {
    public static void main(String[] args) {
        /**
         * ini adalah titik masuk untuk setiap aplikasi
         *  public = bisa di akses dari mana saja
         *  static = milik kelas main
         *  void = method tidak mengembalikan nilai apapun
         *  main = nama method
         *  string[] arg = akan menerima baris perintah
         * */
//        hellow world
        System.out.println("gosling class malang");

        /**
         * ada dua tipe data di java
         * 1. primitif      :int, float, double, short //yang berawalan huruf keceil
         * 2. non primitif  : intinya sebuah class di java (Integer, String)
         * */
        int number =2;

        Integer number2 = 10;

        number2.equals(number);
        System.out.println( number2.equals(number));
    }
}

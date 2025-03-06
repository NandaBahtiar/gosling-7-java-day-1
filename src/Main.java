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
         * 2. non primitif  : intinya sebuah class di java (Integer, String) //yang berawalan huruf besar
         * */
//        int number =2;
//
//        Integer number2 = 10;
//
//        number2.equals(number);
//        System.out.println( number2.equals(number));

        /**
         * 1. variabel      : sebuah wadah untuk menampung nilai
         * 2, data type
         * 3, operator
         * 4, condition
         * 5, looping
         * 6, array + loop
         * 7, input
         * 8, function
         * */

        /*variabel*/
//        explisit
        int number = 2;
        System.out.println(number);//2

//        re-assign
        number = 15;
        System.out.println(number);//15
//        implisit
        var number2 = 2;
        System.out.println(number2);

//        data type
        /**
         * numeric
         * 1, byte : 1 bit (-128 s/d 127)
         * 2, short: 2 bit (-32,767 s/d 32.767)
         * 3 int    :4 bit
         * 4, long  :8bit

         * floating number (decimal)
         * 1, float     :4 bit
         * 2, double    :8 bit
         * */

        byte intByte = 2;
        short intShort = 2;
        int intInt = 2;
        long longInt = 2222222L;

        float floatInt = 3.14f; //harus menggunakan f di belakang
        double doubleInt = 2.20001;
//duplikat ctrl+d
        System.out.println("byte: " + intByte);
        System.out.println("short: " + intShort);
        System.out.println("int: " + intInt);
        System.out.println("long: " + longInt);
        System.out.println("float: " + floatInt);

        //format
        /*
        * $s -> string
        * $d ->number
        * $f ->float*/
        System.out.println("++++++++++=++++++++");
        System.out.printf("int: %d", intInt);
        System.out.printf("\nint: %d", intInt);
        System.out.printf("\nbolean: %s", true);

        //perbedaan primitif dan non primitif
        //primitif tidak memiliki nilai default
        //non primitif memiliki nilai default dan bisa null
        int primitifInteger = 10;
        Integer noprimitifInteger = null;
        System.out.println("\n+++++++2+++=++++++++");

        //casting tipe data
        //1. cara otomatis  : mengubah dari tipedata kecil ke tipedata besar (byte -> int )
        //2. cara manual  : mengubah dari tipedata besar ke tipedata kecit (int -> short )
//cara 1
        byte inibyte = 127;
        short intint = inibyte;
        System.out.println(intint);
//cara 2
        int iniInt3 = 150;
        short iniShort3= (byte)  iniInt3;
        System.out.println(iniShort3); // -106 karena setelah 127 balik lagi ke -128

        System.out.println(" \n\n//characters");
        //characters
        //penulisan karakter menggunakan '', sedangkan String ""
        char char1 = 'A';
        char char2 = 'a';
        System.out.println(char1);


        //konversi char ke btye
        byte charByte = (byte) char1;
        byte charByte2 = (byte) char2;
        System.out.println("ASCII A"+ charByte);
        System.out.println("ASCII a"+ charByte2);



    }
}


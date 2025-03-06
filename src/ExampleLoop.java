import java.util.Scanner;

public class ExampleLoop {
    public static void main(String[] args) {
        /**
         * loop
         * 1 for
         * for inisialisasi; kondidi; increment/decrement
         * 2 while
         * while(condition){   }
         * 3 do-while
         * do{
         * statement} while(kondisi)
         * */

//        for (int i= 0; i < 10; i++) {
//            System.out.println("Hello World " + i);
//
//        }
//        int num = 4;
//        while(num < 10) {
//            System.out.println("Hello World " + num);
//            num++;
//        }
//
//        do {
//            System.out.println("Hello World " + num);
//            num++;
//        }while (num < 10);

        Scanner input = new Scanner(System.in);

        String nama ;
        // inputan 4 karakter
//        do {
//            System.out.print("Masukkan Nama:");
//            nama = input.nextLine();
//        }while (nama.length() < 4);
//        System.out.println(nama);


        // game tebak angka
        //program tenak angka 1 - 10
        String angka ;
        do {
            System.out.print("tebak angka:");
            angka = input.nextLine();
            if (angka.isEmpty()){
                System.out.println("pilihan kosong");
               break;
            }
        }while (Integer.parseInt(angka) != 7 );
        System.out.println(angka + " ye benar");
    }
}

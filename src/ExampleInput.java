import java.util.Scanner;

public class ExampleInput {
    public static void main(String[] args) {
//        // input di java
//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan nama : ");
//        String name = input.nextLine();
//        System.out.println(name);
//
//        //menghitung luas persegi
//        System.out.println("Input panjang: ");
//        int sisi = input.nextInt();
//        System.out.println(sisi);
//        //auto format ctrl +alt + l
//        int area = sisi * sisi;
//        System.out.println("luas persegi: "+area);

        //input biodata
        Scanner scanner = new Scanner(System.in);
        String nama ;
        int umur ;
        String alamat;
        String hobi;
        int tinggi;

        System.out.print("Masukkan nama : ");
        nama = scanner.nextLine();
        System.out.print("Masukkan umur : ");
        umur = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan hobi : ");
        hobi = scanner.nextLine();
        System.out.print("Masukkan tinggi : ");
        tinggi = Integer.parseInt(scanner.nextLine());// parsing data ke string
        System.out.print("Masukkan Kota : ");
        alamat = scanner.nextLine();


        System.out.println("nama    : "+nama);
        System.out.println("umur    : "+umur);
        System.out.println("hobi    : "+hobi);
        System.out.println("tinggi  : "+tinggi);
        System.out.println("alamat  : "+alamat);




    }
}

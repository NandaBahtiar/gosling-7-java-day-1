import java.util.Scanner;

public class ExampleCondition {
    public static void main(String[] args) {
        /**
         * ada 2 jenis condition
         * 1 if else statment
         * 2 switch case
         * */
        Scanner input = new Scanner(System.in);

        /*
        * if (condition ){ -> true / false
        * statement -> kode yang akan di jalankan
        * }
        * */

        if(true){
            System.out.println("hellow");
        }else{
            System.out.println("not hellow");
        }

//        //simulasi login
//        String username = "admin";
//        String password = "123";
//        Scanner input = new Scanner(System.in);
//        System.out.print("Username: ");
//        username = input.nextLine();
//        System.out.print("password: ");
//        password = input.nextLine();
//
//        boolean isAuth = false;
//        //terdapat kondisi jika password 123 dan username admin maka sama
//        isAuth = username.equals("admin") && password.equals("123");
//        if(isAuth){
//            System.out.println("login successful");
//        }else{
//            System.out.println("login failed");
//        }


        //check nilai
        /*
        * 1 nilai diatas 90 = A
        * 2 nilai diantara 80 - 90 = B
        * 3 nilai diantara 70- 80 = C
        * 4 nilai diantara 70- 60 = D
        * 5 nilai dibawah 60 = E
        * */
//        System.out.print("masukkan nilai:");
//        int grade = input.nextInt();
//
//        if (grade >= 90){
//            System.out.println("A");
//        } else if (grade >= 80) {
//            System.out.println("B");
//        } else if (grade >= 70) {
//            System.out.println("C");
//        } else if (grade >= 60) {
//            System.out.println("D");
//        }else{
//            System.out.println("E");
//        }


        //ternary
        //condition ? kalo bener : kalo salah
//        String name = "adib".equalsIgnoreCase("admb") ? "benar ": "salah";
//        System.out.println(name);

        // if bisa di buat secara nested ( if di dalam if )
//        System.out.print("masukkan Umur:");
//        int Umur = Integer.parseInt(input.nextLine());
//
//        if(Umur > 17 ){
//            System.out.print("punya ktp? (Y/N):");
//            String ktp = input.nextLine();
//            if (ktp.equalsIgnoreCase("y")){
//                System.out.print("boleh nonton bioskop");
//            }else if (ktp.equalsIgnoreCase("n")){
//                System. out.print("gak boleh nonton");
//            }else{
//                System.out.println("input tidak sesuai");
//            }
//        }else if(Umur > 13){
//            System.out.print("bersama orangtua ? (Y/N):");
//            String ket = input.nextLine();
//            if(ket.equalsIgnoreCase("y")){
//                System.out.print("boleh nonton bioskop");
//            }else if (ket.equalsIgnoreCase("n")){
//                System.out.print("gak boleh nonton");
//            }else {
//                System.out.println("input tidak sesuai");
//            }
//        }else{
//            System.out.print("gak boleh");
//        }


        /// switch case
//        switch (condition){
//        case 1 :
//        case 2 :
//        case 3 :
//        case 4 :
//        default :
//        }
        char grade =  'A';
        switch (grade){
            case 'A':
                //statement
                System.out.println("pintar");
                break;//menghentikan case jika kondisi terpenuhi
            case 'B':
                System.out.println("bagus");
                break;
            case 'C':
                System.out.println("Kureng");
                break;
            case 'D':
                System.out.println("jelek");
                break;
            case 'E':
                System.out.println("belajar lagi");
                break;
            default:
                System.out.println("invalid grade");
                break;
        }



    }

}

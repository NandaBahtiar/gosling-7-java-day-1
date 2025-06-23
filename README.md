# Java Fundamental Gosling 7

Proyek ini berisi contoh-contoh kode dasar Java yang mencakup berbagai konsep fundamental dalam pemrograman Java. Setiap file `.java` dalam direktori `src` mendemonstrasikan aspek tertentu dari bahasa Java.

## Isi Proyek

Berikut adalah daftar file Java yang ada dalam proyek ini beserta penjelasan singkatnya:

*   **`src/Main.java`**: Titik masuk utama aplikasi. Berisi contoh deklarasi variabel, tipe data primitif dan non-primitif, serta casting tipe data.
*   **`src/ExampleArray.java`**: Mendemonstrasikan cara membuat dan menginisialisasi array di Java.
*   **`src/ExampleCondition.java`**: Menunjukkan penggunaan struktur kondisional seperti `if-else` dan `switch-case`.
*   **`src/ExampleInput.java`**: Berisi contoh bagaimana cara mengambil input dari pengguna menggunakan kelas `Scanner`.
*   **`src/ExampleLoop.java`**: Mendemonstrasikan berbagai jenis loop seperti `for`, `while`, dan `do-while`.
*   **`src/ExampleOperator.java`**: Menjelaskan berbagai jenis operator di Java, termasuk aritmatika, logika, perbandingan, dan unary. Juga mencakup konversi tipe data (parsing).

## Cara Menjalankan Kode

Untuk menjalankan kode dalam proyek ini, Anda memerlukan Java Development Kit (JDK) yang terinstal di sistem Anda.

### Kompilasi

Buka terminal atau command prompt, navigasikan ke direktori `src` dari proyek ini, dan kompilasi file Java menggunakan perintah `javac`.

Misalnya, untuk mengkompilasi file `Main.java`:
```bash
javac Main.java
```
Anda mungkin perlu mengkompilasi file lain jika `Main.java` memiliki dependensi terhadapnya, atau Anda dapat mengkompilasi semua file sekaligus:
```bash
javac *.java
```

### Menjalankan

Setelah proses kompilasi berhasil dan menghasilkan file `.class`, Anda dapat menjalankan program menggunakan perintah `java` dari direktori `src`.

Misalnya, untuk menjalankan kelas `Main` (yang berisi metode `main`):
```bash
java Main
```

Untuk menjalankan kelas lain yang memiliki metode `main` (misalnya `ExampleLoop.java`):
```bash
java ExampleLoop
```

Pastikan Anda berada di direktori `src` saat menjalankan perintah `java` agar kelas-kelas dapat ditemukan dengan benar.

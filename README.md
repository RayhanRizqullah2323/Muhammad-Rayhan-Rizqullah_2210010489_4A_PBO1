# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengelolaan data layanan Rumah Sakit Pertamina menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menyediakan berbagai layanan rumah sakit seperti layanan rawat jalan, rawat inap, informasi dokter, informasi pasien, dan fasilitas publik. Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `RumahSakitPertamina` adalah contoh dari class.

    ```java
    public class RumahSakitPertamina {
        ...
    }
    ```

2. **Object** adalah instance dari class. Pada kode ini, `RumahSakitPertamina rsPertamina = new RumahSakitPertamina();` adalah contoh pembuatan object.

    ```java
    RumahSakitPertamina rsPertamina = new RumahSakitPertamina();
    ```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPasien`, `umurPasien`, dan `alamatPasien` adalah contoh atribut.

    ```java
    private String namaPasien;
    private int umurPasien;
    private String alamatPasien;
    ```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `RumahSakitPertamina`.

    ```java
    public RumahSakitPertamina() {
        // Inisialisasi atribut jika diperlukan
    }
    ```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setPasien` adalah contoh method mutator.

    ```java
    public void setPasien(String nama, int umur, String alamat) {
        this.namaPasien = nama;
        this.umurPasien = umur;
        this.alamatPasien = alamat;
    }
    ```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPasien`, `getUmurPasien`, dan `getAlamatPasien` adalah contoh method accessor.

    ```java
    public String getNamaPasien() {
        return namaPasien;
    }

    public int getUmurPasien() {
        return umurPasien;
    }

    public String getAlamatPasien() {
        return alamatPasien;
    }
    ```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaPasien`, `umurPasien`, dan `alamatPasien` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

    ```java
    private String namaPasien;
    private int umurPasien;
    private String alamatPasien;
    ```

8. **Inheritance** tidak diterapkan secara eksplisit dalam kode ini karena tidak ada subclass yang dibuat dari `RumahSakitPertamina`.

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Pada kode ini, method `tampilkanInformasiDokter` di-overload.

    ```java
    public void tampilkanInformasiDokter() {
        ...
    }

    public void tampilkanInformasiDokter(int pilihDr) {
        ...
    }
    ```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dan `while` dalam method `tampilkanInformasiDokter`.

    ```java
    if (pilihDr == 1) {
        namaDr = "Dr. Ryu Hasan";
        jasaDr = 150000;
    } else if (pilihDr == 2) {
        namaDr = "Dr. Budi Santoso";
        jasaDr = 120000;
    } else if (pilihDr == 3) {
        namaDr = "Dr. Maria";
        jasaDr = 200000;
    } else {
        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
    }
    ```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan layanan rawat jalan dan rawat inap.

    ```java
    for (String poliklinik : poliklinikRawatJalan) {
        System.out.println("- " + poliklinik);
    }
    ```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

    ```java
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan nama pasien:");
    namaPasien = input.next();
    ```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `poliklinikRawatJalan` dan `kamarRawatInap` adalah contoh penggunaan array.

    ```java
    private String[] poliklinikRawatJalan = {
        "Poliklinik Saraf", "Poliklinik Bedah Umum", "Poliklinik Bedah Mulut",
        ...
    };
    ```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

    ```java
    try {
        pilihDr = input.nextInt();
    } catch (Exception e) {
        System.out.println("Terjadi kesalahan input. Silakan coba lagi.");
        input.next(); // Membersihkan buffer
    }
    ```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat
Nama: Muhammad Rayhan Rizqullah
Npm: 2210010489

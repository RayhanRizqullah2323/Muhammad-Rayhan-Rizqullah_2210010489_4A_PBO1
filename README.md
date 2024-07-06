# Proyek Rumah Sakit Pertamina Tanjung

Proyek ini adalah sebuah aplikasi pengelolaan data layanan di Rumah Sakit Pertamina Tanjung yang mencakup berbagai layanan seperti rawat jalan, rawat inap, penunjang medis, fasilitas umum, medical check-up, dan promosi kesehatan.

## Deskripsi

Aplikasi ini dikembangkan untuk memenuhi kebutuhan pengelolaan data di Rumah Sakit Pertamina Tanjung dengan menggunakan konsep-konsep pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, Layanan, RawatJalan, RawatInap, PenunjangMedis, FasilitasUmum, MedicalCheckUp, dan PromosiKesehatan adalah contoh dari class.
    ```java
    public class Layanan {
        ...
    }

    public class RawatJalan extends Layanan {
        ...
    }

    public class RawatInap extends Layanan {
        ...
    }

    public class PenunjangMedis extends Layanan {
        ...
    }

    public class FasilitasUmum extends Layanan {
        ...
    }

    public class MedicalCheckUp extends Layanan {
        ...
    }

    public class PromosiKesehatan extends Layanan {
        ...
    }
    ```

2. **Object** adalah instance dari class. Pada kode ini, `RawatJalan rawatJalan = new RawatJalan();` adalah contoh pembuatan object.
    ```java
    RawatJalan rawatJalan = new RawatJalan();
    ```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaLayanan` dan `deskripsi` adalah contoh atribut.
    ```java
    private String namaLayanan;
    private String deskripsi;
    ```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Layanan dan kelas turunannya.
    ```java
    public Layanan(String namaLayanan, String deskripsi) {
        this.namaLayanan = namaLayanan;
        this.deskripsi = deskripsi;
    }
    
    public RawatJalan(String namaLayanan, String deskripsi) {
        super(namaLayanan, deskripsi);
    }
    ```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaLayanan` dan `setDeskripsi` adalah contoh method mutator.
    ```java
    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    ```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaLayanan` dan `getDeskripsi` adalah contoh method accessor.
    ```java
    public String getNamaLayanan() {
        return namaLayanan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
    ```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaLayanan` dan `deskripsi` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.
    ```java
    private String namaLayanan;
    private String deskripsi;
    ```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi properti dan method dari class lain. Pada kode ini, RawatJalan, RawatInap, PenunjangMedis, FasilitasUmum, MedicalCheckUp, dan PromosiKesehatan mewarisi Layanan dengan sintaks `extends`.
    ```java
    public class RawatJalan extends Layanan {
        ...
    }

    public class RawatInap extends Layanan {
        ...
    }
    ```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di Layanan merupakan overloading method `displayInfo` dan `displayInfo` di RawatJalan merupakan override dari method `displayInfo` di Layanan.
    ```java
    public String displayInfo(String additionalInfo) {
        return displayInfo() + "\nAdditional Info: " + additionalInfo;
    }

    @Override
    public String displayInfo() {
        ...
    }
    ```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else dalam method `getJenisLayanan` dan seleksi switch dalam method `getKategoriLayanan`.
    ```java
    public String getJenisLayanan() {
        if (this instanceof RawatJalan) {
            return "Rawat Jalan";
        } else if (this instanceof RawatInap) {
            return "Rawat Inap";
        } else {
            return "Layanan Lain";
        }
    }

    public String getKategoriLayanan() {
        switch (namaLayanan) {
            case "Medical Check-Up":
                return "Kesehatan";
            case "Fasilitas Umum":
                return "Umum";
            default:
                return "Lain-lain";
        }
    }
    ```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk menampilkan data layanan.
    ```java
    for (Layanan layanan : layananList) {
        System.out.println(layanan.displayInfo());
    }
    ```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method `System.out.println` untuk menampilkan output.
    ```java
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Nama Layanan: ");
    String namaLayanan = scanner.nextLine();

    System.out.println("\nData Layanan:");
    System.out.println(layanan.displayInfo());
    ```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Layanan[] layananList = new Layanan[5];` adalah contoh penggunaan array.
    ```java
    Layanan[] layananList = new Layanan[5];
    ```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani error.
    ```java
    try {
        // code that might throw an exception
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    ```

## Usulan Nilai

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

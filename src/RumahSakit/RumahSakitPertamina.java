package RumahSakit;

import java.util.Scanner;

public class RumahSakitPertamina {
        private Scanner input = new Scanner(System.in);

    // Atribut untuk layanan rawat jalan
    private String[] poliklinikRawatJalan = {
        "Poliklinik Saraf", "Poliklinik Bedah Umum", "Poliklinik Bedah Mulut",
        "Poliklinik Konservasi Gigi", "Poliklinik Kandungan", "Poliklinik Anak",
        "Poliklinik Penyakit Dalam", "Poliklinik Ortopedi", "Poliklinik THT"
    };

    // Atribut untuk layanan rawat inap
    private String[] kamarRawatInap = {
        "Kamar Rawat VVIP", "Kamar Perawatan VVIP", "Kamar Rawat VIP",
        "Kamar Perawatan VIP", "Kamar Rawat Kelas I", "Kamar Perawatan Kelas I",
        "Kamar Rawat Kelas II", "Kamar Perawatan Kelas II", "Kamar Rawat Kelas III",
        "Kamar Perawatan Kelas III", "Kamar ICU", "Perawatan ICU",
        "Kamar Isolasi", "Perawatan Isolasi Covid-19", "Kamar HCU",
        "Kamar Perawatan HCU", "Penunjang Medis"
    };

    // Atribut untuk dokter
    private String namaDr;
    private int jasaDr;
    private int pilihDr;

    // Atribut untuk pasien
    private String namaPasien;
    private int umurPasien;
    private String alamatPasien;

    // Atribut untuk fasilitas publik
    private String[] fasilitasPublik = {
        "Laboratorium", "Laboratorium Reguler", "Radiologi",
        "Penunjang Radiologi", "Fisioterapi", "Penunjang Fisioterapi",
        "Lab PCR", "Laboratorium PCR"
    };

    // Constructor
    public RumahSakitPertamina() {
        // Inisialisasi atribut jika diperlukan
    }

    // Mutator untuk pasien
    public void setPasien(String nama, int umur, String alamat) {
        this.namaPasien = nama;
        this.umurPasien = umur;
        this.alamatPasien = alamat;
    }

    // Accessor untuk pasien
    public String getNamaPasien() {
        return namaPasien;
    }

    public int getUmurPasien() {
        return umurPasien;
    }

    public String getAlamatPasien() {
        return alamatPasien;
    }

    // Metode untuk menampilkan layanan rawat jalan
    public void tampilkanLayananRawatJalan() {
        System.out.println("Layanan Rawat Jalan:");
        for (String poliklinik : poliklinikRawatJalan) {
            System.out.println("- " + poliklinik);
        }
    }

    // Metode untuk menampilkan layanan rawat inap
    public void tampilkanLayananRawatInap() {
        System.out.println("Layanan Rawat Inap:");
        for (String kamar : kamarRawatInap) {
            System.out.println("- " + kamar);
        }
    }

    // Metode untuk menampilkan informasi pasien
    public void tampilkanInformasiPasien() {
        try {
            System.out.println("Masukkan nama pasien:");
            namaPasien = input.next();
            System.out.println("Masukkan umur pasien:");
            umurPasien = input.nextInt();
            System.out.println("Masukkan alamat pasien:");
            alamatPasien = input.next();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input. Silakan coba lagi.");
            input.next(); // Membersihkan buffer
        }

        System.out.println("Informasi Pasien:");
        System.out.println("Nama: " + namaPasien);
        System.out.println("Umur: " + umurPasien);
        System.out.println("Alamat: " + alamatPasien);
    }

    // Metode untuk menampilkan informasi dokter
    public void tampilkanInformasiDokter() {
        System.out.println("Pilih dokter:");
        System.out.println("1. Dr. Ryu Hasan (Jasa: 150000)");
        System.out.println("2. Dr. Budi Santoso (Jasa: 120000)");
        System.out.println("3. Dr. Maria (Jasa: 200000)");

        while (true) {
            try {
                pilihDr = input.nextInt();
                if (pilihDr == 1) {
                    namaDr = "Dr. Ryu Hasan";
                    jasaDr = 150000;
                    break;
                } else if (pilihDr == 2) {
                    namaDr = "Dr. Budi Santoso";
                    jasaDr = 120000;
                    break;
                } else if (pilihDr == 3) {
                    namaDr = "Dr. Maria";
                    jasaDr = 200000;
                    break;
                } else {
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input. Silakan coba lagi.");
                input.next(); // Membersihkan buffer
            }
        }

        System.out.println("Informasi Dokter:");
        System.out.println("Nama: " + namaDr);
        System.out.println("Jasa: " + jasaDr);
    }

    // Metode untuk menampilkan fasilitas publik
    public void tampilkanFasilitasPublik() {
        System.out.println("Fasilitas Publik:");
        for (String fasilitas : fasilitasPublik) {
            System.out.println("- " + fasilitas);
        }
    }

    // Polymorphism Overloading untuk menampilkan informasi dokter
    public void tampilkanInformasiDokter(int pilihDr) {
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
            return;
        }

        System.out.println("Informasi Dokter:");
        System.out.println("Nama: " + namaDr);
        System.out.println("Jasa: " + jasaDr);
    }
}




package RumahSakit;

import java.util.Scanner;

public class RumahSakitPertamina {
        private Scanner scanner = new Scanner(System.in);

    // Atribut untuk layanan rawat jalan
    private String[] poliklinikRawatJalan = {
        "Klinik Neurologi", "Klinik Bedah Umum", "Klinik Bedah Oral",
        "Klinik Gigi dan Mulut", "Klinik Kandungan", "Klinik Anak",
        "Klinik Penyakit Dalam", "Klinik Ortopedi", "Klinik THT"
    };

    // Atribut untuk layanan rawat inap
    private String[] kamarRawatInap = {
        "Kamar VVIP", "Ruang Perawatan VVIP", "Kamar VIP",
        "Ruang Perawatan VIP", "Kamar Kelas Satu", "Ruang Perawatan Kelas Satu",
        "Kamar Kelas Dua", "Ruang Perawatan Kelas Dua", "Kamar Kelas Tiga",
        "Ruang Perawatan Kelas Tiga", "Kamar ICU", "Ruang Perawatan ICU",
        "Kamar Isolasi", "Perawatan Isolasi Covid-19", "Kamar HCU",
        "Ruang Perawatan HCU", "Penunjang Medis"
    };

    // Atribut untuk dokter
    private String dokterNama;
    private int dokterJasa;
    private int dokterPilihan;

    // Atribut untuk pasien
    private String pasienNama;
    private int pasienUmur;
    private String pasienAlamat;

    // Atribut untuk fasilitas publik
    private String[] fasilitasPublik = {
        "Laboratorium", "Laboratorium Standar", "Radiologi",
        "Ruang Radiologi", "Fisioterapi", "Ruang Fisioterapi",
        "Lab PCR", "Laboratorium PCR"
    };

    // Constructor
    public RumahSakitPertamina() {
        // Inisialisasi atribut jika diperlukan
    }

    // Mutator untuk pasien
    public void setPasien(String nama, int umur, String alamat) {
        this.pasienNama = nama;
        this.pasienUmur = umur;
        this.pasienAlamat = alamat;
    }

    // Accessor untuk pasien
    public String getPasienNama() {
        return pasienNama;
    }

    public int getPasienUmur() {
        return pasienUmur;
    }

    public String getPasienAlamat() {
        return pasienAlamat;
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
            pasienNama = scanner.next();
            System.out.println("Masukkan umur pasien:");
            pasienUmur = scanner.nextInt();
            System.out.println("Masukkan alamat pasien:");
            pasienAlamat = scanner.next();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input. Silakan coba lagi.");
            scanner.next(); // Membersihkan buffer
        }

        System.out.println("Informasi Pasien:");
        System.out.println("Nama: " + pasienNama);
        System.out.println("Umur: " + pasienUmur);
        System.out.println("Alamat: " + pasienAlamat);
    }

    // Metode untuk menampilkan informasi dokter
    public void tampilkanInformasiDokter() {
        System.out.println("Pilih dokter:");
        System.out.println("1. Dr. Ryu Hasan (Jasa: 150000)");
        System.out.println("2. Dr. Budi Santoso (Jasa: 120000)");
        System.out.println("3. Dr. Maria (Jasa: 200000)");

        while (true) {
            try {
                dokterPilihan = scanner.nextInt();
                if (dokterPilihan == 1) {
                    dokterNama = "Dr. Ryu Hasan";
                    dokterJasa = 150000;
                    break;
                } else if (dokterPilihan == 2) {
                    dokterNama = "Dr. Budi Santoso";
                    dokterJasa = 120000;
                    break;
                } else if (dokterPilihan == 3) {
                    dokterNama = "Dr. Maria";
                    dokterJasa = 200000;
                    break;
                } else {
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input. Silakan coba lagi.");
                scanner.next(); // Membersihkan buffer
            }
        }

        System.out.println("Informasi Dokter:");
        System.out.println("Nama: " + dokterNama);
        System.out.println("Jasa: " + dokterJasa);
    }

    // Metode untuk menampilkan fasilitas publik
    public void tampilkanFasilitasPublik() {
        System.out.println("Fasilitas Publik:");
        for (String fasilitas : fasilitasPublik) {
            System.out.println("- " + fasilitas);
        }
    }

    // Polymorphism Overloading untuk menampilkan informasi dokter
    public void tampilkanInformasiDokter(int dokterPilihan) {
        if (dokterPilihan == 1) {
            dokterNama = "Dr. Ryu Hasan";
            dokterJasa = 150000;
        } else if (dokterPilihan == 2) {
            dokterNama = "Dr. Budi Santoso";
            dokterJasa = 120000;
        } else if (dokterPilihan == 3) {
            dokterNama = "Dr. Maria";
            dokterJasa = 200000;
        } else {
            System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            return;
        }

        System.out.println("Informasi Dokter:");
        System.out.println("Nama: " + dokterNama);
        System.out.println("Jasa: " + dokterJasa);
    }
}



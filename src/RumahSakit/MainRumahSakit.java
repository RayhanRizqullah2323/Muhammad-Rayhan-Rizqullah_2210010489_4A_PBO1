package RumahSakit;

import java.util.Scanner;  // Tambahkan import statement ini

public class MainRumahSakit {
        public static void main(String[] args) {
        RumahSakitPertamina rumahSakit = new RumahSakitPertamina();
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan semua layanan secara berurutan
        rumahSakit.tampilkanLayananRawatJalan();
        rumahSakit.tampilkanLayananRawatInap();
        rumahSakit.tampilkanInformasiPasien();
        rumahSakit.tampilkanInformasiDokter();
        rumahSakit.tampilkanFasilitasPublik();


        // Menampilkan menu untuk pengguna
        System.out.println("Pilih layanan yang ingin ditampilkan:");
        System.out.println("1. Layanan Rawat Jalan");
        System.out.println("2. Layanan Rawat Inap");
        System.out.println("3. Informasi Pasien");
        System.out.println("4. Informasi Dokter");
        System.out.println("5. Fasilitas Publik");
        
        int pilihan = scanner.nextInt();
        
        // Seleksi menggunakan switch-case
        switch (pilihan) {
            case 1:
                rumahSakit.tampilkanLayananRawatJalan();
                break;
            case 2:
                rumahSakit.tampilkanLayananRawatInap();
                break;
            case 3:
                rumahSakit.tampilkanInformasiPasien();
                break;
            case 4:
                rumahSakit.tampilkanInformasiDokter();
                break;
            case 5: 
                rumahSakit.tampilkanFasilitasPublik();
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }
}
    
              





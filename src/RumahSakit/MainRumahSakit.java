package RumahSakit;

public class MainRumahSakit {
    public static void main(String[] args) {
        RumahSakitPertamina rumahSakit = new RumahSakitPertamina();
        
        // Menetapkan pilihan secara langsung (untuk contoh)
        int pilihan = 1; // Ganti nilai ini untuk memilih layanan yang berbeda

        // Seleksi menggunakan switch-case (10. Seleksi)
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
    
              





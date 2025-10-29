import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;
        ArrayList<String> daftarNama = new ArrayList<>();
        ArrayList<String> daftarOlahraga = new ArrayList<>();
        
        do {
            // Input nama
            System.out.print("Masukkan nama anda: ");
            String nama = scanner.nextLine();
            
            // Tampilkan menu cabang olahraga
            System.out.println("\nPilih Cabang Olahraga:");
            System.out.println("1. Badminton");
            System.out.println("2. Tenis Meja");
            System.out.println("3. Sepakbola");
            System.out.println("4. Bola Voli");
            System.out.print("Masukkan pilihan (1-4): ");
            int cabangOlahraga = scanner.nextInt();
            
            // Switch case lambda untuk memilih cabang olahraga
            String hasilPilihan = switch (cabangOlahraga) {
                case 1 -> "Badminton";
                case 2 -> "Tenis Meja";
                case 3 -> "Sepakbola";
                case 4 -> "Bola Voli";
                default -> "Pilihan tidak valid";
            };
            
            // Hanya menyimpan data jika pilihan valid
            if (!hasilPilihan.equals("Pilihan tidak valid")) {
                daftarNama.add(nama);
                daftarOlahraga.add(hasilPilihan);
                System.out.println("\n=== Data Berhasil Ditambahkan ===");
            } else {
                System.out.println("\n=== Pilihan Tidak Valid, Data Tidak Disimpan ===");
            }
            
            // Tampilkan hasil input saat ini
            System.out.println("Nama: " + nama);
            System.out.println("Cabang Olahraga: " + hasilPilihan);
            
            // Tanya apakah ingin input lagi
            System.out.print("\nIngin memasukkan data lagi? (y/n): ");
            scanner.nextLine(); // Clear buffer
            pilihan = scanner.nextLine();
            System.out.println(); // Baris kosong untuk pemisah
            
        } while (pilihan.equals("y"));
        
        // Menampilkan semua data yang tersimpan
        System.out.println("\n=== Daftar Semua Peserta ===");
        if (daftarNama.isEmpty()) {
            System.out.println("Tidak ada data peserta yang valid.");
        } else {
            for (int i = 0; i < daftarNama.size(); i++) {
                System.out.println("\nPeserta ke-" + (i + 1));
                System.out.println("Nama: " + daftarNama.get(i));
                System.out.println("Cabang Olahraga: " + daftarOlahraga.get(i));
            }
        }
        
        System.out.println("\nTerima kasih telah menggunakan program ini!");
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;
        int nomorPeserta = 1;
        
        do {
            // Header untuk setiap peserta
            System.out.println("\n=== Peserta ke-" + nomorPeserta + " ===");
            
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
            
            // Tampilkan hasil input saat ini
            System.out.println("\n=== Data Peserta ke-" + nomorPeserta + " ===");
            System.out.println("Nama: " + nama);
            System.out.println("Cabang Olahraga: " + hasilPilihan);
            
            if (hasilPilihan.equals("Pilihan tidak valid")) {
                System.out.println("\nPilihan tidak valid, silakan coba lagi.");
            } else {
                nomorPeserta++; // Increment nomor peserta hanya jika input valid
            }
            
            // Tanya apakah ingin input lagi
            System.out.print("\nIngin memasukkan data lagi? (y/n): ");
            scanner.nextLine(); // Clear buffer
            pilihan = scanner.nextLine();
            System.out.println(); // Baris kosong untuk pemisah
            
        } while (pilihan.equals("y"));
        
        System.out.println("\nTerima kasih telah menggunakan program ini!");
        scanner.close();
    }
}

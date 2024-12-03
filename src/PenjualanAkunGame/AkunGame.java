//Charles Parluhutan_50421306
package PenjualanAkunGame;
import java.util.Scanner;

public class AkunGame {
    String namaGame;
    private final String tipeAkun;
    private final int harga;

    public AkunGame(String namaGame, String tipeAkun, int harga) {
        this.namaGame = namaGame;
        this.tipeAkun = tipeAkun;
        this.harga = harga;
    }

    public void tampilInfo() {
        System.out.println("Nama Game: " + namaGame + ", Tipe Akun: " + tipeAkun + ", Harga: Rp " + harga);
    }

    public int getHarga() {
        return harga;
    }
}

class PenjualanAkun {
    private static final AkunGame[] daftarAkunMobile;
    private static final AkunGame[] daftarAkunPC;

    static {
        daftarAkunMobile = new AkunGame[]{
            new AkunGame("Mobile Legends", "Akun Epic (Mobile)", 50000),
            new AkunGame("Free Fire", "Akun Diamond (Mobile)", 70000),
            new AkunGame("PUBG Mobile", "Akun Elite (Mobile)", 100000),
            new AkunGame("Genshin Impact", "Akun AR40+ (Mobile)", 150000)
        };

        daftarAkunPC = new AkunGame[]{
            new AkunGame("Dota 2", "Akun Legend (PC)", 80000),
            new AkunGame("League of Legends", "Akun Platinum (PC)", 120000),
            new AkunGame("Counter-Strike: Global Offensive", "Akun Gold III (PC)", 90000),
            new AkunGame("Valorant", "Akun Radiant (PC)", 110000)
        };
    }

    public static void pilihanAkun() {
        Scanner input = new Scanner(System.in);

        // Pilihan kategori akun
        System.out.println("Pilih Kategori Akun:");
        System.out.println("1. Akun Mobile");
        System.out.println("2. Akun PC");
        System.out.print("Masukkan pilihan (1/2): ");
        int kategori = input.nextInt();

        AkunGame[] daftarAkun = null;

        // Menentukan daftar akun berdasarkan kategori
        switch (kategori) {
            case 1:
                daftarAkun = daftarAkunMobile;
                break;
            case 2:
                daftarAkun = daftarAkunPC;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return; // Menghentikan eksekusi jika pilihan tidak valid
        }

        // Menampilkan daftar akun berdasarkan kategori yang dipilih
        System.out.println("Daftar Akun Game " + (kategori == 1 ? "Mobile" : "PC") + " yang Tersedia:");
        for (int i = 0; i < daftarAkun.length; i++) {
            System.out.print((i + 1) + ". ");
            daftarAkun[i].tampilInfo();
        }

        System.out.print("Pilih nomor akun yang ingin dibeli: ");
        int pilihan = input.nextInt();

        if (pilihan > 0 && pilihan <= daftarAkun.length) {
            AkunGame akunTerpilih = daftarAkun[pilihan - 1];
            System.out.print("Masukkan jumlah akun yang ingin dibeli: ");
            int jumlah = input.nextInt();
            int totalHarga = akunTerpilih.getHarga() * jumlah;

            System.out.println("Anda membeli " + jumlah + " akun " + akunTerpilih.namaGame + " dengan total harga: Rp " + totalHarga);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                pilihanAkun();
                
                System.out.print("Transaksi lagi? Ya=1, Tidak=2 : ");
                int pilihan;
                // Loop untuk memastikan pengguna memasukkan pilihan yang valid
                while (true) {
                    pilihan = input.nextInt();
                    if (pilihan == 1 || pilihan == 2) {
                        break; // keluar dari loop jika pilihan valid
                    } else {
                        System.out.print("Pilihan tidak valid. Masukkan 1 untuk Ya atau 2 untuk Tidak: ");
                    }
                }
                if (pilihan != 1) {
                    break; // keluar dari loop jika pengguna memilih tidak
                }
            }
            System.out.println("Terima kasih telah menggunakan layanan kami!");
        }
    }
}
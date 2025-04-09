// =====================
// Main App: PuskesmasApp
// =====================
import java.util.*;

public class PuskesmasApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Antrian antrianUmum = new Antrian(new LayananUmum(), new LayananUmum());
        Antrian antrianGigi = new Antrian(new LayananGigi(), new LayananGigi());

        while (true) {
            System.out.println("\n===== APLIKASI ANTRIAN PUSKESMAS =====");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Proses Pasien");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); // flush newline

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("Umur: ");
                    int umur = input.nextInt();
                    input.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = input.nextLine();
                    System.out.print("Jenis Layanan (umum/gigi): ");
                    String jenis = input.nextLine().toLowerCase();

                    Pasien pasien = new Pasien(nama, umur, keluhan, jenis);
                    if (jenis.equals("umum")) {
                        antrianUmum.tambahPasien(pasien);
                    } else if (jenis.equals("gigi")) {
                        antrianGigi.tambahPasien(pasien);
                    } else {
                        System.out.println("Jenis layanan tidak dikenali.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Antrian Umum ---");
                    antrianUmum.tampilkanAntrian();
                    System.out.println("\n--- Antrian Gigi ---");
                    antrianGigi.tampilkanAntrian();
                    break;

                case 3:
                    System.out.print("Jenis Layanan yang diproses (umum/gigi): ");
                    String jenisProses = input.nextLine().toLowerCase();
                    if (jenisProses.equals("umum")) {
                        antrianUmum.prosesPasien();
                    } else if (jenisProses.equals("gigi")) {
                        antrianGigi.prosesPasien();
                    } else {
                        System.out.println("Jenis layanan tidak dikenali.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih. Keluar dari aplikasi.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
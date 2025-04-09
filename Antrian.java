// =====================
// Class: Antrian
// =====================
import java.util.*;

public class Antrian {
    private PriorityQueue<Pasien> daftarAntrian;
    private LayananKesehatan layanan;
    private PrioritasAntrian prioritas;

    public Antrian(LayananKesehatan layanan, PrioritasAntrian prioritas) {
        this.layanan = layanan;
        this.prioritas = prioritas;

        // Priority queue dengan comparator berdasarkan hitungPrioritas
        this.daftarAntrian = new PriorityQueue<>(Comparator.comparingInt(prioritas::hitungPrioritas));
    }

    public void tambahPasien(Pasien pasien) {
        daftarAntrian.offer(pasien);
        System.out.println("Pasien " + pasien.getNama() + " ditambahkan ke antrian " + layanan.getNamaLayanan());
    }

    public void prosesPasien() {
        Pasien pasien = daftarAntrian.poll();
        if (pasien != null) {
            layanan.layaniPasien(pasien);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanAntrian() {
        if (daftarAntrian.isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
        } else {
            System.out.println("Daftar Antrian " + layanan.getNamaLayanan() + ":");
            for (Pasien p : daftarAntrian) {
                System.out.println("- " + p.getNama() + " (" + p.getUmur() + " tahun) keluhan: " + p.getKeluhan());
            }
        }
    }
}
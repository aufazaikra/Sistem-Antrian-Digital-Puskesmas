// =====================
// Class: Pasien
// =====================
public class Pasien {
    private String nama;
    private int umur;
    private String keluhan;
    private String jenisLayanan;

    public Pasien(String nama, int umur, String keluhan, String jenisLayanan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
        this.jenisLayanan = jenisLayanan;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }
}
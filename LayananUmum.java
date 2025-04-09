// =====================
// Class: LayananUmum (implements dua interface)
// =====================
public class LayananUmum implements LayananKesehatan, PrioritasAntrian {
    @Override
    public void layaniPasien(Pasien pasien) {
        System.out.println("[Layanan Umum] Melayani pasien: " + pasien.getNama());
    }

    @Override
    public String getNamaLayanan() {
        return "Layanan Umum";
    }

    @Override
    public int hitungPrioritas(Pasien pasien) {
        // Contoh prioritas: lansia (umur > 60) mendapatkan prioritas tinggi
        return pasien.getUmur() > 60 ? 1 : 2;
    }
}
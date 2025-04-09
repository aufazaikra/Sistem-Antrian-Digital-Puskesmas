// =====================
// Class: LayananGigi
// =====================
public class LayananGigi implements LayananKesehatan, PrioritasAntrian {
    @Override
    public void layaniPasien(Pasien pasien) {
        System.out.println("[Layanan Gigi] Melayani pasien: " + pasien.getNama());
    }

    @Override
    public String getNamaLayanan() {
        return "Layanan Gigi";
    }

    @Override
    public int hitungPrioritas(Pasien pasien) {
        // Semua pasien layanan gigi dianggap sama prioritas
        return 2;
    }
}
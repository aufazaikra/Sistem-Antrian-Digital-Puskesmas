# Sistem-Antrian-Digital-Puskesmas


Aplikasi ini merupakan simulasi sistem **antrian pasien di puskesmas**, di mana pasien dapat mendaftar untuk layanan **umum** atau **gigi**, dan sistem akan mengelola serta memproses antrian berdasarkan **prioritas** tertentu.

---

## 📌 Fitur

- Menambahkan data pasien (nama, umur, keluhan, jenis layanan).
- Menampilkan daftar antrian berdasarkan jenis layanan.
- Memproses pasien secara berurutan berdasarkan **prioritas**.
- Dua jenis layanan tersedia:
  - **Layanan Umum**: Lansia (umur > 60) mendapat prioritas lebih tinggi.
  - **Layanan Gigi**: Semua pasien mendapat prioritas yang sama.

---

## 🧱 Struktur Proyek
├── LayananKesehatan.java # Interface untuk layanan kesehatan ├── PrioritasAntrian.java # Interface untuk sistem prioritas ├── Pasien.java # Class data pasien ├── LayananUmum.java # Implementasi layanan umum ├── LayananGigi.java # Implementasi layanan gigi ├── Antrian.java # Class sistem antrian (menggunakan PriorityQueue) └── PuskesmasApp.java # Main class (console-based interface)

## ▶️ Cara Menjalankan

1. **Clone repositori ini**
`bash
git clone https://github.com/username/puskesmas-antrian.git
cd puskesmas-antrian`

2. Compile semua file Java

`javac *.java`

3. Jalankan aplikasi

`java PuskesmasApp`

## 📚 Konsep OOP yang Digunakan
Interface: LayananKesehatan, PrioritasAntrian

Polimorfisme: Implementasi berbeda oleh LayananUmum dan LayananGigi

Enkapsulasi: Atribut pasien dilindungi dengan getter

Koleksi Java: Menggunakan PriorityQueue dengan Comparator

##



public class Perpustakaan {
    String     idPerpustakaan;
    String     nama;
    String     lokasi;
    int        tahunBerdiri;
    String     gedung;
    String     lantai;
    Kategori[] kategori;

    Perpustakaan(String idPerpustakaan, String nama, String lokasi,
                 int tahunBerdiri, String gedung, String lantai,
                 Kategori[] kategori) {
        this.idPerpustakaan = idPerpustakaan;
        this.nama           = nama;
        this.lokasi         = lokasi;
        this.tahunBerdiri   = tahunBerdiri;
        this.gedung         = gedung;
        this.lantai         = lantai;
        this.kategori       = kategori;
    }

    void tampilInfo() {
        System.out.println("  ID            : " + idPerpustakaan);
        System.out.println("  Nama          : " + nama);
        System.out.println("  Lokasi        : " + lokasi);
        System.out.println("  Tahun Berdiri : " + tahunBerdiri);
        System.out.println("  Gedung        : " + gedung + ", " + lantai);
        System.out.println("  Jml Kategori  : " + kategori.length + " kategori");
    }
}
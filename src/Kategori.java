public class Kategori {
    String idKategori;
    String namaKategori;
    String deskripsi;
    Buku[] buku;

    Kategori(String idKategori, String namaKategori, String deskripsi, Buku[] buku) {
        this.idKategori   = idKategori;
        this.namaKategori = namaKategori;
        this.deskripsi    = deskripsi;
        this.buku         = buku;
    }

    void tampilInfo() {
        System.out.println("  ID Kategori   : " + idKategori);
        System.out.println("  Nama Kategori : " + namaKategori);
        System.out.println("  Deskripsi     : " + deskripsi);
        System.out.println("  Jumlah Buku   : " + buku.length + " judul");
    }

    void tampilDaftarBuku() {
        for (int i = 0; i < buku.length; i++) {
            System.out.println("  --- Buku ke-" + (i + 1) + " ---");
            buku[i].tampilInfo();
        }
    }
}
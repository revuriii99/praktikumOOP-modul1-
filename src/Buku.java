public class Buku {
    String   idBuku;
    String   judul;
    String   isbn;
    int      tahunTerbit;
    int      jumlahHalaman;
    String   penerbit;
    Penulis[] penulis;
    String sinopsis;

    public Buku(String idBuku, String judul, String isbn,
         int tahunTerbit, int jumlahHalaman, String penerbit,
         Penulis[] penulis, String sinopsis) {
        this.idBuku        = idBuku;
        this.judul         = judul;
        this.isbn          = isbn;
        this.tahunTerbit   = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.penerbit      = penerbit;
        this.penulis       = penulis;
        this.sinopsis        = sinopsis;
    }

    public int hitungJumlahKata() {
        if (sinopsis == null || sinopsis.isEmpty()) return 0;
        String[] kata = sinopsis.trim().split("\\s+");
        return kata.length;
    }

    void tampilInfo() {
        System.out.println("  ID Buku       : " + idBuku);
        System.out.println("  Judul         : " + judul);
        System.out.println("  ISBN          : " + isbn);
        System.out.println("  Tahun Terbit  : " + tahunTerbit);
        System.out.println("  Jml Halaman   : " + jumlahHalaman + " hal.");
        System.out.println("  Penerbit      : " + penerbit);
        System.out.print  ("  Penulis       : ");
        for (int i = 0; i < penulis.length; i++) {
            System.out.print(penulis[i].namaLengkap);
            if (i < penulis.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
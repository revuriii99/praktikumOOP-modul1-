import java.io.*;

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

    public double cekKesamaan(Buku b) {
        int sama = 0;
        int total = 6; // jumlah attribute yang dibandingkan

        if (this.judul.equals(b.judul))           sama++;
        if (this.isbn.equals(b.isbn))             sama++;
        if (this.tahunTerbit == b.tahunTerbit)    sama++;
        if (this.jumlahHalaman == b.jumlahHalaman)sama++;
        if (this.penerbit.equals(b.penerbit))     sama++;
        if (this.sinopsis.equals(b.sinopsis))     sama++;

        return ((double) sama / total) * 100;
    }

    public Buku copy() {
        return new Buku(idBuku, judul, isbn, tahunTerbit, jumlahHalaman, penerbit, penulis, sinopsis);
    }

    public void bacaFile(String pathFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathFile));
            String baris;
            while ((baris = br.readLine()) != null) {
                String[] bagian = baris.split(";");
                if (bagian.length >= 2) {
                    this.judul    = bagian[0].trim();
                    this.penerbit = bagian[1].trim();
                }
            }
            br.close();
            System.out.println("Berhasil membaca file: " + pathFile);
        } catch (IOException e) {
            System.out.println("File tidak ditemukan: " + pathFile);
        }
    }

    public void simpanFile(String namaFile) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile));
            bw.write(judul + "; " + penerbit);
            bw.newLine();
            bw.close();
            System.out.println("Berhasil disimpan ke file: " + namaFile);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan file: " + namaFile);
        }
    }

    public double hitungRoyalti(double hargaBuku) {
        return hargaBuku * 0.10;
    }

    public double hitungRoyalti(double hargaBuku, double persen) {
        return hargaBuku * (persen / 100);
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
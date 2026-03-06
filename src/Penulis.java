public class Penulis {
    String idPenulis;
    String namaLengkap;
    String kebangsaan;
    String tanggalLahir;

    Penulis(String idPenulis, String namaLengkap, String kebangsaan, String tanggalLahir) {
        this.idPenulis    = idPenulis;
        this.namaLengkap  = namaLengkap;
        this.kebangsaan   = kebangsaan;
        this.tanggalLahir = tanggalLahir;
    }

    void tampilInfo() {
        System.out.println("  ID Penulis    : " + idPenulis);
        System.out.println("  Nama          : " + namaLengkap);
        System.out.println("  Kebangsaan    : " + kebangsaan);
        System.out.println("  Tanggal Lahir : " + tanggalLahir);
    }
}
public class Main {

    static void garis()    { System.out.println("=".repeat(55)); }
    static void subGaris() { System.out.println("-".repeat(55)); }

    public static void main(String[] args) {

        Penulis p1  = new Penulis("PNS-001", "Ahmad Fauzi, M.Kom",    "Indonesia", "1985-11-08");
        Penulis p2  = new Penulis("PNS-002", "Dewi Kusuma",           "Indonesia", "1990-04-19");
        Penulis p3  = new Penulis("PNS-003", "Prof. Siti Rahma",      "Indonesia", "1972-07-22");
        Penulis p4  = new Penulis("PNS-004", "Friedrich Nietzsche",   "Jerman",    "1844-10-15");
        Penulis p5  = new Penulis("PNS-005", "Bertrand Russell",      "Inggris",   "1872-05-18");
        Penulis p6  = new Penulis("PNS-006", "Prof. Hasan Muarif",    "Indonesia", "1955-01-30");
        Penulis p7  = new Penulis("PNS-007", "Dr. Soekarno Wibowo",   "Indonesia", "1948-08-17");
        Penulis p8  = new Penulis("PNS-008", "Pramoedya Ananta Toer", "Indonesia", "1925-02-06");
        Penulis p9  = new Penulis("PNS-009", "Prof. Quraish Shihab",  "Indonesia", "1944-02-16");
        Penulis p10 = new Penulis("PNS-010", "Azyumardi Azra",        "Indonesia", "1955-03-04");
        Penulis p11 = new Penulis("PNS-011", "Sigmund Freud",         "Austria",   "1856-05-06");
        Penulis p12 = new Penulis("PNS-012", "Dr. Reza Indragiri",    "Indonesia", "1977-09-12");
        Penulis p13 = new Penulis("PNS-013", "Miriam Budiardjo",      "Indonesia", "1923-11-17");
        Penulis p14 = new Penulis("PNS-014", "Dr. Bambang Setiawan",  "Indonesia", "1960-03-15");
        Penulis p15 = new Penulis("PNS-015", "Andrea Hirata",         "Indonesia", "1967-10-24");
        Penulis p16 = new Penulis("PNS-016", "Dee Lestari",           "Indonesia", "1976-01-20");
        Penulis p17 = new Penulis("PNS-017", "Tere Liye",             "Indonesia", "1979-05-21");

        Buku[] bukuTeknologi = {
                new Buku("BKU-001", "Algoritma dan Pemrograman",          "978-602-000-101-1", 2020, 420, "Informatika Press", new Penulis[]{p1, p2},
                        "Buku ini membahas konsep dasar algoritma dan teknik pemrograman menggunakan berbagai bahasa pemrograman modern"),
                new Buku("BKU-002", "Kecerdasan Buatan: Teori & Aplikasi","978-602-000-102-2", 2021, 385, "Erlangga",          new Penulis[]{p1},
                        "Membahas teori kecerdasan buatan mulai dari machine learning hingga neural network dan penerapannya di industri"),
                new Buku("BKU-003", "Jaringan Komputer Modern",           "978-602-000-103-3", 2019, 512, "Andi Offset",       new Penulis[]{p14, p1},
                        "Konsep jaringan komputer modern mencakup protokol komunikasi arsitektur jaringan dan keamanan data secara menyeluruh"),
                new Buku("BKU-004", "Database Systems Design",            "978-602-000-104-4", 2022, 368, "Informatika Press", new Penulis[]{p2},
                        "Panduan lengkap merancang sistem basis data relasional dari tahap analisis kebutuhan hingga implementasi dan optimasi"),
                new Buku("BKU-005", "Keamanan Siber dan Kriptografi",     "978-602-000-105-5", 2023, 294, "Erlangga",          new Penulis[]{p14, p2},
                        "Membahas ancaman keamanan siber teknik kriptografi modern dan strategi perlindungan sistem informasi di era digital"),
        };

        Buku[] bukuFilsafat = {
                new Buku("BKU-006", "Thus Spoke Zarathustra",             "978-602-000-202-2", 1883, 342, "PT Gramedia",       new Penulis[]{p4},
                        "Karya monumental Nietzsche yang memperkenalkan konsep kehendak untuk berkuasa dan ide manusia super atau Ubermensch"),
                new Buku("BKU-007", "Sejarah Filsafat Barat",             "978-602-000-203-3", 1945, 924, "PT Gramedia",       new Penulis[]{p5},
                        "Telaah komprehensif perjalanan filsafat barat dari zaman Yunani kuno hingga pemikiran abad dua puluh oleh Bertrand Russell"),
                new Buku("BKU-008", "Pengantar Filsafat Islam",           "978-602-000-204-4", 2015, 308, "Mizan",             new Penulis[]{p6},
                        "Pengenalan sistematis terhadap tradisi filsafat Islam klasik dan kontemporer dari Al Kindi hingga para pemikir modern"),
                new Buku("BKU-009", "Epistemologi & Metafisika",          "978-602-000-205-5", 2018, 415, "LP3ES",             new Penulis[]{p6, p3},
                        "Kajian mendalam tentang teori pengetahuan dan hakikat realitas dalam perspektif filsafat analitik dan kontinental"),
                new Buku("BKU-010", "Etika dan Logika Modern",            "978-602-000-206-6", 2019, 280, "Mizan",             new Penulis[]{p5},
                        "Pembahasan prinsip etika dan logika formal yang relevan bagi kehidupan manusia modern dalam menghadapi dilema moral"),
        };

        Buku[] bukuSejarah = {
                new Buku("BKU-011", "Sejarah Nasional Indonesia Jilid I", "978-602-000-301-1", 2008, 680, "Balai Pustaka",     new Penulis[]{p7},
                        "Dokumentasi sejarah bangsa Indonesia dari masa prasejarah hingga periode kerajaan nusantara yang kaya dan beragam"),
                new Buku("BKU-012", "Runtuhnya Hindia Belanda",           "978-602-000-302-2", 2012, 412, "Kompas",            new Penulis[]{p7, p8},
                        "Kisah detil tentang keruntuhan kekuasaan kolonial Belanda di Indonesia dan dampaknya terhadap pergerakan kemerdekaan"),
                new Buku("BKU-013", "Bumi Manusia",                       "978-602-000-303-3", 1980, 535, "Hasta Mitra",       new Penulis[]{p8},
                        "Novel sejarah yang menggambarkan kehidupan masyarakat pribumi di bawah tekanan kolonialisme Belanda pada awal abad dua puluh"),
                new Buku("BKU-014", "Peradaban Islam: Sejarah & Warisan", "978-602-000-304-4", 2016, 392, "Mizan",             new Penulis[]{p6, p10},
                        "Menelusuri kejayaan peradaban Islam dari masa kenabian hingga era keemasan ilmu pengetahuan dan warisan budayanya"),
                new Buku("BKU-015", "Revolusi Indonesia 1945",            "978-602-000-305-5", 2010, 318, "Obor Indonesia",    new Penulis[]{p7},
                        "Rekonstruksi peristiwa revolusi kemerdekaan Indonesia tahun 1945 beserta tokoh perjuangan dan dinamika politiknya"),
        };

        Buku[] bukuAgama = {
                new Buku("BKU-016", "Tafsir Al-Misbah Vol. 1",            "978-602-000-401-1", 2003, 650, "Lentera Hati",      new Penulis[]{p9},
                        "Tafsir Al Quran kontemporer karya Quraish Shihab yang menghadirkan pesan ayat suci dalam konteks kehidupan masyarakat Indonesia"),
                new Buku("BKU-017", "Islam dan Pluralisme",               "978-602-000-403-3", 2007, 284, "Paramadina",        new Penulis[]{p10},
                        "Kajian tentang nilai toleransi dan pluralisme dalam ajaran Islam serta relevansinya di tengah masyarakat majemuk Indonesia"),
                new Buku("BKU-018", "Jaringan Ulama Timur Tengah",        "978-602-000-404-4", 1994, 468, "Mizan",             new Penulis[]{p10},
                        "Penelitian mendalam tentang jaringan intelektual ulama Nusantara dengan pusat keilmuan Islam di Timur Tengah abad tujuh belas"),
                new Buku("BKU-019", "Membumikan Al-Quran",                "978-602-000-405-5", 1992, 512, "Mizan",             new Penulis[]{p9},
                        "Upaya menghadirkan pesan Al Quran secara kontekstual agar dapat menjadi panduan nyata kehidupan umat Islam masa kini"),
                new Buku("BKU-020", "Ihya Ulumuddin (Terjemah)",          "978-602-000-406-6", 2015, 820, "Pustaka Nasional",  new Penulis[]{p6, p9},
                        "Terjemahan karya agung Imam Al Ghazali tentang ilmu agama akhlak dan jalan menuju kesempurnaan spiritual seorang Muslim"),
        };

        Buku[] bukuPsikologi = {
                new Buku("BKU-021", "Interpretasi Mimpi",                 "978-602-000-501-1", 1899, 562, "PT Gramedia",       new Penulis[]{p11},
                        "Karya revolusioner Sigmund Freud yang mengungkap makna tersembunyi di balik mimpi sebagai jendela menuju alam bawah sadar"),
                new Buku("BKU-022", "Psikologi Forensik di Indonesia",    "978-602-000-503-3", 2017, 312, "Erlangga",          new Penulis[]{p12},
                        "Penerapan ilmu psikologi dalam sistem peradilan Indonesia mencakup profiling pelaku kejahatan dan analisis kesaksian"),
                new Buku("BKU-023", "Psikologi Perkembangan Anak",        "978-602-000-504-4", 2019, 368, "Bumi Aksara",       new Penulis[]{p3, p12},
                        "Tahapan tumbuh kembang anak dari masa bayi hingga remaja ditinjau dari aspek kognitif emosional sosial dan fisik"),
                new Buku("BKU-024", "Terapi Kognitif-Perilaku",           "978-602-000-505-5", 2020, 294, "Erlangga",          new Penulis[]{p12, p3},
                        "Panduan praktis penerapan terapi kognitif perilaku untuk menangani gangguan kecemasan depresi dan masalah psikologis lainnya"),
                new Buku("BKU-025", "Manusia Mencari Makna",              "978-602-000-506-6", 1946, 165, "Noura Books",       new Penulis[]{p11},
                        "Kisah nyata Viktor Frankl bertahan hidup di kamp konsentrasi Nazi dan menemukan makna hidup di tengah penderitaan ekstrem"),
        };

        Buku[] bukuPolitik = {
                new Buku("BKU-026", "Dasar-Dasar Ilmu Politik",           "978-602-000-601-1", 2008, 368, "Gramedia Pustaka",  new Penulis[]{p13},
                        "Pengantar komprehensif ilmu politik mencakup konsep kekuasaan negara pemerintahan sistem politik dan hubungan internasional"),
                new Buku("BKU-027", "Demokrasi Indonesia",                "978-602-000-602-2", 2000, 286, "Pustaka Pelajar",   new Penulis[]{p13},
                        "Analisis perjalanan demokrasi Indonesia dari era orde lama hingga reformasi beserta tantangan dan prospek ke depannya"),
                new Buku("BKU-028", "Sistem Politik Indonesia",           "978-602-000-603-3", 2014, 412, "LP3ES",             new Penulis[]{p13, p14},
                        "Telaah mendalam tentang struktur dan dinamika sistem politik Indonesia pasca reformasi dari aspek kelembagaan dan aktor politik"),
                new Buku("BKU-029", "Reformasi Politik Indonesia 1998",   "978-602-000-605-5", 2003, 354, "Kompas",            new Penulis[]{p13, p7},
                        "Dokumentasi lengkap peristiwa reformasi 1998 yang mengakhiri rezim orde baru dan membuka babak baru demokrasi Indonesia"),
                new Buku("BKU-030", "Geopolitik Asia Tenggara",           "978-602-000-606-6", 2021, 298, "UI Press",          new Penulis[]{p14},
                        "Analisis dinamika geopolitik kawasan Asia Tenggara dalam konteks persaingan kekuatan global Amerika China dan negara lainnya"),
        };

        Buku[] bukuFiksi = {
                new Buku("BKU-031", "Laskar Pelangi",                     "978-602-000-701-1", 2005, 529, "Bentang Pustaka",   new Penulis[]{p15},
                        "Kisah haru sepuluh anak Belitung yang berjuang keras meraih pendidikan layak di sekolah sederhana penuh semangat dan harapan"),
                new Buku("BKU-032", "Supernova: Ksatria & Bintang Jatuh", "978-602-000-702-2", 2001, 352, "Truedee Books",     new Penulis[]{p16},
                        "Novel fiksi ilmiah karya Dee Lestari yang memadukan sains filsafat dan romansa dalam narasi yang unik dan memukau pembaca"),
                new Buku("BKU-033", "Bumi (Serial Bumi #1)",              "978-602-000-703-3", 2014, 440, "Gramedia Pustaka",  new Penulis[]{p17},
                        "Petualangan Raib seorang remaja yang memiliki kemampuan menghilang dan terseret ke dunia paralel yang penuh misteri"),
                new Buku("BKU-034", "Perahu Kertas",                      "978-602-000-705-5", 2009, 444, "Bentang Pustaka",   new Penulis[]{p16, p17},
                        "Kisah cinta dua anak muda Kugy dan Keenan yang terpisah oleh jarak dan waktu namun dipersatukan kembali oleh takdir"),
                new Buku("BKU-035", "Sang Pemimpi",                       "978-602-000-706-6", 2006, 292, "Bentang Pustaka",   new Penulis[]{p15},
                        "Kelanjutan kisah Andrea Hirata bersama sahabatnya yang bermimpi besar merantau ke Eropa demi menggapai cita cita tertinggi"),
        };

        Kategori[] semuaKategori = {
                new Kategori("KAT-001", "Teknologi", "Ilmu komputer, rekayasa perangkat lunak, dan inovasi digital", bukuTeknologi),
                new Kategori("KAT-002", "Filsafat",  "Pemikiran tentang eksistensi, pengetahuan, dan etika",        bukuFilsafat),
                new Kategori("KAT-003", "Sejarah",   "Rekam jejak peristiwa penting dari masa lalu",               bukuSejarah),
                new Kategori("KAT-004", "Agama",     "Kajian ajaran, nilai, dan spiritualitas",                     bukuAgama),
                new Kategori("KAT-005", "Psikologi", "Ilmu tentang perilaku, pikiran, dan emosi manusia",          bukuPsikologi),
                new Kategori("KAT-006", "Politik",   "Studi tentang kekuasaan, pemerintahan, dan demokrasi",       bukuPolitik),
                new Kategori("KAT-007", "Fiksi",     "Karya sastra imajinatif dari penulis ternama",               bukuFiksi),
        };

        Perpustakaan perpus = new Perpustakaan(
                "PERPUS-001", "Perpustakaan Kampus X",
                "Jl. Pendidikan No. 1, Kota X",
                1985, "Gedung A", "Lantai 2",
                semuaKategori
        );

        garis();
        System.out.println("   SISTEM INFORMASI PERPUSTAKAAN KAMPUS X");
        garis();

        System.out.println("\n[ DATA PERPUSTAKAAN ]");
        subGaris();
        perpus.tampilInfo();

        for (Kategori kat : perpus.kategori) {
            System.out.println();
            garis();
            System.out.println(" KATEGORI: " + kat.namaKategori.toUpperCase());
            garis();
            kat.tampilInfo();
            System.out.println();
            System.out.println("  [ DAFTAR BUKU ]");
            subGaris();
            kat.tampilDaftarBuku();
        }

        System.out.println();
        garis();
        System.out.println(" DEMO FITUR TAMBAHAN");
        garis();

        Buku b1 = bukuFiksi[0];
        Buku b2 = bukuFiksi[4];

        System.out.println("Jumlah kata sinopsis '" + b1.judul + "' : " + b1.hitungJumlahKata() + " kata");

        System.out.println("Kesamaan '" + b1.judul + "' dan '" + b2.judul + "' : " + b1.cekKesamaan(b2) + "%");

        Buku b3 = b1.copy();
        System.out.println("Hasil copy dari '" + b1.judul + "':");
        b3.tampilInfo();

        garis();
        System.out.println("  Selesai.");
        garis();
    }
}
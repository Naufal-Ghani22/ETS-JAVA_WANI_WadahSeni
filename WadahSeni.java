
// import java.util.*;

// class KaryaSeni {
//     protected String judul;
//     protected Artis artis;
//     protected double harga;

//     public KaryaSeni(String judul, Artis artis, double harga) {
//         this.judul = judul;
//         this.artis = artis;
//         this.harga = harga;
//     }

//     public double getHarga() {
//         return harga;
//     }

//     public String getJudul() {
//         return judul;
//     }

//     public Artis getArtis() {
//         return artis;
//     }

//     public String toString() {
//         return judul + " oleh " + artis.getNama() + " - Rp" + harga;
//     }
// }

// class Lukisan extends KaryaSeni {
//     private String teknik;

//     public Lukisan(String judul, Artis artis, double harga, String teknik) {
//         super(judul, artis, harga);
//         this.teknik = teknik;
//     }

//     @Override
//     public String toString() {
//         return "[Lukisan] " + super.toString() + " | Teknik: " + teknik;
//     }
// }

// class Patung extends KaryaSeni {
//     private String bahan;

//     public Patung(String judul, Artis artis, double harga, String bahan) {
//         super(judul, artis, harga);
//         this.bahan = bahan;
//     }

//     @Override
//     public String toString() {
//         return "[Patung] " + super.toString() + " | Bahan: " + bahan;
//     }
// }

// class Artis {
//     private String nama;

//     public Artis(String nama) {
//         this.nama = nama;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public String toString() {
//         return "Artis: " + nama;
//     }
// }



// class Pembeli {
//     private String nama;
//     private ArrayList<KaryaSeni> koleksi;

//     public Pembeli(String nama) {
//         this.nama = nama;
//         this.koleksi = new ArrayList<>();
//     }

//     public void beliKarya(KaryaSeni karya) {
//         koleksi.add(karya);
//     }

//     public double hitungTotal() {
//         double total = 0;
//         for (KaryaSeni k : koleksi) {
//             total += k.getHarga();
//         }
//         return total;
//     }

//     public void tampilkanKoleksi() {
//         System.out.println("Koleksi karya seni " + nama + ":");
//         for (KaryaSeni k : koleksi) {
//             System.out.println("- " + k.toString());
//         }
//     }

//     public String getNama() {
//         return nama;
//     }
// }

// class TransaksiSeni {
//     public static double applyDiskon(double total, double persen) {
//         if (persen < 0 || persen > 100) return total;
//         return total - (total * persen / 100);
//     }

//     public static void generateReceipt(Pembeli pembeli, double diskon) {
//         System.out.println("\n--- Receipt Transaksi ---");
//         pembeli.tampilkanKoleksi();
//         double total = pembeli.hitungTotal();
//         System.out.println("Total sebelum diskon: Rp" + total);
//         double afterDiskon = applyDiskon(total, diskon);
//         System.out.println("Total setelah diskon " + diskon + "%: Rp" + afterDiskon);
//         System.out.println("-------------------------\n");
//     }
// }


// public class WadahSeni {

//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//         ArrayList<KaryaSeni> daftarKarya = new ArrayList<>();

//         // Artis dan Karya Seni awal
//         Artis a1 = new Artis("Dewi Lestari");
//         Artis a2 = new Artis("Budi Santosa");

//         daftarKarya.add(new Lukisan("Senja Merah", a1, 1500000, "Akrilik"));
//         daftarKarya.add(new Patung("Rasa Sunyi", a2, 2000000, "Kayu Jati"));
//         daftarKarya.add(new Lukisan("Pagi di Desa", a2, 1000000, "Cat Minyak"));

//         System.out.print("Masukkan nama Anda: ");
//         String namaPembeli = sc.nextLine();
//         Pembeli pembeli = new Pembeli(namaPembeli);

//         int pilihan;
//         do {
//             System.out.println("\n--- Menu Galeri Seni Digital ---");
//             System.out.println("1. Lihat semua karya");
//             System.out.println("2. Beli karya seni");
//             System.out.println("3. Lihat koleksi pembeli");
//             System.out.println("4. Generate Receipt");
//             System.out.println("5. Cari karya berdasarkan judul");
//             System.out.println("6. Tambah karya seni baru");
//             System.out.println("0. Keluar");
//             System.out.print("Pilih menu: ");
//             pilihan = sc.nextInt();
//             sc.nextLine(); // konsumsi newline

//             switch (pilihan) {
//                 case 1:
//                     System.out.println("\nDaftar Karya Seni:");
//                     for (int i = 0; i < daftarKarya.size(); i++) {
//                         System.out.println((i + 1) + ". " + daftarKarya.get(i));
//                     }
//                     break;
//                 case 2:
//                     System.out.print("Masukkan nomor karya yang ingin dibeli: ");
//                     int no = sc.nextInt();
//                     if (no > 0 && no <= daftarKarya.size()) {
//                         pembeli.beliKarya(daftarKarya.get(no - 1));
//                         System.out.println("Karya berhasil ditambahkan ke koleksi.");
//                     } else {
//                         System.out.println("Nomor tidak valid.");
//                     }
//                     break;
//                 case 3:
//                     pembeli.tampilkanKoleksi();
//                     break;
//                 case 4:
//                     System.out.print("Masukkan persen diskon (0-100): ");
//                     double diskon = sc.nextDouble();
//                     TransaksiSeni.generateReceipt(pembeli, diskon);
//                     break;
//                 case 5:
//                     System.out.print("Masukkan kata kunci judul: ");
//                     String keyword = sc.nextLine().toLowerCase();
//                     System.out.println("Hasil pencarian:");
//                     for (KaryaSeni k : daftarKarya) {
//                         if (k.getJudul().toLowerCase().contains(keyword)) {
//                             System.out.println("- " + k);
//                         }
//                     }
//                     break;
//                 case 6:
//                     System.out.println("Jenis karya seni yang ingin ditambahkan:");
//                     System.out.println("1. Lukisan");
//                     System.out.println("2. Patung");
//                     System.out.print("Pilih: ");
//                     int jenis = sc.nextInt();
//                     sc.nextLine(); // konsumsi newline

//                     System.out.print("Judul: ");
//                     String judul = sc.nextLine();

//                     System.out.print("Nama artis: ");
//                     String namaArtis = sc.nextLine();
//                     Artis artisBaru = new Artis(namaArtis);

//                     // Validasi harga
//                     double harga = -1;
//                     while (harga <= 0) {
//                         System.out.print("Harga (harus lebih dari 0): ");
//                         if (sc.hasNextDouble()) {
//                             harga = sc.nextDouble();
//                             sc.nextLine(); // konsumsi newline
//                             if (harga <= 0) {
//                                 System.out.println("⚠️  Harga harus lebih dari 0. Coba lagi.");
//                             }
//                         } else {
//                             System.out.println("⚠️  Input tidak valid. Masukkan angka.");
//                             sc.next(); // skip input salah
//                         }
//                     }

//                     if (jenis == 1) {
//                         System.out.print("Teknik lukisan: ");
//                         String teknik = sc.nextLine();
//                         Lukisan lukisanBaru = new Lukisan(judul, artisBaru, harga, teknik);
//                         daftarKarya.add(lukisanBaru);
//                         System.out.println("Lukisan berhasil ditambahkan.");
//                     } else if (jenis == 2) {
//                         System.out.print("Bahan patung: ");
//                         String bahan = sc.nextLine();
//                         Patung patungBaru = new Patung(judul, artisBaru, harga, bahan);
//                         daftarKarya.add(patungBaru);
//                         System.out.println("Patung berhasil ditambahkan.");
//                     } else {
//                         System.out.println("Pilihan tidak valid!");
//                     }
//                     break;

//                 case 0:
//                     System.out.println("Terima kasih telah menggunakan Galeri Seni Digital.");
//                     break;
//                 default:
//                     System.out.println("Pilihan tidak valid!");
//             }

//         } while (pilihan != 0);
//         sc.close(); 
//     }
    
// }

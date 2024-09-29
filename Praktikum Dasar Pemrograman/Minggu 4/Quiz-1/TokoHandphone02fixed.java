/* 
 * Nama  : ARDHAN DIKRI ACHMAD FAHRUDIN
 * NIM   : 244107020012
 * KELAS : TI-1F
 * QUIZ  : 1 (Satu)
 */


 import java.util.Scanner;

 public class TokoHandphone02fixed {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         double hargaJual, hargaBeli, biayaPengemasan, biayaPengiriman, diskon;
         double keuntunganPerItem, jumlahItemKeuntunganHp,jumlahItemKeuntunganEarphone, jumlahItemKeuntunganKabel, keuntunganProdukHP, keuntunganProdukKabel, keuntunganProdukEarphone;
         int jumlahPenjualan, resiko;
 
         System.out.println("================================================");
         System.out.print("======== SELAMAT DATANG DI TOKO ARTECH =========\n");
         System.out.println("================================================");
         System.out.print("masukkan jumlah HP terjual: ");
         jumlahPenjualan = sc.nextInt();
         System.out.print("masukkan harga beli HP: Rp.");
         hargaBeli = sc.nextDouble();
         System.out.print("masukkan harga jual HP: Rp.");
         hargaJual = sc.nextDouble();
         System.out.print("masukkan diskon dalam bentuk Rupiah : Rp.");
         diskon = sc.nextDouble();
         System.out.print("masukkan resiko kerusakan dalam persen [0-100]: ");
         resiko = sc.nextInt();
         System.out.print("Masukkan Biaya Pengemasan: Rp.");
         biayaPengemasan = sc.nextDouble();
         System.out.print("Masukkan Biaya Pengiriman: Rp.");
         biayaPengiriman = sc.nextDouble();
         System.out.println("\n==============================================");
 
         //perhitungan
         keuntunganPerItem = hargaJual - hargaBeli - biayaPengemasan - biayaPengiriman - diskon;
         jumlahItemKeuntunganHp = jumlahPenjualan - ((resiko/100)*jumlahPenjualan);
         keuntunganProdukHP = keuntunganPerItem * jumlahItemKeuntunganHp;
         // Output keuntungan HP
         System.out.printf("Keuntungan yang didapat dari pejualan HP: Rp.%s", keuntunganPerItem);
         System.out.println("\n==============================================");
 
         System.out.println("\n==============================================");
         System.out.print("masukkan jumlah Kabel terjual: ");
         jumlahPenjualan = sc.nextInt();
         System.out.print("masukkan harga beli Kabel: Rp.");
         hargaBeli = sc.nextDouble();
         System.out.print("masukkan harga jual Kabel: Rp.");
         hargaJual = sc.nextDouble();
         System.out.print("masukkan diskon dalam bentuk Rupiah : Rp.");
         diskon = sc.nextDouble();
         System.out.print("masukkan resiko kerusakan dalam persen [0-100]: ");
         resiko = sc.nextInt();
         System.out.print("Masukkan Biaya Pengemasan: Rp.");
         biayaPengemasan = sc.nextDouble();
         System.out.print("Masukkan Biaya Pengiriman: Rp.");
         biayaPengiriman = sc.nextDouble();
         System.out.println("\n==============================================");
 
         //perhitungan
         keuntunganPerItem = hargaJual - hargaBeli - biayaPengemasan - biayaPengiriman - diskon;
         jumlahItemKeuntunganKabel = jumlahPenjualan - ((resiko/100)*jumlahPenjualan);
         keuntunganProdukKabel = keuntunganPerItem * jumlahItemKeuntunganKabel;
         // Output keuntungan HP
         System.out.printf("Keuntungan yang didapat dari pejualan KABEL : Rp.%s", keuntunganPerItem);
         System.out.println("\n==============================================");
 
         
         System.out.println("\n==============================================");
         System.out.print("masukkan jumlah Earphone terjual: ");
         jumlahPenjualan = sc.nextInt();
         System.out.print("masukkan harga beli Earphone: Rp.");
         hargaBeli = sc.nextDouble();
         System.out.print("masukkan harga jual Earphone: Rp.");
         hargaJual = sc.nextDouble();
         System.out.print("masukkan diskon dalam bentuk Rupiah : Rp.");
         diskon = sc.nextDouble();
         System.out.print("masukkan resiko kerusakan dalam persen [0-100]: ");
         resiko = sc.nextInt();
         System.out.print("Masukkan Biaya Pengemasan: Rp.");
         biayaPengemasan = sc.nextDouble();
         System.out.print("Masukkan Biaya Pengiriman: Rp.");
         biayaPengiriman = sc.nextDouble();
         System.out.println("\n==============================================");
 
         //perhitungan
         keuntunganPerItem = hargaJual - hargaBeli - biayaPengemasan - biayaPengiriman - diskon;
         jumlahItemKeuntunganEarphone = jumlahPenjualan - ((resiko/100)*jumlahPenjualan);
         keuntunganProdukEarphone = keuntunganPerItem * jumlahItemKeuntunganEarphone;
         // Output keuntungan HP
         System.out.printf("Keuntungan yang didapat dari pejualan Earphone : Rp.%s", keuntunganPerItem);
         System.out.println("\n==============================================");
 
         System.out.print("========= INPUT TARGET KEUNTUNGAN =============");
         System.out.println("\n======================================================");
         System.out.print("Masukkan target keuntungan yang anda inginkan: Rp.");
         double targetKeuntungan = sc.nextDouble();
         System.out.println("======================================================");
         
         // perhitungan
         double totalKeuntungan = keuntunganProdukHP + keuntunganProdukKabel + keuntunganProdukEarphone;
         double rataRataKeuntungan = totalKeuntungan / (jumlahItemKeuntunganHp + jumlahItemKeuntunganEarphone + jumlahItemKeuntunganKabel);
         float prosentaseKeuntungan = (float)(totalKeuntungan / targetKeuntungan) * 100/100;
 
         // output 
         System.out.printf("Keuntungan Penjualan HP: Rp.%s,Keuntungan Penjualan Kabel: Rp.%s, Keuntungan Penjualan Earphone: Rp.%s", keuntunganProdukHP, keuntunganProdukKabel, keuntunganProdukEarphone);
         System.out.printf("\nTotal Keuntungan dari semua produk: Rp.%s", totalKeuntungan);
         System.out.printf("\nrata-rata Keuntungan Semua Produk: Rp.%s", (float)rataRataKeuntungan);
         System.out.printf("\nProsentase Keuntungan: %s %%", prosentaseKeuntungan);
     
         sc.close();
     }
 }
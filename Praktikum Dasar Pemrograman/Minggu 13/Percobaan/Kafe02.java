import java.util.Scanner;

public class Kafe02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("\t\tKAFE 02");
        System.out.println("--------------------------------------");
        String namaPelanggan = "Ardhan", kodePromo = "DISKON50";
        boolean isMember = true, kondisi = true;
        int totalHarga = 0;
        int[] jumlahPesanan = new int[6]; // Array jumlah pesanan diset 6 karena max pilihan pesanan hanya 6 menu

        daftarPengunjung("Ali","Budi","Citra");

        Menu(namaPelanggan,kodePromo, isMember);
        
        while(kondisi){
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            if(pilihanMenu < 1 || pilihanMenu > 6){
                System.out.println("Menu yang anda pilih tidak valid! pilih menu 1-6");
                continue;
            }
            
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            jumlahPesanan[pilihanMenu-1] += banyakItem;

            totalHarga += hitungTotalHarga02(pilihanMenu, banyakItem, kodePromo, isMember);
            System.out.print("Apakah anda ingin pesan lagi (true/false): ");
            kondisi = sc.nextBoolean();
        }

       
        tampilPesanan(jumlahPesanan);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
        sc.close();
    }

    public static int hitungTotalHarga02(int pilihanMenu,int banyakItem, String kodePromo, boolean isMember){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = 0; 
        
        hargaTotal += hargaItems[pilihanMenu - 1] * banyakItem;

        if(isMember == true){
            hargaTotal *= 0.9;
        } 
        
        if(kodePromo.equalsIgnoreCase("diskon50")){
            hargaTotal*= 0.5;
        }else if(kodePromo.equalsIgnoreCase("diskon30")){
            hargaTotal*= 0.7;
        }
        
        return hargaTotal;
    }

    public static void Menu(String namaPelanggan, String kodePromo, boolean isMember){
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if(isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if(kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.printf("Anda mendapatkan diskon 50%% menggunakan kupon %s\n", kodePromo);
        }else if(kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.printf("Anda mendapatkan diskon 30%% menggunakan kupon %s\n", kodePromo);
        }else{
            System.out.println("Kode invalid");
        }
        System.out.println("------- MENU RESTO KAFE -------");
        System.out.println("1. Kopi Hitam - Rp. 15,000");
        System.out.println("2. Cappucino - Rp. 20,000");
        System.out.println("3. Latte - Rp. 22,000");
        System.out.println("4. Teh Tarik - Rp. 12,000");
        System.out.println("5. Roti Bakar - Rp. 10,000");
        System.out.println("6. Mie Goreng - Rp. 18,000");
        System.out.println("--------------------------------");
        System.out.print("Silahkan pilih menu yang Anda inginkan.");
    }

    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar Nama pengunjung");
        for(String pengunjung : namaPengunjung){
            System.out.println("- " + pengunjung);
        }
    }

    public static void tampilPesanan(int[] jumlahPesanan){
        String menu[] = {"Kopi Hitam", "Cappucino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};
        int no = 0;
        System.out.println("\n--------- Rincian Pesanan ----------");
        for(int i = 0; i < jumlahPesanan.length; i++){
            if(jumlahPesanan[i] > 0){
                System.out.printf("\s%s. %s - %s Item\n", no+1, menu[i], jumlahPesanan[i]);
                no++;
            }
        }
        System.out.println("------------------------------------");
    }
}
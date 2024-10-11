import java.util.Scanner;

public class KafeDoWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        // Deklarasi
        int roti, kopi, teh, totalHarga;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;
        
        // Decision
        do {
            System.out.print("Masuukan nama pelanggan (Ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.next();
            if(namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();


            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.printf("Total yang harus dibayar: Rp.%s\n", totalHarga);
        } while(false);
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
    
}

import java.util.Scanner;

public class PenjualanTiketBioskop02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        // Deklarasi
        double hargaTiket = 50_000, totalHarga=0, diskon;
        int totalTiket, totalKeseluruhanTiket=100;

        do{
            
            System.out.print("Input total tiket beli: ");
            totalTiket = input02.nextInt();

            if(totalTiket < 0){
                System.out.println("Input Tiket Tidak Valid, Masukkan lagi");
                continue;
            }

            // Hitung sisa tiket
            totalKeseluruhanTiket-=totalTiket;

            if(totalKeseluruhanTiket < 1){
                System.out.println("Tiket Habis!!!, Pembelian telah mencapai (100 Tiket)");
                break;
            }else{
                System.out.printf("Sisa Tiket Harian: %s\n",totalKeseluruhanTiket);
                if(totalTiket >= 4){
                    diskon = (hargaTiket*totalTiket)*0.1;
                    totalHarga = (hargaTiket*totalTiket)-diskon;
                }else if(totalTiket >= 10){
                    diskon = (hargaTiket*totalTiket)*0.15;
                    totalHarga = (hargaTiket*totalTiket)-diskon;
                }else{
                    totalHarga = hargaTiket * totalTiket;
                }
                System.out.printf("Harga yang harus anda bayar: %s\n", totalHarga);
                // continue;
            }
           
        }while(totalKeseluruhanTiket >= 0);
        input02.close();
    }    
}

import java.util.Scanner;

public class Pemilihan2Percobaan202 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
    
        // Deklarasi
        String member, qris;
        int jumlah_beli=1, pilihan; 
        double diskonQris=1000,diskon=0, total_bayar=0, harga=0;

        System.out.println("================================================");
        System.out.println("================ MENU KAFE JTI =================");
        System.out.println("================================================");
        System.out.println("\s\s1. Ricebowl \n\s\s2. Ice Tea\n\s\s3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("================================================");
        System.out.print("\s\sMasukkan angka pilihan anda [1-3] : ");
        pilihan = input02.nextInt();
        System.out.print("\s\sMasukkan jumlah yang ingin beli: ");
        jumlah_beli = input02.nextInt();
        input02.nextLine();
        System.out.print("\s\sApakah anda menggunakan QRIS (y/n): ");
        qris = input02.nextLine();
        System.out.print("\s\sApakah anda punya member (y/n): ");
        member = input02.nextLine();
        System.out.println("\n================================================");
        System.out.println("=============== BILL PEMBAYARAN ================");
        System.out.println("================================================");

        
        if(member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besaran diskon = 10%");
            if(pilihan == 1){
                harga = 14000;
                System.out.printf("Harga Ricebowl = Rp.%s\n", harga);
            } else if(pilihan == 2){
                harga = 3000;
                System.out.printf("Harga Ice Tea = Rp.%s\n", harga);
            } else if(pilihan == 3){
                harga = 15000;
                System.out.printf("Harga Bundeling = Rp.%s\n", harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar\n");
                input02.close();
                return;
            }

            diskon *= (harga*jumlah_beli);
            total_bayar = (harga*jumlah_beli) - diskon;

            switch (qris.toLowerCase()) {
                case "y":
                    System.out.printf("Total Bayar sebelum dipotong diskon QRIS = Rp.%s\n", total_bayar);
                    total_bayar-=diskonQris;
                    System.out.printf("Total bayar setelah diskon = Rp.%s\n", total_bayar);
                    break;
                case "n":
                    System.out.printf("Total bayar setelah diskon = Rp.%s\n", total_bayar);
                    break;
                default:
                    System.out.println("Masukkan input yang benar");
                    input02.close();
                    return;
            }
           

        } else if(member.equalsIgnoreCase("n")) {
            if(pilihan == 1){
                harga = 14000;
                System.out.printf("Harga Ricebowl = Rp.%s\n", harga);
            } else if(pilihan == 2){
                harga = 3000;
                System.out.printf("Harga Ice Tea = Rp.%s\n", harga);
            } else if(pilihan == 3){
                harga = 15000;
                System.out.printf("Harga Bundeling = Rp.%s\n", harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar\n");
                input02.close();
                return;
            } 

            total_bayar = harga*jumlah_beli;
            
            switch (qris.toLowerCase()) {
                case "y":
                    System.out.printf("Total Bayar sebelum dipotong diskon QRIS = Rp.%s\n", total_bayar);
                    total_bayar-=diskonQris;
                    System.out.printf("Total Bayar = Rp.%s", total_bayar);
                    break;
                case "n":
                    System.out.printf("Total bayar = Rp.%s\n", total_bayar);
                    break;
                default:
                    System.out.println("Masukkan input yang benar");
                    input02.close();
                    return;
            }
        
        }else{
            System.out.println("Member Tidak Valid!!!");
        }
        
        System.out.println("================================================");
        input02.close();
    }
}
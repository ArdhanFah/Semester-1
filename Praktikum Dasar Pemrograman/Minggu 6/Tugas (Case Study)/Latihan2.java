import java.util.Scanner;

public class Latihan2{
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        //Deklarasi
        int hari, jumlah_beli=1;
        float diskon, harga = 0, total_bayar;
        String buku;

        // Input
        System.out.println("=======================================================");
        System.out.println("=================== TOKO BUKU JTI =====================");
        System.out.println("=======================================================");
        System.out.print("Pilih Buku: \n\s\s * kamus \n\s\s * novel \n\s\s * Buku lain\n");
        System.out.print("Masukkan kategori buku yang anda pilih: ");
        buku = input02.nextLine();
        System.out.print("Pilih hari dimana anda beli: \n\s\s 1.Senin \n\s\s 2.Selasa \n\s\s 3.Rabu \n\s\s 4.Kamis \n\s\s 5.Jum'at \n\s\s 6.Sabtu \n\s\s 7.Minggu ");
        System.out.print("\nMasukkan Pilihan anda: ");
        hari = input02.nextInt();
        System.out.printf("Masukkan harga %s: ", buku);
        harga = input02.nextFloat();
        System.out.print("Masukkan jumlah buku yang anda beli: ");
        jumlah_beli = input02.nextInt();

        
        // Proses 
        harga*=jumlah_beli; 
        // Decision
        switch (hari) {
            case 3:
                if(buku.equalsIgnoreCase("kamus")){
                    if(jumlah_beli > 2){
                        diskon = (harga * 0.12f);
                        total_bayar = harga - diskon;      
                    }else{
                        diskon = (harga * 0.1f);
                        total_bayar = harga - diskon; 
                    }
                }else if(buku.equalsIgnoreCase("novel")){
                    if(jumlah_beli > 3){
                        diskon = (harga * 0.09f);
                        total_bayar = harga - diskon;
                    }else{
                        diskon = (harga * 0.08f);
                        total_bayar = harga - diskon;
                    }
                }else{
                    if(jumlah_beli > 3){
                        diskon = (harga * 0.05f);
                        total_bayar = harga - diskon;
                    }else{
                        total_bayar = harga;
                    }
                }
            break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
                total_bayar = harga;
                break;
            default:
                System.out.println("Input hari anda salah, tolong masukan input hari yang benar");
                input02.close();
                return;
        }
 

        System.out.println("=========================================================");
        System.out.printf("Total yang harus anda bayar untuk %s dengan jumlah %s adalah: Rp.%s\n", buku, jumlah_beli, total_bayar);
        System.out.println("=========================================================");

        input02.close();
    }
}
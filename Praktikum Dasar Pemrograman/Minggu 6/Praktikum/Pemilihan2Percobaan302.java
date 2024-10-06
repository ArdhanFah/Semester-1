import java.util.Scanner;

public class Pemilihan2Percobaan302 {
   public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        // Dekakrasi
        String kategori;
        int penghasilan, gajiBersih;
        double pajak;

        // Input
        System.out.println("Pilih Ketgori: \n\s\s - Pebisnis \n\s\s - Pekerja");
        System.out.print("Masukkan pilihan anda: ");
        kategori = input02.nextLine();
        System.out.print("Masukkan Besaran Penghasilan: ");
        penghasilan = input02.nextInt();

        // Decision
        if(kategori.toLowerCase().equals("pekerja"))            // Solusi jika ingin tetap menggunakan .equals()
            if(penghasilan <= 2_000_000){
                pajak = 0.1;
            }else if(penghasilan <=3_000_000){
                pajak = 0.15;
            }else{
                pajak = 2;
            }
        else if(kategori.toLowerCase().equals("pebisnis"))      // Solusi jika ingin tetap menggunakan .equals()
            if(penghasilan <= 2_500_000){
                pajak = 0.15;
            }else if(penghasilan <= 3_500_000){
                pajak = 0.2;
            }else{
                pajak = 0.25;
            }
        else{
            System.out.println("Masukan kategori salah");
            input02.close();
            return;
        }    

        // Perhitungan atau Proses
        pajak*=penghasilan;
        gajiBersih = penghasilan - (int)pajak;

        System.out.printf("Total Gaji yang anda terima setelah pajak: Rp.%s", gajiBersih);

        input02.close();
   } 
}

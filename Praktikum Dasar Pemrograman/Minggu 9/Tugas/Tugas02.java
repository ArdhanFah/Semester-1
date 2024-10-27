package Tugas;
import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int atlet = 5, jmlCabor = 4;
        String namaAtlet, cabor, daftarhasil="";

        for(int i = 1; i <= jmlCabor; i++){
            System.out.print("Pilihan Cabor:\n\s* Badminton\n\s* Tenis Meja\n\s* Basket\n\s* Bola Voly\nMasukkan pilihan anda: ");
            cabor = sc.nextLine();

            String daftarNama="";

            for(int j = 1; j <= atlet; j++){
                System.out.printf("\nMasukkan nama atlet-%s: ", j);
                namaAtlet = sc.nextLine();

                daftarNama += "\s" + j + "." + namaAtlet + "\n";
            }
           
            System.out.println("\nCabang Olahraga " + cabor);
            System.out.print(daftarNama);
            System.out.println();

            daftarhasil += "\nCabang Olahraga " + cabor + "\n" + daftarNama;
        }
        System.out.println("======================================");
        System.out.println("\sSemua Daftar Atlet di Semua Cabor");
        System.out.println("======================================");
        System.out.print(daftarhasil);
        sc.close();
    }
}

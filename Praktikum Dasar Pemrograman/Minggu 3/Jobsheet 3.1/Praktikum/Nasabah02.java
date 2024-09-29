package Praktikum;

import java.util.Scanner;
public class Nasabah02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi
        double jml_tabungan_akhir, bunga, prosentase_bunga = 0.02;
        int lama_menabung = 5, jml_tabungan_awal; 

        // Input 
        System.out.println("======================================================");
        System.out.println("============ HITUNG BUNGA SALDO NASABAH ==============");
        System.out.println("======================================================");
        System.out.print("\s\sMasukkan jumlah tabungan awal: ");
        jml_tabungan_awal = input.nextInt();
        System.out.print("\s\sMasukkan lama menabung anda: ");
        lama_menabung = input.nextInt();
        System.out.println("======================================================");

        // Hitung 
        bunga = prosentase_bunga*jml_tabungan_awal*lama_menabung;
        jml_tabungan_akhir = bunga+jml_tabungan_awal;

        // Output
        System.out.println("\s\sBunga adalah " + bunga);
        System.out.println("\s\sJumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
        System.out.println("======================================================");

        input.close();
    }
}

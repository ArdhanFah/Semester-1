import java.util.Scanner;

public class Cafe02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        int jmlPesanan;
        float total = 0;
        System.out.print("Masukkan jumlah pesanana anda: ");
        jmlPesanan = input02.nextInt();

        float[] harga = new float[jmlPesanan];
        String[] menu  = new String[jmlPesanan];

        for(int i = 0; i < jmlPesanan; i++){
            input02.nextLine();
            System.out.printf("Masukkan menu %s yang anda pesan: ", i+1);
            menu[i] = input02.nextLine();
            System.out.print("Masukkan harganya: Rp.");
            harga[i] = input02.nextFloat();

            total += harga[i];
        }

        System.out.println("--------------------------------------");
        System.out.println("\tDaftar Pesanan");
        System.out.println("--------------------------------------");
        for(String daftarMenu : menu){
            System.out.println(daftarMenu);
        }
        System.out.println("--------------------------------------");
        System.out.printf("Total harga: %s\n", total);

        input02.close();
    }
}

import java.util.Scanner;
 
public class Kafe02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargatTeh = 7000.0, hargaRoti = 20000.0, nominalBayar, totalHarga;
        float diskon = 10/100;

        System.out.print("Masukkan keanggotaan (true/false) : ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh + hargatTeh) + (jmlRoti + hargaRoti); 
        nominalBayar = totalHarga - (diskon * totalHarga);
        int nominalInt = (int) nominalBayar;
        byte totalByte = (byte) totalHarga;
        System.out.println("Ini adalah hasil casting totalHarga ke Byte: " + totalByte);
        System.out.println("Ini adalah hasil casting nominalBayar ke int: " + nominalInt);
        System.out.println("Keanggotaan pelanggan:" + keanggotaan);
        System.out.println("Item pembelian \n" + jmlKopi + " Kopi," + jmlTeh + " teh," + jmlRoti + " Roti" );
        System.out.println("Nominal bayar Rp " + nominalBayar);
        
        input.close();
    }
}
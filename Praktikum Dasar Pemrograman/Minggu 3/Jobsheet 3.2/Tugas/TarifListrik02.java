import java.util.Scanner;

public class TarifListrik02 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean cekStatus;
        double tagihanListrik,pemakaianKwh, hargaKwh=1500, batasKwh=500;
        
        System.out.print("Masukkan pemakaian kWh anda: ");
        pemakaianKwh = input.nextDouble();
    
        tagihanListrik = pemakaianKwh * hargaKwh;

        cekStatus = pemakaianKwh > batasKwh;
        
        System.out.println("------------------------------------------------------");
        System.out.println("-------------- CEK TAGIHAN LISTRIK PLN ---------------");
        System.out.println("------------------------------------------------------");
        System.out.println("Tagihan listrik anda adalah Rp." + tagihanListrik);
        System.out.println("Jumalah pemakaian Listrik: "+ pemakaianKwh);
        System.out.println("Pemakaian listrik anda melebihi 500kWh: " + cekStatus);
        System.out.println("------------------------------------------------------");

        input.close();
    }
}
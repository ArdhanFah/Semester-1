import java.util.Scanner;

public class Pemilihan2Percobaan102 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        // Deklarasi
        int tahun;

        // Input
        System.out.print("Masukkan tahun: ");
        tahun = input02.nextInt();

        // Decision IF bertingkat
        if((tahun%4)==0){
            if((tahun%100!=0))
                System.out.println("Tahun Kabisat");         
            else 
                if(tahun%400==0)
                    System.out.println("Tahun Kabisat");   
                else
                    System.out.printf("Tahun %s Bukan tahun kabisat", tahun);
        }else
            System.out.println("Bukan tahun kabisat");

        input02.close();
    }
}

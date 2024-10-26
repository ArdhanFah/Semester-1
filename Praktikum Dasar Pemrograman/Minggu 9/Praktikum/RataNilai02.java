package Praktikum;
import java.util.Scanner;

public class RataNilai02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi
        int i = 1, j;
        float nilai, totalNilai, rataNilai;
        
        while(i <= 5){
            totalNilai = 0;
            System.out.printf("\nInput nilai mahasiswa ke %s\n", i);
            for(j = 1; j <= 5; j++){
                System.out.printf("Masukkan nilai ke-%s: ", j);
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.printf("Rata-rata nilai mahasiswa ke %s adalah %s",i, rataNilai);
            i++;
            // break;
        }
    }
}
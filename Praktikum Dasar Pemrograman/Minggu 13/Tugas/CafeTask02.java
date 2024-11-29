package Tugas;
import java.util.Scanner;

public class CafeTask02 {
    public static void main(String[] args) {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

        int[][] dataPenjualan = new int[menu.length][7];

        inputData(dataPenjualan, menu);
        System.out.println();
        tampilData(dataPenjualan, menu);
        penjualanTertinggi(dataPenjualan, menu);
        rataRata(dataPenjualan, menu);
    }

    public static void inputData(int [][]dataPenjualan, String[] menu){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < dataPenjualan[0].length; i++){
            System.out.println("--------------------------");
            System.out.printf("\tHari ke-%s\n", i+1);
            System.out.println("--------------------------");
            for(int j = 0; j < dataPenjualan.length; j++){
                System.out.printf("Penjualan %s: ", menu[j]);
                dataPenjualan[j][i] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void tampilData(int[][] dataPenjualan, String[] menu){
        System.out.printf("%-15s", ""); 
        for(int i = 0; i < dataPenjualan[0].length; i++){
            System.out.printf("%-15s","Hari ke-" + (i+1));
        }
        System.out.println();
        
        for(int i = 0; i < dataPenjualan.length; i++){
            System.out.printf("%-15s", menu[i]);
            for(int j = 0; j < dataPenjualan[i].length; j++){
                System.out.printf("%-15s", dataPenjualan[i][j]);
            }
            System.out.println();
        }
    }

    public static void penjualanTertinggi(int[][] dataPenjualan, String menu[]){
        int max = 0;
        int index = -1;
        for(int i = 0; i < dataPenjualan.length; i++){
            int total = 0;
            for(int j = 0; j < dataPenjualan[i].length; j++){
                total += dataPenjualan[i][j];
            }
            if (total > max) { 
                max = total;
                index = i; 
            }
        }
        System.out.println();
            if(index != -1){
                System.out.printf("Penjualan tertinggi terdapat pada menu %s dengan jumlah penjulan %s", menu[index],max);
        }
    }
    
    public static void rataRata(int[][] dataPenjualan, String[] menu){
        System.out.println();
        for(int i = 0; i < dataPenjualan.length; i++){
            double total = 0;
            for(int j = 0; j < dataPenjualan[i].length; j++){
                total += dataPenjualan[i][j];
            }
            total = (double) total / dataPenjualan[i].length;
            System.out.printf("Rata-rata penjualan %s: %.2f\n", menu[i], total);
        }
    }
}

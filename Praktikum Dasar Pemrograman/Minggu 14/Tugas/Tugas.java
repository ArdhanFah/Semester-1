package Tugas;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah angka yang ingin dihitung(N): ");
        int count = sc.nextInt();
    
        int[] n = new int[count];

        for(int i = count ; i >= 1; i--){
            System.out.printf("Masukkan angka ke-%d: ", i);
            n[i-1] = sc.nextInt();            
        }

        System.out.printf("Total dari %d angka yang dimasukkan adalah: %d (Fungsi Iteratif)\n", count, fungsiIteratif(n, count));
        System.out.printf("Total dari %d angka yang dimasukkan adalah: %d (Fungsi Rekursif)\n", count, fungsiRekursif(n, count));
        sc.close();
    }

    // Fungsi Iteratif
    static int fungsiIteratif(int[] n,int count){
        int total = 0;
        for(int i = 0; i < n.length; i++){
            total += n[i];
        }
        return total;
    }

    // Fungsi Rekursif
    static int fungsiRekursif(int[] n, int count){
        if(count == 0){
            return 0;
        }else{
            return (n[count-1] + fungsiRekursif(n, count - 1));
        }
    }
}

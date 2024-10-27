package Tugas;
import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Nilai N: ");
    int n = sc.nextInt();
    
    if(n < 3){
        System.out.println("masukkan nilai diatas sama dengan 3");
        sc.close();
        return;
    }else if(n >= 10){
        System.out.println("Input anda lebih dari sama dengan 10\nMasukkan input yang valid [3-9]");
        sc.close();
        return;
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(i == 0 || j == 0 || i == n - 1 || j == n -1){
                System.out.print(n);
            }else{
                System.out.print("\s");
            }
        }
        System.out.println();
    }
    sc.close();
    }
}

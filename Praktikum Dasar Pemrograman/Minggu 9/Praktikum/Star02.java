package Praktikum;
import java.util.Scanner;

public class Star02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;

        System.out.print("Masukkan nilai N:");
        n = sc.nextInt();
         
        for(i = 1; i > n; i++){
            System.out.print("*");
            sc.close(); 
        }       
    }

}
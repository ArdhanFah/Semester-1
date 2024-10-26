package Praktikum;
import java.util.Scanner;
public class Triangle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i=0, n, j;

        System.out.print("Masukkan nilai N:");
        n = sc.nextInt();

        while(i <= n){
            j = 0;
            while(j < i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
            sc.close();
        }
        System.out.println();
    }
}

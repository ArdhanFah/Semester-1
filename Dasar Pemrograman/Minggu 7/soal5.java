import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        
        int angka = 3, selisih = 1;
        int i,n;
  
        System.out.print("Masukkan batas bilangan N: ");
        n = input02.nextInt();
        
        System.out.println(angka);
        for(i = 1;i < n;i++){
            angka+=selisih;
            System.out.println(angka);
            selisih+=2;
            input02.close();
        }
            
    }
}

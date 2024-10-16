import java.util.Scanner;

public class soal8 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        int bil1, bil2, i, hasil=0;

        System.out.print("Masukkan bilangan 1: ");
        bil1 = input02.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = input02.nextInt();
  
        for(i = 1; i <= bil1; i++){
            hasil += bil2;
            System.out.println(hasil);
            input02.close();
        }
    }
}

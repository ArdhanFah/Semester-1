import java.util.Scanner;

public class soal1 {
    
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        int i, n;

        System.out.print("Masukkan nilai N: ");
        n = input02.nextInt();

        for(i = n; i >= 1; i--){
            System.out.println(i);
            input02.close();
        }
    }

}
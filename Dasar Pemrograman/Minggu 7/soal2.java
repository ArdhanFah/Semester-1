import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i, n, jumlah=0;

        System.out.print("Input nilai N: ");
        n = in.nextInt();

        for(i = 1; i <= n; i++){
            jumlah += i;
            System.out.println("output: " + jumlah);
            in.close();
        }
    }

    
}

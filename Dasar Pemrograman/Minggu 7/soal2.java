import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        int i, n, kali=1;

        System.out.print("Input nilai N: ");
        n = input02.nextInt();

        for(i = 1; i <= n; i++){
            kali *= i;
            System.out.println("hasil: " + kali);
            input02.close();
        }
    }

    
}

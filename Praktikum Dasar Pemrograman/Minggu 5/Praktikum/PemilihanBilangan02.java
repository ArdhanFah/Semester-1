import java.util.Scanner;

public class PemilihanBilangan02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = in.nextInt();

        String tenary = (angka % 2 == 0) ? "genap" :  "ganjil";
        System.out.printf("Angka %s termasuk bilangan %s",angka, tenary);
  
        in.close();
    }
}



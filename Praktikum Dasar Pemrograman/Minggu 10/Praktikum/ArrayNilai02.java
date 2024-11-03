import java.util.Scanner;

public class ArrayNilai02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        
        int[] nilaiAkhir = new int[10];

        for(int i = 0; i < nilaiAkhir.length; i++){
            System.out.printf("Masukkan nilai akhir ke-%s: ", i+1);
            nilaiAkhir[i] = input02.nextInt();
        }
        for(int i = 0; i < 10; i++){
            if(nilaiAkhir[i] > 70){
                System.out.printf("Mahasiswa ke-%s lulus\n", i+1);
            }else{
                System.out.printf("Mahasiswa ke-%s tidak lulus!\n", i+1);
            }
        }
        input02.close();
    }
}

import java.util.Scanner;

public class Nilai02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        int jumlahMhs, jumlahNilai = 0, rata, nilMax=0, nilMin=0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMhs = input02.nextInt();

        int[] nilai = new int[jumlahMhs];

        System.out.printf("Masukkan nilai mahasiswa ke-1: ");
        nilai[0] = input02.nextInt();
        jumlahNilai += nilai[0];

        nilMax = nilai[0];
        nilMin = nilai[0];
        for(int i = 1; i < jumlahMhs; i++){
            System.out.printf("Masukkan nilai mahasiswa ke-%s: ", (i+1));
            nilai[i] = input02.nextInt();
            jumlahNilai += nilai[i];

            if(nilai[i] < nilMin){
                nilMin = nilai[i];
            }
            if(nilai[i] > nilMax){
                nilMax = nilai[i];
            }
        }

        rata = jumlahNilai / jumlahMhs;
        System.out.println("-------------------------------------------");
        System.out.println("\t\tNilai Mahasiswa");
        System.out.println("-------------------------------------------");
        for(int i = 0; i < jumlahMhs; i++){
            System.out.printf("\sNilai mahasiswa ke-%s: %s\n", (i+1), nilai[i]);
        }
        System.out.println("---------------------------------------");
        System.out.println("rata-rata nilai mahasiswa: " + rata);
        System.out.printf("Nilai tertinggi dari %s mahasiswa: %s\n", jumlahMhs, nilMax);
        System.out.printf("Nilai terendah dari %s mahasiswa: %s\n", jumlahMhs, nilMin);

        input02.close();
    }
}

import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahLulus = 0, jumlahTidak = 0;
        double rataLulus = 0, rataTidak =0;
        int jumlahMhs = 0;

        System.out.print("Masukkan Jumlah mahasiswa: ");
        jumlahMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMhs];

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.printf("Masukkan nilai mahasiswa ke-%s: ", (i+1));
            nilaiMhs[i] = sc.nextInt();
        }

        for(int i = 0; i < nilaiMhs.length; i++){
            if(nilaiMhs[i] > 70){
                jumlahLulus++;
                rataLulus += nilaiMhs[i];
            }else{
                jumlahTidak++;
                rataTidak += nilaiMhs[i];
            }
        }
        rataLulus /= jumlahLulus;
        rataTidak /= jumlahTidak;
        System.out.printf("Rata-rata Nilai Lulus: %s\n", rataLulus);
        System.out.printf("Rata-rata Nilai Tidak Lulus: %s\n", rataTidak);
        sc.close();
    }
}

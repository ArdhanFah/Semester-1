import java.util.Scanner;

public class SiakadFor02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        // Deklarasi
        double nilai=0, tertinggi = 0, terendah = 100;
        int tidakLulus=0, lulus=0;

        for(int i = 1; i<= 10; i++){
            System.out.printf("Masukkan nilai mahasiswa ke-%s : ", i);
            nilai = input02.nextDouble();
            
            if(nilai > tertinggi){
                tertinggi = nilai;
            }

            if(nilai < terendah){
                terendah = nilai;
            }
           
            if(nilai < 60){
                tidakLulus++;
            }else{
                lulus++;
            }

        }
        
        System.out.printf("Nilai tertinggi: %s\n", tertinggi);
        System.out.printf("Nilai terendah: %s", terendah);
        System.out.println("Jumlah siswa lulus: " + lulus);
        System.out.println("Jumlah siswa tidak lulus: " + tidakLulus);
        input02.close();
    }
}

import java.util.Scanner;

public class SiakadWhile02 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        
        // Deklarasi
        int nilai=0, jml=0, i=0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();
        
        while (i < jml) {
            System.out.printf("Masukkan nilai mahasiswa ke-%s:", i+1);
            nilai = sc.nextInt();

            if(nilai < 0 || nilai > 100){
                System.out.println("Masukkan nilai mahasiswa yang valid [0-100]: ");
                continue;
            }

            if(nilai > 80 && nilai <= 100){
                System.out.printf("Nilai mahasiswa ke-%s adalah A\n", ++i);
                System.out.println("Bagus, pertahankan nilainya");
            }else if(nilai > 73){
                System.out.printf("Nilai mahasiswa ke-%s adalah B+\n", ++i);
            }else if(nilai > 65){
                System.out.printf("Nilai mahasiswa ke-%s adalah B\n", ++i);
            }else if(nilai > 60){
                System.out.printf("Nilai mahasiswa ke-%s adalah C+\n", ++i);
            }else if(nilai > 50){
                System.out.printf("Nilai mahasiswa ke-%s adalah C\n", ++i);
            }else if(nilai > 39){
                System.out.printf("Nilai mahasiswa ke-%s adalah D\n", ++i);
            }else{
                System.out.printf("Nilai mahasiswa ke-%s adalah E\n", ++i);
            }
        }

        sc.close();
    }

}

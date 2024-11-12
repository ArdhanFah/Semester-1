import java.util.Scanner;

public class SIAKAD02 {
    public static void main(String[] args) {
        Scanner inp02 = new Scanner(System.in);

        System.out.println();
        System.out.print("Masukkan jumlah siswa: ");
        int jumSiswa = inp02.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumMatkul = inp02.nextInt();
        int[][] nilai = new int[jumSiswa][jumMatkul];

        for(int i = 0; i < nilai.length; i++){
            System.out.println("\nInput nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            for(int j = 0; j < nilai[i].length; j++){
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = inp02.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa / jumMatkul);
        }

        System.out.println("\n==============================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for(int i = 0; i < jumMatkul; i++){
            double totalPerMatkul = 0; 
            for(int j = 0; j < jumSiswa; j++){
                totalPerMatkul += nilai[j][i];
            }
            System.out.println("Mata Kuliah " + (i+1) + ": " + totalPerMatkul / jumSiswa);  
        }
        
        inp02.close();
    }
}

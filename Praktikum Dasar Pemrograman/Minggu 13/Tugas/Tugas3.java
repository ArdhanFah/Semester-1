package Tugas;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        System.out.println("----- Data Mahasiswa Kampus Biru ------");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = input02.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jmlTgs = input02.nextInt();

        int data[][] = new int[jmlMhs][jmlTgs];

        inputData(data, input02);
        tampilData(data);

        int index = nilaitertinggi(data);
        System.out.printf("\nMahasiswa dengan nilai tertinggi adalah mahasiswa ke-%d\n", index + 1);
        rataNilai(data);
        
        input02.close();
    } 

    // Fungsi input data nilai dan mahasiswa
    public static void inputData(int[][] data, Scanner input02){
       System.out.print("\n-------- Masukkan nilai mahasiswa --------\n");
       for(int i = 0; i < data.length; i++){
            System.out.printf("Masukkan nilai mahasiswa ke-%d\n", i+1);
            int j = 0;
            while (j < data[i].length) {
                System.out.printf("Tugas ke-%d: ", j+1);
                data[i][j] = input02.nextInt();
                if(data[i][j] < 0 || data[i][j] > 100){
                    System.out.println("Input nilai tidak valid! masukkan antara 0-100");
                    continue;
                }else{
                    j++;
                }
            }
            System.out.println();
       }
    }

    // Fungsi tampilkan Data Tabel 
    public static void tampilData(int[][] data){
        System.out.println("----------- Tabel Nilai Kampus Biru Tercinta ---------------");
        System.out.println();
        System.out.printf("%-15s", "");
        for(int i = 0; i < data[0].length; i++){
            System.out.printf( "%-15s", "Tugas " + (i+1));
        }
        System.out.println();
        
        for(int i = 0; i < data.length; i++){
            System.out.printf("%-15s", "Mahasiswa " + (i+1));
            for(int j = 0; j < data[i].length; j++){
                System.out.printf("%-15d", data[i][j]);
            }
            System.out.println();
        }
    }

    // Fungsi mencari nilai tertinggi mahasiswa
    public static int nilaitertinggi(int[][] data){
        int max = 0;
        int index = -1;
        int nilTotal[] = new int[data.length];
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                    nilTotal[i] += data[i][j];
                }

                for(int j = 0; j < data[i].length; j++){
                    if(nilTotal[i] > max){
                        max = nilTotal[i];
                        index = i;
                    }
                }
            }

        return index;
    }

    // Fungsi hitung rata-rata nilai per Mahasiswa
    public static void rataNilai(int[][] data){
        for(int i = 0; i < data.length; i++){
            int nilTotal = 0;
            for(int j = 0; j < data[i].length; j++){
                    nilTotal += data[i][j];
                }
                double rata = nilTotal / data[i].length;
                System.out.printf("Rata nilai mahasiswa ke-%d: %s\n", (i+1) ,rata);
            }
    }
}

import java.util.Scanner;

public class SearchNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int banyakArr = sc.nextInt();

        int[] arrNilai =  new int[banyakArr];
        int key = 0;
        int hasil = 0;

        for(int i = 0; i < arrNilai.length; i++){
           
            System.out.printf("Masukkan nilai mahasiswa ke-%s: ", (i+1));
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();
            
        for(int i = 0; i < arrNilai.length; i++){
            if(key == arrNilai[i]){
                hasil = i+1;
                System.out.println();
                System.out.printf("Nilai %s ketemu, merupakan nilai mahasiswa ke-%s", key, hasil);   
            }  
        }
        if(hasil == 0){
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        sc.close();
        }        
    }

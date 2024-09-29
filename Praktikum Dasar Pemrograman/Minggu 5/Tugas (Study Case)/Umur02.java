import java.util.Scanner;

public class Umur02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        short usia; 
        String kategori;

        // Input

        System.out.println("===========================================");
        System.out.println("=========== CEK KATEGORI USIA =============");
        System.out.println("===========================================");
        System.out.print("\s\sMasukkan usia anda: ");
        usia = input.nextShort();

        // Decision
        if(usia >= 65){
            kategori = "Lansia";
        } else if(usia >= 20){
            kategori = "Dewasa";
        } else if(usia >= 13){
            kategori = "Remaja";
        }else if(usia > 0){
            kategori = "Anak";
        }else{
            System.out.println("===========================================");
            System.out.println("\s\sInput tidak Valid");
            System.out.println("===========================================");
            input.close();
            return;
        }
        System.out.println("===========================================");
        System.out.printf("Usia anda %s, anda masuk kategori %s\n", usia, kategori);
        System.out.println("===========================================");
        input.close();
    }

}

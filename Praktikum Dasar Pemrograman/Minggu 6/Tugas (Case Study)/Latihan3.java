import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        // Deklarasi
        int ukuran;
        float harga=0;
        String kategori, merk;
        String message = "Tidak ada ukuran tersebut";
    
        // Input
        System.out.println("=======================================================");
        System.out.println("=================== TOKO SEPATU JTI ===================");
        System.out.println("=======================================================");
        System.out.println("Pilihan Merk: \n\s * Converse \n\s * Sketcher \n\s * Nike");
        System.out.print("Masukkan pilihan anda: ");
        merk = input02.nextLine();

        // Pemilihan Kategori
        if(merk.equalsIgnoreCase("converse")){
            System.out.print("Pilih Kategori: \n\s* Slip On \n\s* High Top\n");
            System.out.print("Masukkan pilihan anda: ");
            kategori = input02.nextLine(); 
            if(kategori.equalsIgnoreCase("Slip On")){
                System.out.print("masukkan ukuran antara [36-40]: ");
                ukuran = input02.nextInt();
                if(ukuran >= 36){                                               // Ukuran sepatu 36-40 slip on
                    if(ukuran <= 40){                                           
                        harga = 800_000;
                    }else{
                        System.out.println(message);
                        input02.close();
                        return;
                    }
                } else {
                    System.out.println(message);
                    input02.close();
                    return;
                }
            } else if (kategori.equalsIgnoreCase("High Top")){
                System.out.print("masukkan ukuran antara [40-44]: ");
                ukuran = input02.nextInt();
                if(ukuran >= 40){                                               // Ukuran sepatu 40-44 high top
                    if(ukuran <= 44){
                        harga = 1_200_000;
                    }else{
                        System.out.println(message);
                        input02.close();
                        return;
                    }
                } else {
                    System.out.println(message);
                    input02.close();
                    return;              
                 }
            }  else {
                System.out.println("=======================================================");
                System.out.printf("\sTidak ada kategori %s pada merk %s\n]", kategori, merk);
                System.out.println("=======================================================");
                input02.close();
                return;
            }
        } else if(merk.equalsIgnoreCase("sketcher")){
            System.out.print("Pilih Kategori: \n\s* Woman \n\s* Man\n"); 
            System.out.print("Masukkan pilihan anda: ");
            kategori = input02.nextLine();
            if(kategori.equalsIgnoreCase("Women")){
                System.out.print("masukkan ukuran antara [36-41]: ");
                ukuran = input02.nextInt();
                if(ukuran >= 36){                                                // Ukuran sepatu 36-41 women
                    if(ukuran <= 41){
                        harga = 1_000_000;
                    }else{
                        System.out.println(message);
                        input02.close();
                        return;
                    }
                } else {
                    System.out.println(message);
                    input02.close();
                    return;   
                }
            } else if(kategori.equalsIgnoreCase("Man")){
                System.out.print("masukkan ukuran antara [41-44]: ");
                ukuran = input02.nextInt();
                if(ukuran >= 41){                                               // Ukuran sepatu 41-44 man
                    if(ukuran <= 44){
                        harga = 1_800_000;
                    }else{
                        System.out.println(message);
                        input02.close();
                        return;
                    }
                } else {
                    System.out.println(message);
                    input02.close();
                    return;    
                }
            } else {
                System.out.println("=======================================================");
                System.out.printf("\sTidak ada kategori %s pada merk %s\n", kategori, merk);
                System.out.println("=======================================================");
                input02.close();
                return;
            }   
        } else if(merk.equalsIgnoreCase("nike")){
            System.out.print("Pilih kategori: \n\s* Kids \n\s* Adult\n");
            System.out.print("Masukkan pilihan anda: ");
            kategori = input02.nextLine();   
            if(kategori.equalsIgnoreCase("Kids")){
                System.out.print("masukkan ukuran antara [36-40]: ");
                ukuran = input02.nextInt();
                if(ukuran >= 36){                                             // Ukuran sepatu 36-40 kids
                    if(ukuran <= 40){
                        harga = 750_000;
                    } else {
                        System.out.println(message);
                        input02.close();
                        return;
                    }
                } else {
                    System.out.println(message);
                    input02.close();
                    return;    
                }
            } else if(kategori.equalsIgnoreCase("Adult")){
                System.out.print("masukkan ukuran antara [40-44]: ");
                ukuran = input02.nextInt();
                if(ukuran >= 40){                                            // Ukuran sepatu 40-44 Adult
                    if(ukuran <= 44){
                        harga = 1_500_000;
                    } else {
                        System.out.println(message);
                        input02.close();
                        return;
                    }
                } else {
                    System.out.println(message);
                    input02.close();
                    return;    
                }
            } else {
                System.out.println("=======================================================");
                System.out.printf("\sTidak ada kategori %s pada merk %s\n", kategori, merk);
                System.out.println("=======================================================");
                input02.close();
                return;
            }
        } else {
            System.out.println("=======================================================");
            System.out.println("\t\tMasukkan Merk yang benar");
            System.out.println("=======================================================");
            input02.close();
            return;
        }

        System.out.println("=======================================================");
        System.out.printf("Harga sepatu %s kategori %s adalah Rp.%s\n", merk, kategori, (int)harga); // Harga di casting ke int dari float
        System.out.println("=======================================================");
        input02.close();
    }
}



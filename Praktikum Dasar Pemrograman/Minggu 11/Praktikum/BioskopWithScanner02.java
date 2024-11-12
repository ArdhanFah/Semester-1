import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu = 0;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Pilihan Menu\n 1.Input data Penonton\n 2.Tampilkan data penonton \n 3.Exit \nPilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:  
                    while(true){
                        System.out.println("--------------------------");
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();

                        if(baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length ){
                            System.out.println("Kursi yang anda pilih tidak tersedia");
                            break;
                        }else if(penonton[baris - 1][kolom - 1] != null){
                            System.out.printf("Kursi di baris %s kolom %s sudah diisi oleh %s\n", baris, kolom, penonton[baris-1][kolom-1]);
                            continue;
                        }else{
                            sc.nextLine();
                            System.out.printf("Masukkan nama penonton baris %d kolom %d: ", baris, kolom);
                            nama = sc.nextLine();
                            penonton[baris - 1][kolom - 1] = nama; 

                            System.out.print("Input penonton lainnya? (y/n): ");
                            next = sc.next();
                            if (next.equalsIgnoreCase("n")) {
                                break; 
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton");
                    System.out.println("------------------------");
                    for(int i = 0; i < penonton.length; i++){
                        for(int j = 0; j < penonton[i].length; j++){
                            if(penonton[i][j] == null){
                                penonton[i][j] = "****";
                            }
                            System.out.printf("Baris %s Kolom %s : %s\n",i+1,j+1,penonton[i][j]);
                        }
                    }
                    break;
                case 3:
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                    sc.close();
                    break;
            }  
        }
        
    }
}

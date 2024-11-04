import java.util.Scanner;

public class Cafe_Kedua02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        boolean found = false;
    
        while(!found){

            System.out.println("\nDaftar Menu ");
            for(int i = 0; i < menu.length; i++){
                System.out.println("* " + menu[i]);
            }

            System.out.print("\nMasukkan pilihan menu anda: ");
            String pilihan = input02.nextLine();
            
            for(String listMenu : menu){
                if(pilihan.equalsIgnoreCase(listMenu)){
                    System.out.println("-------------------------------------------");
                    System.out.printf("Menu %s ditemukan\n", pilihan);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("----------------------------------------------");
                System.out.printf("%s tidak ditemukan di menu\n", pilihan);
            }

        }
        
        input02.close();

        }
    }


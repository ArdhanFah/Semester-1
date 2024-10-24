/*
    Nama    : Ardhan Dikri Achmad Fahrudin
    Kelas   : 1F
    No Absen: 02
 */

import java.util.Scanner;

public class UTS02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        // Deklarasi 
        int energiHero, energiVillain;
        int i=1, spesial = 2, aksi;
        System.out.println("------ Superhero vs Villain ------");
        // Input
        System.out.println("--- Nilai awal ---");
        System.out.print("Energi Hero: ");
        energiHero = input02.nextInt();
        System.out.print("Energi Villain: ");
        energiVillain = input02.nextInt();
        

        while(true){
            if(energiHero <= 1){
                System.out.println("-----------------------------------------");
                System.out.println("Energi hero habis!!, anda kalah");
                System.out.println("-----------------------------------------");
                break;
            }else if(energiVillain <= 1){
                System.out.println("-----------------------------------------");
                System.out.println("\sVillain dikalahkan!!, Superhero menang.\n\sPertarungan Selesai");
                System.out.println("-----------------------------------------");
                break;
            }else{
                System.out.printf("--- Ronde %s ---\n", i);
                System.out.println("--- Status ---");
                System.out.printf("Energi Superhero: %s\n", energiHero);
                System.out.printf("Energi Villain: %s\n", energiVillain);
                System.out.printf("Serangan Spesial Tersisa: %s\n", spesial);
                System.out.println("-------------------------");
                System.out.println("Pilih aksi: ");
                System.out.println("1. Serangan Normal (-5 Energi, -15 Energi Villain, bisa ada serangan kritis)");
                System.out.println("2. Serangan spesial (-20 energi, -30 Energi Villain, bisa ada serangan super)");
                System.out.print("Pilihan anda: ");
                aksi = input02.nextInt();
                // Decision
                switch (aksi) {
                    case 1:
                    if(energiHero >= 50){
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("Superhero menggunakan serangan normal! Villain kehilangan 15 energi");
                            System.out.println("--------------------------------------------------------------------");
                            energiVillain-=15;
                            energiHero-=5;
                            i++;
                            continue;
                    }else{
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("Serangan kritis terjadi! villain kehilangan 30 energi");
                            System.out.println("--------------------------------------------------------------------");
                            energiVillain-=30;
                            energiHero-=5;
                            i++;
                            continue;
                    }
                    case 2:
                        if(energiHero >= 30){
                            if(spesial >= 1){
                                energiVillain-=30;
                                energiHero-=20;
                                System.out.println("--------------------------------------------------------------------");
                                System.out.println("Superhero menggunakan serangan Spesial!, villain kehilangan 30 energi");
                                System.out.println("--------------------------------------------------------------------");
                                spesial-=1;
                                i++;
                                continue;
                            }else{
                                System.out.println("---------------------------------");
                                System.out.println("Serangan Spesial Habis!!!!");
                                System.out.println("---------------------------------");
                                continue;
                            }
                        }else{
                            if(spesial >= 1){
                                energiVillain-=50;
                                energiHero-=20;
                                System.out.println("--------------------------------------------------------------------");
                                System.out.println("Superhero menggunakan serangan Super Kuat! Villain kehilangan 50 energi");
                                System.out.println("--------------------------------------------------------------------");
                                spesial-=1;
                                i++;
                                continue;
                            }else{
                                System.out.println("---------------------------------");
                                System.out.println("Serangan Spesial Habis!!!!");
                                System.out.println("---------------------------------");
                                continue;
                            }
                        }     
                    default:
                        System.out.println("---------------------------------------------------------");
                        System.out.println("Serangan anda salah!!!! Pilih Serangan yang benar [1-2]");
                        System.out.println("---------------------------------------------------------");
                        continue;
                }
            }
        }
        input02.close();
    }    
   
}

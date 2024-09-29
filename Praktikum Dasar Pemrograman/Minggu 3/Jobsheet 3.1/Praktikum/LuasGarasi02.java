package Praktikum;

import java.util.Scanner;

public class LuasGarasi02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        int alas, tinggi;
        float luas;

        //Input 
        System.out.println("================================================");
        System.out.println("========= HITUNG LUAS SEGITIGA JAVA ============");
        System.out.println("================================================");
        System.out.print("\s\sMasukkan alasnya: ");
        alas = input.nextInt();
        System.out.print("\s\sMasukkan tingginya: ");
        tinggi = input.nextInt();
        System.out.println("================================================");
        
        // Process hitung
        luas = (alas * tinggi)/2;
        // Output
        System.out.printf("\s\sLuasnya adalah %s\n", luas);
        System.out.println("================================================");

        input.close();
    }   
}

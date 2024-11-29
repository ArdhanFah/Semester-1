package Tugas;

public class Kubus02 {
    public static int volumeKubus(int sisi){
        int V = sisi*sisi*sisi;
        return V;
    } 

    public static int luarPermukaanKubus(int sisi){
        int L = 6 * (sisi*sisi);
        return L;
    }

    public static void main(String[] args) {
        int s = 3; // sisi kubus

        int vol = volumeKubus(s);
        System.out.println("Volume kubus: " + vol);
        int lpm = luarPermukaanKubus(s);
        System.out.println("Luas Permukaan kubus: " + lpm);
    }
}

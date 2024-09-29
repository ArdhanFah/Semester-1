package Praktikum;
public class ContohVariabel02 {
    public static void main(String[] args) {
        String myHobby = "Bermain petak umpet";
        boolean isSmart = true;
        char gemder = 'L';
        byte age = 20;
        double gpm = 3.24, height = 1.78;

        System.out.println(myHobby);
        System.out.println("Apakah pandai? " + isSmart);
        System.out.println("Jenis Kelamin: " + gemder);
        System.out.println("Umurku saat ini: " + age);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", gpm, height));
    }
}

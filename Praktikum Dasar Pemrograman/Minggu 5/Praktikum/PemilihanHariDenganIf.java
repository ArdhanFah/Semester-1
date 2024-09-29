import java.util.Scanner;

public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        int day;
        String dayType, dayName = "";
        
        // Input
        System.out.println("Pilih hari hari: \n 1.monday\n 2.tuesday\n 3.wenesday\n 4.thursday\n 5.friday\n 6.saturday\n 7.sunday");
        System.out.print("Masukkan pilihan anda: ");
        day = input.nextInt();
 
        if(day <= 5 && day  >= 1 ){                 // Akan dijalankan jika input diatas 0 dan dibawah sama dengan 5
            dayType = "Weekday";
            if (day == 1) {
                dayName = "monday";
            } else if (day == 2){
                dayName = "tuesday";
            } else if(day == 3){
                dayName = "wenesday";
            } else if(day == 4){
                dayName = "thursday";
            }else if(day == 5){
                dayName = "friday";
            }
        } else if(day <= 7){                        // Akan dijalankan jika input diatas 5 dan dibawah sama dengan 7
            dayType = "Weekend";                
            if (day == 6) {
                dayName = "saturday";
            } else if (day == 7){
                dayName = "sunday";
            }
        } else {
            dayType = "Invalid Number";            // Akan dijalankan jika input tidak sesuai range [1-7]
        }

        System.out.printf("%s is a %s", dayName, dayType);
        input.close();

    }
}

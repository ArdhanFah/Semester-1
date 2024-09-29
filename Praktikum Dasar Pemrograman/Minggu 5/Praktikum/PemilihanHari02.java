import java.util.Scanner;

public class PemilihanHari02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String dayName, dayType;

        System.out.print("Input day name: ");
        dayName = in.nextLine();

        switch (dayName) {
            case "monday":
            case "tuesday":
            case "wenesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
                break;
        }
        
        System.out.println(dayName + " is a " + dayType);
        in.close();
    }
}

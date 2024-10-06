import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

     // Deklarasi
        int bilMax,bil1, bil2, bil3;

     // Input
        System.out.print("Input Bil 1: ");
        bil1 = input02.nextInt();
        System.out.print("Input Bil 2: ");
        bil2 = input02.nextInt();
        System.out.print("Input Bil 3: ");
        bil3 = input02.nextInt();

     // Decision
       if(bil1>bil2){
            bilMax = bil1;
       }else{
            bilMax = bil2;
       }

       if(bilMax < bil3){
            bilMax = bil3;
       }
    
     // output
       System.out.printf("Bilangan Maximal nya adalah: %s", bilMax);

       input02.close();

    }    
}

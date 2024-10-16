public class soal7 {
    public static void main(String[] args) {
        int bil1 = 1, bil2 = 1, n = 8;
        int i, h;

        System.out.print(bil1 + "," + bil2 );
        for(i = 0; i < n; i++){
            h = bil1 + bil2;
            System.out.print(  "," + h);
            bil1 = bil2;
            bil2 = h;
        }
    }
}

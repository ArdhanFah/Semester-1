public class soal6 {
    public static void main(String[] args) {
        int bil = 10, n = 3;
        int i;

        for(i = 1; i <= n; i++){
            System.out.println(bil);
            bil+=bil;
            System.out.println(bil);
            bil+=4;
        }
    }
}

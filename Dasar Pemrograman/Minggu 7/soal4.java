public class soal4 {
    public static void main(String[] args) {
        int i, kuadrat;

        int n = 6;
        for(i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.print(1 + " ");
            }else{
                kuadrat = i*i;
                System.out.print(kuadrat + " ");
            }
        }
    }
}

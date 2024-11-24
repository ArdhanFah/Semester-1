import java.util.Scanner;

public class QuizFixed {
    public static void main(String[] args) {
        Scanner inp2 = new Scanner(System.in);

        System.out.print("Masukkan wilayah pembagi lokasi: ");
        int jmlLokasi = inp2.nextInt();

        String[] namaKategori = {"Makanan","Pakaian","Obat-obatan"};
        String lokasi[] = new String[jmlLokasi];
        int[][] kategori = new int[jmlLokasi][namaKategori.length];
        int jumlahDonasi = 0;
        int jumlahDonasiPerKategori = 0, jmlTotal = 0;
        double rata = 0;

        inp2.nextLine();
        for(int i = 0; i < jmlLokasi; i++){
            System.out.printf("Masukkan nama lokasi ke-%s: ", i+1);
            lokasi[i] = inp2.nextLine();
        }

        for(int i = 0; i < jmlLokasi; i++){
            System.out.println();
            System.out.printf("Masukkan jumlah donasi dari wilayah %s\n", lokasi[i]);
            for(int j = 0; j < kategori[i].length; j++){
                System.out.printf("Masukkan jumlah bantuan %s: ", namaKategori[j]);
                kategori[i][j] = inp2.nextInt();
            }
        }

        System.out.println();
        System.out.printf("%-15s", "Wilayah");
        for(String kat : namaKategori){
            System.out.printf("%-15s", kat);
        }

        System.out.println();
        for(int i = 0; i < jmlLokasi; i++){
            System.out.printf("%-15s", lokasi[i]);
            for(int j = 0; j < kategori[i].length; j++){
                System.out.printf("%-15s", kategori[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
        System.out.println();

        System.out.println("Total Kontribusi: ");
        for(int i = 0; i < jmlLokasi; i++){
            jumlahDonasi = 0;
            for(int j = 0; j < kategori[i].length; j++){
                jumlahDonasi += kategori[i][j];
            }
            System.out.printf("%s: %s\n",lokasi[i], jumlahDonasi);
        }

        System.out.println();
        System.out.println("Lokasi penyumbang terbanyak setiap jenis barang:");
        for(int i = 0; i < namaKategori.length; i++){
            int index = 0;
            int max = 0;
            for(int j = 0; j < jmlLokasi; j++){
                if(kategori[j][i] > max){
                    max = kategori[j][i];
                    index = j;
                }
            }

            if(index != -1){
                System.out.printf("%s: %s\n",namaKategori[i], lokasi[index]);
            }
        }

        System.out.println();
        System.out.println("Prosentasi Penyumbang perkategori");
    
        for(int i = 0; i < kategori.length; i++){
            for(int j = 0; j < kategori[i].length; j++){
                jmlTotal += kategori[i][j];
            }
        }

        for(int i = 0; i < kategori[0].length; i++){
            jumlahDonasiPerKategori = 0;
            for(int j = 0; j < kategori.length; j++){
                jumlahDonasiPerKategori += kategori[j][i];
            }
            rata = (double) jumlahDonasiPerKategori/jmlTotal * 100;
            System.out.printf("%s: %.2f%%\n", namaKategori[i], rata);
        }
       
        inp2.close();
    }

}
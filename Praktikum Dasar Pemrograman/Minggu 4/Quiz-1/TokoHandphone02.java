import java.util.Scanner;

public class TokoHandphone02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //deklarasi variable
        double targetKeuntungan, biayaPengiriman,biayaPengemasan, hargaBeliHP, hargaBeliKabel, hargaBeliEarphone, hargaJualHP, hargaJualKabel, hargaJualEarphone;
        int jumlahHp, jumlahKabel, jumlahEarphone, resikoEarphone, resikoKabel, resikoHP;
        float diskonEarphone, diskonHp, diskonKabel;

        //input Ekspedisi
        System.out.println("======= Input Biaya Ekspedisi =======");
        System.out.print("masukkan Biaya Pengemasan: Rp.");
        biayaPengemasan = input.nextDouble();
        System.out.print("masukkan biaya Pengiriman: Rp.");
        biayaPengiriman = input.nextDouble();

        // input HP 
        System.out.println(" ======= INPUT HP =======");
        System.out.print("masukkan jumlah HP terjual: ");
        jumlahHp = input.nextInt();
        System.out.print("Masukkan harga jual HP: Rp.");
        hargaJualHP = input.nextDouble();
        System.out.print("masukkan harga beli HP: Rp. ");
        hargaBeliHP = input.nextDouble();
        System.out.print("diskon HP dalam decimal:");
        diskonHp = input.nextInt();
        System.out.print("faktor resiko HP dalam decimal:");
        resikoHP = input.nextInt();

        // perhitungan HP
        double keuntunganPerHp = hargaJualHP - hargaBeliHP - biayaPengemasan - biayaPengiriman - diskonHp;
        double penghitungkeuntunganHp = jumlahHp - ((resikoHP/100)*jumlahHp);

        // input Kabel
        System.out.println("======= Input Kabel =======");
        System.out.print("masukkan jumlah kabel terjual: ");
        jumlahKabel = input.nextInt();
        System.out.print("Masukkan harga jual Kabel: Rp.");
        hargaJualKabel = input.nextDouble();
        System.out.print("masukkan harga beli Kabel: Rp. ");
        hargaBeliKabel = input.nextDouble();
        System.out.print("diskon Kabel dalam decimal:");
        diskonKabel = input.nextInt();
        System.out.print("faktor resiko Kabel dalam decimal:");
        resikoKabel = input.nextInt();

         // perhitungan kabel
        double keuntunganPerKabel = hargaJualKabel - hargaBeliKabel - biayaPengemasan - biayaPengiriman - diskonKabel;
        double penghitungKeuntunganKabel = jumlahKabel - ((resikoKabel/100)*jumlahKabel);
        
        // input Earphone 
        System.out.println("======= INPUT Earphone =======");
        System.out.print("masukkan jumlah Earphone terjual: ");
        jumlahEarphone = input.nextInt();
        System.out.print("Masukkan harga jual Earphone: Rp.");
        hargaJualEarphone = input.nextDouble();
        System.out.print("masukkan harga beli Earphone: Rp. ");
        hargaBeliEarphone = input.nextDouble();
        System.out.print("diskon Earphone dalam decimal:");
        diskonEarphone = input.nextInt();
        System.out.print("faktor resiko Earphone dalam decimal:");
        resikoEarphone = input.nextInt();
        // perhitungan Earphone 
        double keuntunganPerEarphone = hargaJualEarphone - hargaBeliEarphone - biayaPengemasan - biayaPengiriman - diskonEarphone;
        double penghitungKeuntunganEarphone = jumlahEarphone - ((resikoEarphone/100)*jumlahEarphone);

        // input target keuntungan
        System.out.println("======= INPUT TARGET KEUNTUNGAN =======");
        System.out.print("masukkan target keuntungan dalam Rp: " );
        targetKeuntungan =  input.nextDouble();

        // perhitungan keuntungan semua jenis produk
        double keuntunganHp = keuntunganPerHp * penghitungkeuntunganHp;
        double keuntunganEarphone = keuntunganPerEarphone * penghitungKeuntunganEarphone;
        double keuntunganKabel = keuntunganPerKabel * penghitungKeuntunganKabel;

        // total keuntungan
        double totalKeuntungan = keuntunganHp + keuntunganKabel + keuntunganEarphone;
       
        // perhitungan total Penghitung Keuntungan
        double totalPenghitungKeuntungan = penghitungkeuntunganHp + penghitungKeuntunganKabel + penghitungKeuntunganEarphone;

        // perhitungan rata-rata Keuntungan
        double rataRataKeuntungan = totalKeuntungan/totalPenghitungKeuntungan ;

        // perhitunga prosentase
        double prosentaseKeuntungan = (totalKeuntungan / targetKeuntungan) * 100/100f;


        // output keuntungan Per Produk
        System.out.printf("Keuntungan HP Rp.%s, keuntungan Eaprhone Rp.%s, keuntungan Kabel Rp.%s \n", keuntunganHp, keuntunganEarphone, keuntunganKabel);
        
        // output keuntungan dari semua produk
        System.out.printf("keuntungan dari semua jenis produk Rp.%s \n", totalKeuntungan);
       
        // output rata-rata semua produk
        System.out.printf("rata-rata keuntungan semua produk: Rp.%s \n", rataRataKeuntungan);

        // taregt Keuntungan
    
        System.out.printf("Prosentase keuntungan yang dicapai %s persen", prosentaseKeuntungan);
    
        input.close();
    }
}
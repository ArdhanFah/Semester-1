import java.util.Scanner;

public class SIAKAD02 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas,nilaiHuruf =" ", kualifikasi=" ";
        //char kelas*/;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;


        //Data Mahasiswa
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine()/* .charAt(0)*/;
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        //Nilai
        System.out.print("Masukkan nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35);

        if(nilaiAkhir > 80){
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if(nilaiAkhir > 73){
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if(nilaiAkhir > 65){
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if(nilaiAkhir > 60){
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if(nilaiAkhir > 50){
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if(nilaiAkhir > 39){
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if(nilaiAkhir <= 39){
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.printf("Mahasiswa dengan nama %s " + "(NIM: %s) ", nama, nim);
        System.out.printf("kelas %s" + " nomor absen %s\n", kelas, absen);
        System.out.printf("Nilai Akhir: %s\nNilai akhir huruf: %s\nKualifikasi: %s\n", nilaiAkhir, nilaiHuruf,kualifikasi);

        sc.close();
    }
}
import java.util.Scanner;

public class Siakad15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, nilaiUjianAkhir;

        System.out.println("Masukkan nama : ");
        nama = input.nextLine();
        System.out.println("Masukkan nim : ");
        nim = input.nextLine();
        System.out.println("Masukkan kelas : ");
        kelas = input.nextLine();
        System.out.println("Masukkan NoAbsen : ");
        absen = input.nextByte();

        System.out.println("Masukkan nilai kuis : ");
        nilaiKuis = input.nextDouble();
        System.out.println("Masukkan nilai ujian tengah : ");
        nilaiUjian = input.nextDouble();
        System.out.println("Masukkan nilai tugas : ");
        nilaiTugas = input.nextDouble();
        System.out.println("Masukkan nilai ujian akhir : ");
        nilaiUjianAkhir = input.nextDouble();

        nilaiAkhir = ((nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUjian * 0.3) + (nilaiUjianAkhir * 0.35));

        System.out.println("Mahasiswa dengan Nama : " + nama + " (NIM : " + nim + ")" + " kelas : " + kelas + " No Absen : " + absen );
        System.out.println("Nilai Akhir : " + nilaiAkhir);

    }
}
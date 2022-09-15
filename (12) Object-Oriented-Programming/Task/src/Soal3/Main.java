package Soal3;

public class Main {
    public static void main(String[] args) {
        Penjumlahan penjumlahan = new Penjumlahan();
        penjumlahan.nilai1 = 3;
        penjumlahan.nilai2 = 4;

        Pengurangan pengurangan = new Pengurangan();
        pengurangan.nilai1 = 15;
        pengurangan.nilai2 = 4;

        Perkalian perkalian = new Perkalian();
        perkalian.nilai1 = 10;
        perkalian.nilai2 = 10;

        Pembagian pembagian = new Pembagian();
        pembagian.nilai1 = 12;
        pembagian.nilai2 = 3;

        System.out.println("penjumlahan " + penjumlahan.penjumlahan() + "\n" + "Pengurangan " + pengurangan.pengurangan() + "\n" + "Perkalian " + perkalian.Perkalian() + "\n" + "Pembagian " + pembagian.pembagian());
    }
}

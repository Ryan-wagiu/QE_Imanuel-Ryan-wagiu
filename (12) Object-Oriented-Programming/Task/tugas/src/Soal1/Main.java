package Soal1;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.S = 4;

        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.P = 8;
        persegipanjang.L = 7;

        Segitiga segitiga = new Segitiga();
        segitiga.A = 3;
        segitiga.T = 4;

        System.out.println("luas " + "\n" + "Soal1.Segitiga = " + segitiga.Luas() + "\n" + "Soal1.Persegi = " + persegi.Luas() + "\n" + "Soal1.Persegi Panjang = " + persegipanjang.Luas() );
        System.out.println("\n");
        System.out.println("Keliling " + "\n" + "Soal1.Segitiga = " + segitiga.Keliling() + "\n" + "Soal1.Persegi = " + persegi.Keliling() + "\n" + "Soal1.Persegi Panjang = " + persegipanjang.Keliling() );
    }
}

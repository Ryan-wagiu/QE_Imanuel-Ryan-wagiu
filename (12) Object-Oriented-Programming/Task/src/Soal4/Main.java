package Soal4;

public class Main {
    public static void main(String[] args) {
        OngkosKirim ongkos = new OngkosKirim();
        ongkos.P = 5;
        ongkos.L = 2;
        ongkos.T = 4;
        ongkos.B = 1;

        if (ongkos.Luas() <= 50 && ongkos.B <=1) {
            System.out.println("Rp 5000");
        } else if (ongkos.Luas() > 50 || ongkos.B > 1) {
            System.out.println("Rp 10000");
        }

    }
}

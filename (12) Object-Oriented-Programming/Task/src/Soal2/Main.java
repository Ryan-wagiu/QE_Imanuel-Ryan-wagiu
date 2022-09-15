package Soal2;

public class Main {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.r = 10;

        Balok balok = new Balok();
        balok.P = 3;
        balok.L = 6;
        balok.T = 10;

        Tabung tabung = new Tabung();
        tabung.r = 7;
        tabung.T = 10;

        System.out.println("Volume " + "\n" + "Tabung = " + tabung.Volume() + "\n" + "Kubus = " + kubus.Volume() + "\n" + "Balok = " + balok.Volume());
    }
}

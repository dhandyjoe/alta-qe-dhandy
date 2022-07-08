package oop;

// Mewariskan class Luas karena nilai volume didapatkan dari luas bangun datar tsb.
public class Volume extends Luas{

    int kubus(int a) {
        return persegi(a) * a;
    }

    int balok(int a, int b, int c) {
        return persegiPanjang(a, b) * c;
    }

    int tabung(int radius, int tinggi) {
        return (int) (lingkaran(radius) * tinggi);
    }

}

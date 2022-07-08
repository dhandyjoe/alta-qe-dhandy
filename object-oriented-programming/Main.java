package oop;

import javax.xml.bind.ValidationEventLocator;

public class Main {
    public static void main(String[] args) {

        /*
        Alterra - Basic Programming
        Dhandy Joenathan Kurnia Putra
         */

        Luas luas = new Luas();
        Keliling keliling = new Keliling();

        System.out.println("Luas");
        System.out.println("Persegi: " + luas.persegi(4));
        System.out.println("Segitiga: " + luas.segitiga(3, 4));
        System.out.println("Persegi Panjang: " + luas.persegiPanjang(7,8));

        System.out.println("");

        System.out.println("Keliling");
        System.out.println("Persegi: " + keliling.persegi(4));
        System.out.println("Segitiga: " + keliling.segitiga(3, 4));
        System.out.println("Persegi Panjang: " + keliling.persegiPanjang(7, 8));

        System.out.println("");

        Volume volume = new Volume();

        System.out.println("Volume");
        System.out.println("Kubus: " + volume.kubus(10));
        System.out.println("Balok: " + volume.balok(3, 6, 10));
        System.out.println("Tabung: " + volume.tabung(7, 10));

        System.out.println("");

        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Penjumlahan: " + kalkulator.penjumlahan(3, 4));
        System.out.println("Pengurangan: " + kalkulator.pengurangan(15, 4));
        System.out.println("Perkalian: " + kalkulator.perkalian(10, 10));
        System.out.println("Pembagian: " + kalkulator.pembagian(12, 3));

        System.out.println("");

        OngkosKirim ongkosKirim = new OngkosKirim(5, 2, 4, 1);
        System.out.println("Harga: Rp " + ongkosKirim.harga());
    }
}
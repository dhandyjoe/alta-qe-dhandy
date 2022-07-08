package oop;

public class Kalkulator {

    int penjumlahan(int a, int b) { return a + b; }

    int pengurangan(int a, int b) {
        return a - b;
    }

    int perkalian(int a, int b) {
        return a * b;
    }

    /*
    Menggunakan float karena ada kemungkinan return
    yang dihasilkan berupa bilangan desimal
    */
    float pembagian(float a, float b) {
        return a / b;
    }

}

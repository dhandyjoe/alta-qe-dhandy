package oop;

public class Luas {

    int persegi(int a) { return a * a; }

    /*
        Menggunakan float karena ada kemungkinan return
        yang dihasilkan berupa bilangan desimal
    */
    float segitiga(float a, float b) { return a * b / 2; }

    int persegiPanjang(int a, int b) { return a * b; }

    int lingkaran(int radius) {
        return (int) (3.142857143 * radius * radius);
    }

}

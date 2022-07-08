package oop;

public class OngkosKirim {
    int panjang;
    int lebar;
    int tinggi;
    float berat;

    /*
        Constructor
        Method yang digunakan untuk memberikan nilai awal
        pada saat instance dibuat
    */
    public OngkosKirim(int panjang, int lebar, int tinggi, float berat) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    int harga() {
        int volume = panjang * lebar * tinggi;

        if (volume <= 50 && berat <= 1) {
            return 5000;
        } else {
            return 10000;
        }
    }
}

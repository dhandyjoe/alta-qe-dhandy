import java.util.zip.ZipEntry;

public class Problem6_DrawXYZ {

    public static void drawXYZ(int n) {
        for (int i = 1; i <= n*n; i++) {
            if (i % n == 0) { // jika nomor tsb kelipatan n, maka akan masuk ke baris bawahnya
                if (i % 3 == 0) { // jika i dapat dibagi habis 3 , maka berubah menjadi X
                    System.out.println("X ");
                } else if (i % 2 != 0) { // jika i merupakan ganjil , maka berubah menjadi Y
                    System.out.println("Y ");
                } else { // jika i merupakan genap , maka berubah menjadi Y
                    System.out.println("Z ");
                }
            } else {
                if (i % 3 == 0) {
                    System.out.print("X ");
                } else if (i % 2 != 0) {
                    System.out.print("Y ");
                } else {
                    System.out.print("Z ");
                }
            }
        }
    }

    public static void main(String[] args) {
        drawXYZ(3);
    }
}

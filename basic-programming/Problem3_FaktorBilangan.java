import java.util.Scanner;

public class Problem3_FaktorBilangan {

    public static void main(String[] args) {
        // package scanner untuk melakukan input dari user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka : ");

        // hasil input user dimasukan ke dalam variable ini
        int bilangan = scanner.nextInt();
        System.out.println(""); // sebagai enter line
        System.out.println("Berikut faktor bilangan dari angka " + bilangan);
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) { // i yang dapat dibagi habis dengan bilangan
                System.out.println(i);
            }
        }
    }
}

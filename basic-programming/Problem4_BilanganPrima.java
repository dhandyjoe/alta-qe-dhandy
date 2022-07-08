public class Problem4_BilanganPrima {

    private static boolean primeNumber(int number) {
        // variable temp digunakan sebagai penentu prima / bukan
        int temp = 0;

        if (number < 2) { // nomor yang dibawah 2 pasti bukan prima
            return false;
        } else { // nomor 2 keatas / nomor 2 adalah bilangan prima pertama
            for (int i = 2; i < number; i++) {
                if (number % i == 0) { // jika terdapat i yang dapat dibagi habis number, maka temp tambah 1
                    temp++;
                    break;
                }
            }

            if (temp != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11)); // true
        System.out.println(primeNumber(13)); // true
        System.out.println(primeNumber(17)); // true
        System.out.println(primeNumber(20)); // false
    }
}

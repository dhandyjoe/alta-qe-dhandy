public class Problem7_Mean {

    private static float mean(float[] numbers) {
        // variable ini digunakan untuk menampung total dari penjumlahan value array-nya
        float total = 0f;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i]; // setiap value array ditambahkan dengan variable total
        }

        return total / numbers.length;
    }

    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(mean(value));
    }
}

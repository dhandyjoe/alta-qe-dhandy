public class Problem5_Palindrome {

    public static boolean palindrome(String value) {
        // variable untuk menampung hasil proses reverse
        String reverseValue = "";

        for (int i = (value.length() - 1); i >= 0; i--) {
            reverseValue += value.charAt(i); // setiap char[i] dalam string diambil dan dimasukan ke dalam variable reverse value
        }

        return value.equals(reverseValue); // melakukan matching / pencocokan dengan parameter value
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic")); // true
        System.out.println(palindrome("katak")); // true
        System.out.println(palindrome("kasur rusak")); // true
        System.out.println(palindrome("kupu-kupu")); // false
        System.out.println(palindrome("lion")); // false
    }
}

public class Problem8_StringAcak {

    private static String stringAcak(String stringSatu, String stringDua) {
        String value = null;

        if (stringSatu.length() != stringDua.length()) {
            value = "TIDAK";
        } else {
            for (int i = 0; i < stringSatu.length(); i++) {
                for (int j = 0; j < stringDua.length(); j++) {
                    if (stringSatu.charAt(i) == stringDua.charAt(j)) {
                        char[] stringDuaArray = stringDua.toCharArray();
                        stringDuaArray[j] = ' ';
                        stringDua = String.valueOf(stringDuaArray);
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < stringDua.length(); i++) {
            if (stringDua.charAt(i) == ' ') {
                value = "YA";
            } else {
                value = "TIDAK";
                break;
            }
        }

        return value;
    }

    private static String stringAcak2(String stringSatu, String stringDua) {
        char[] tempString = new char[stringSatu.length()];

        if (stringSatu.length() != stringDua.length()) {
            return "TIDAK";
        } else {
            for (int i = 0; i < stringSatu.length(); i++) {
                for (int j = 0; j < stringDua.length(); j++) {
                    if (stringSatu.charAt(i) == stringDua.charAt(j)) {
                        tempString[i] = stringDua.charAt(j);
                        char[] stringDuaArray = stringDua.toCharArray();
                        stringDuaArray[j] = ' ';
                        stringDua = String.valueOf(stringDuaArray);
                        break;
                    }
                }
            }
        }

        if (String.valueOf(tempString).equals(stringSatu)) {
            return "YA";
        } else {
            return "TIDAK";
        }
    }


    public static void main(String[] args) {
//        System.out.println(stringAcak("malang", "agmlan"));
        System.out.println(stringAcak2("alterra", "terlata"));
    }
}

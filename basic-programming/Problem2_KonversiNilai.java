public class Problem2_KonversiNilai {

    public static void main(String[] args) {
        // input studentScore
        int studentScore = 80;
        String grade; // variable untuk menampung hasil if else

        // proccess conditional
        if (studentScore > 100 || studentScore < 0) {
            grade = "Invalid";
        } else if (studentScore >= 80 && studentScore <= 100) {
            grade = "A";
        } else if (studentScore >= 65 && studentScore <= 79) {
            grade = "B+";
        } else if (studentScore >= 50 && studentScore <= 64) {
            grade = "B";
        } else if (studentScore >= 35 && studentScore <= 49) {
            grade = "C";
        } else {
            grade = "D";
        }
        // output variable grade
        System.out.println(grade);
    }
}

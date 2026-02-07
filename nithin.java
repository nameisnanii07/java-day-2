public class nithin {
    public static void main(String[] args) {
        // Data for 5 students (marks, age, grade)
        int[] marks = {85, 32, 76, 40, 55};
        int[] age   = {18, 19, 20, 18, 21};
        char[] grade = {'A', 'D', 'B', 'C', 'B'};
        String[] result = new String[5];
        for (int i = 0; i < 5; i++) {
            if (marks[i] >= 40) {
                result[i] = "Pass";
            } else {
                result[i] = "Fail";
            }
        }
        System.out.println("--- Student Results ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) +
                               ": Marks=" + marks[i] +
                               ", Age=" + age[i] +
                               ", Grade=" + grade[i] +
                               ", Result=" + result[i]);
        }
    }
}
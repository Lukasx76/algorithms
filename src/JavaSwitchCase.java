public class JavaSwitchCase {
    public static void main(String[] args){

        String grade;
        int testGrade = 7;

        // grade >= 80 = A - approved
        // 80 > grade >= 60 = B - approved
        // 60 > grade >= 40 = C - reproved
        // 40 > grade >= 0 = D - reproved

        if (testGrade >= 80 && testGrade <= 100) {
            grade = "A";
        }
        else if (testGrade >= 60 && testGrade < 80) {
            grade = "B";
        }
        else if (testGrade >= 40 && testGrade < 60) {
            grade = "C";
        }
        else if (testGrade >= 0 && testGrade < 40) {
            grade = "D";
        }
        else {
            grade = null;
        }

        switch (grade) {
            case "A":
            case "B":
                System.out.println("You passed with flying colors!");
                break;
            case "C":
            case "D":
                System.out.println("You do not passed");
                break;
            default:
                System.out.println("Invalid grade!");
        }
    }
}

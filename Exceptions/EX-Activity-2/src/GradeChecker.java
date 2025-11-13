public class GradeChecker {

        public static void checkGrade(int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade out of range: " + grade);
        }
        System.out.println("Grade " + grade + " is valid.");
    }

    public static void main(String[] args) {
        int[] testGrades = {95, -10, 120, 88};

        try {
            for (int grade : testGrades) {
                checkGrade(grade);
            }
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Grade check complete.");
        }
    }
}

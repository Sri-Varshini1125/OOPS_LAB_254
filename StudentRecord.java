public class StudentRecord {
    public static void main(String[] args) {
        long studentId = 202400012345L;
        byte age = 20;
        short graduationYear = 2026;
        double gpa = 3.85;
        int totalCredits = 120;
        float semesterFee = 15000.50f;
        char currentGrade = 'A';
        boolean isEnrolled = true;
        System.out.println("=== Student Profile ===");
        System.out.println("ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Graduation year: "+graduationYear);
        System.out.println("GPA: " + gpa);
        System.out.println("total credits: " + totalCredits);
        System.out.println("Grade: " + currentGrade);
        System.out.println("Enrolled: " + (isEnrolled ? "Yes" : "No"));
    }
}
package Chapter10.Exercise12;

public class CourseGrades {
    
    public static void main(String...args) {
        GradeBook gradeBook = new GradeBook();
        gradeBook.getGrades();

        System.out.print("Showing Student Grades");
        gradeBook.showGrades();
        
        System.out.printf("\nStudent 10 Average: %s", gradeBook.studentAvg(10));
        System.out.printf("\nTest 5 Average: %s", gradeBook.testAvg(5));
    }
}

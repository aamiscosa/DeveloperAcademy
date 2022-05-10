package Chapter12.Exercise16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CourseGrades {
    
    public static void main(String...args) {
        GradeBook gradeBook = new GradeBook();
        gradeBook.getGrades();

        System.out.print("Showing Student Grades");
        System.out.println(gradeBook.showGrades());
        
        System.out.printf("\nStudent 10 Average: %s", gradeBook.studentAvg(10));
        System.out.printf("\nTest 5 Average: %s", gradeBook.testAvg(5));
        
        try {
            File file = new File("CourseGrades.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(gradeBook.showGrades());
            writer.close();
        } catch(IOException ioException) {
            ioException.printStackTrace();
        }
    }
}

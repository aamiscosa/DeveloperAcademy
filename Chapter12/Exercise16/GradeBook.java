package Chapter12.Exercise16;

import java.util.Scanner;

public class GradeBook {
    private final int _studentCount = 12;
    private final int _testCount = 5;

    private Scanner scanner = new Scanner(System.in);
    private int[][] grades = new int[_studentCount][_testCount];

    public void getGrades() {
        for(int studentId=0;studentId<_studentCount;studentId++) {
            System.out.printf("Enter Test Grades for Student %s:\n", studentId+1);
            for(int gradeId=0;gradeId<grades[studentId].length;gradeId++) {
                System.out.printf("\tTest %s Score: ", gradeId+1);
                int grade = scanner.nextInt();
                grades[studentId][gradeId] = grade;
            }
        }
    }

    public String showGrades() {
        StringBuilder sb = new StringBuilder();
        for(int studentId=0;studentId<_studentCount;studentId++) {
            sb.append(String.format("\nStudent %2s: ", studentId+1));
            for(int gradeId=0;gradeId<_testCount;gradeId++) {
                sb.append(String.format("\t%3s", grades[studentId][gradeId]));
            }
        }
        return sb.toString();
    }

    public int studentAvg(int studentNumber) {
        int total = 0;
        for(int i=0;i<_testCount;i++) {
            total += grades[studentNumber-1][i];
        }
        return total / _testCount;
    }

    public int testAvg(int testNumber) {
        int total = 0;
        for(int i=0;i<_studentCount;i++) {
            total += grades[i][testNumber-1];
        }
        return total / _studentCount;
    }
}

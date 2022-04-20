package Chapter9.Exercise1;

public class Main {
    public static void main(String...args) {
        Faculty faculty = new Faculty();
        faculty.setName("Aldrin Salonga");
        faculty.setSalary(1000);
        faculty.setDepartment("Information Technology");
        System.out.println(faculty);

        Staff staff = new Staff();
        staff.setName("Erano Azana");
        staff.setSalary(1000);
        staff.setJobTitle("IT Staff");
        System.out.println(staff);
    }
}
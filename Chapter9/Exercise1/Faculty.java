package Chapter9.Exercise1;

public class Faculty extends UEmployee {
    private String department;

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("Department: \t%s\n", this.department));
        return sb.toString();
    }
}

package Chapter9.Exercise1;

public class Staff extends UEmployee {
    private String jobTitle;

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("Job Title: \t%s\n", this.jobTitle));
        return sb.toString();
    }
}

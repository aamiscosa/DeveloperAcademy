package Chapter9.Exercise1;

import java.text.NumberFormat;
import java.util.Locale;

public class UEmployee {
    private String name;
    private double salary;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
		Locale en = new Locale("en", "PH");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(en);

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name:\t\t%s\n", this.name));
        sb.append(String.format("Salary:\t\t%s\n", formatter.format(this.salary)));
        return sb.toString();
    }
}
package entities;

public class Student extends Person {
    private double gpa;
    private static final double STIPEND = 36660.00;
    private static final double MIN_GPA = 2.67;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return getGpa() > MIN_GPA ? STIPEND : 0.00;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}

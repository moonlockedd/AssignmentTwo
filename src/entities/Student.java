package entities;

public class Student extends Person {
    private double gpa;
    private static final double STIPEND = 36660.00;
    private static final double MIN_GPA = 2.67;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        this();
        setName(name);
        setSurname(surname);
        setGPA(gpa);
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return getGPA() > MIN_GPA ? STIPEND : 0.00;
    }
}

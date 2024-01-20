package entities;

public class Student extends Person {
    private double gpa;
    // Current stipend pay
    private static final double STIPEND = 36660.00;
    // Minimum GPA that is required to receive stipend
    private static final double MIN_GPA = 2.67;

    public Student() {
        super();
    }

    // Parametrized constructor
    public Student(String name, String surname, double gpa) {
        this();
        setName(name);
        setSurname(surname);
        setGPA(gpa);
    }

    // Getters and setters
    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // Override getPosition to provide "Student" position for every Student
    @Override
    public String getPosition() {
        return "Student";
    }

    // getPaymentAmount implementation to provide stipend if Student's GPA is
    // higher than minimum required GPA or provide 0 in other case
    @Override
    public double getPaymentAmount() {
        return getGPA() > MIN_GPA ? STIPEND : 0.00;
    }
}

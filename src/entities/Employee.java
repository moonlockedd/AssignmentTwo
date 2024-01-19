package entities;

public class Employee extends Person {
    private String position;
    private double salary;

    Employee() {
        super();
    }

    Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    @Override
    public String toString() {
        return "Employee: " +
                super.toString();
    }
}

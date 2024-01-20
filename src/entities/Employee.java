package entities;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
    }

    // Parametrized constructor
    public Employee(String name, String surname, String position, double salary) {
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    // Getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override getPosition to provide position of the employee
    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // getPaymentAmount implementation to provide current salary
    @Override
    public double getPaymentAmount() {
        return getSalary();
    }
}

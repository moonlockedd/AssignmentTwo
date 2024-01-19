import entities.Employee;
import entities.Person;
import entities.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(
                "Freddie", "Mercury", 2.49);
        Student student2 = new Student(
                "Brian", "May", 3.66);
        Student student3 = new Student(
                "Roger", "Taylor", 3.1);
        Employee employee1 = new Employee(
                "John", "Deacon", "Bass-player", 120499.99);
        Employee employee2 = new Employee(
                "Elton", "John", "Singer", 250000);

        ArrayList<Person> studentsAndEmployees = new ArrayList<>();
        studentsAndEmployees.add(student1);
        studentsAndEmployees.add(student2);
        studentsAndEmployees.add(student3);
        studentsAndEmployees.add(employee1);
        studentsAndEmployees.add(employee2);


    }
}

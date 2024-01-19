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

        ArrayList<Person> people = new ArrayList<>();

        people.add(employee1);
        people.add(employee2);
        people.add(student2);
        people.add(student3);
        people.add(student1);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.println(
                    p + " earns " + p.getPaymentAmount() + " tenge"
            );
        }
    }
}

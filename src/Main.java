import entities.Employee;
import entities.Person;
import entities.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create some students and employees
        Student student1 = new Student(
                "Brian", "May", 3.66);
        Student student2 = new Student(
                "Roger", "Taylor", 3.1);
        Student student3 = new Student(
                "Freddie", "Mercury", 2.49);
        Employee employee1 = new Employee(
                "Elvis", "Presley", "Singer", 173333.33);
        Employee employee2 = new Employee(
                "John", "Deacon", "Bass-player", 120499.99);
        Employee employee3 = new Employee(
                "Elton", "John", "Singer", 250000);

        // Create and instantiate an arraylist
        ArrayList<Person> people = new ArrayList<>();

        // Add students and employees to arraylist
        people.add(student1);
        people.add(student2);
        people.add(student3);
        people.add(employee1);
        people.add(employee2);
        people.add(employee3);

        // Sort by their pay amount in ascending order
        Collections.sort(people);

        // Print every Person and their pay
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        // For each person in provided Iterable of type Person
        // print their information and pay
        for (Person p : people) {
            System.out.printf(
                    p + " earns " + "%.2f" + " tenge\n",
                    p.getPaymentAmount()
            );
        }
    }
}
import entities.Employee;
import entities.Person;
import entities.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create and instantiate an arraylist
        ArrayList<Person> people = new ArrayList<>();

        // Add Student and Employee instances to ArrayList
        people.add(new Student("Brian", "May", 3.66));
        people.add(new Student("Roger", "Taylor", 3.1));
        people.add(new Student("Freddie", "Mercury", 2.49));
        people.add(new Employee("Elvis",
                "Presley",
                "Singer",
                173333.33
        ));
        people.add(new Employee("Elton",
                "John",
                "Singer",
                250000
        ));
        people.add(new Employee("John",
                "Deacon",
                "Bass-player",
                120499.99
        ));

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
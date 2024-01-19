public class Person {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;

    Person() {
        id = id_gen++;
    }

    Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }


}

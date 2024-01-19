package entities;

import interfaces.Payable;

public abstract class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        id = id_gen++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract String getPosition();

    @Override
    public int compareTo(Person p) {
        if (getPaymentAmount() < p.getPaymentAmount())
            return -1;
        else if (getPaymentAmount() > p.getPaymentAmount())
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return getId() + ". " +
                getName() + " " +
                getSurname();
    }
}

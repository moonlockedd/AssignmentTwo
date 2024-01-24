package entities;

import interfaces.Payable;

public abstract class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1;
    // Id is unique to every instance and does not change
    private final int id;
    private String name;
    private String surname;

    // No argument constructor that sets id for each Person and increments it
    public Person() {
        id = id_gen++;
    }

    // Getters and Setters
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

    // Abstract method that is overwritten in subclasses
    public abstract String getPosition();

    // Compare people by their pay amount in ascending order
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
        return getPosition() + ": " +
                getId() + ". " +
                getName() + " " +
                getSurname();
    }
}

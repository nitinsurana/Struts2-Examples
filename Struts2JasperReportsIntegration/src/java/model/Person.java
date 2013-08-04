package model;

import java.util.ArrayList;

public class Person {

    private String firstName;
    private String lastName;
    private ArrayList<Phone> phones = new ArrayList<Phone>();

    public Person() {
    }

    public Person(String firstName, String lastName, ArrayList<Phone> phones) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phones = phones;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<Phone> phones) {
        this.phones = phones;
    }

    public String toString() {

        String tempStr = "First Name: " + getFirstName() + "\t";
        tempStr = tempStr + "Last Name: " + getLastName();



        for (Phone phone : phones) {

            tempStr = tempStr + phone.toString();


        }


        return tempStr;


    }
}

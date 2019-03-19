package model.facility;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String lastName;
    private String firstName;

    private List<Person> person = new ArrayList<Person>();

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> orders) {
        this.person = orders;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




}

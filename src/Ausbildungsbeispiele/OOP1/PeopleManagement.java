package Ausbildungsbeispiele.OOP1;

import java.util.ArrayList;

public class PeopleManagement {
    ArrayList<String> personList = new ArrayList();


    public void createPerson(String firstName, String lastName) {
        Person person = new Person(firstName, lastName);
        personList.add(person.toString());
    }

    public void createPerson(String firstName, String lastName, String birthday, Adress adress, Gender gender) {
        Person person = new Person(firstName,lastName,birthday,adress,gender);
        personList.add(person.toString());
    }

    public void createPerson(String firstName, String lastName, String birthday, Gender gender) {
        Person person = new Person(firstName,lastName,birthday,gender);
        personList.add(person.toString());
    }
    public void deletePerson(Person person){
        personList.remove(person);
    }

    public static void main(String[] args) {
        PeopleManagement pm = new PeopleManagement();

    }
}







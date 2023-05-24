package Ausbildungsbeispiele.OOP1.PeopleManagement;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class PeopleManagement {
    ArrayList<String> personList = new ArrayList();


    public void createPerson(String firstName, String lastName) {
        Person person = new Person(firstName, lastName);
        personList.add(person);
    }

    public void createPerson(String firstName, String lastName, String birthday, Adress adress, Gender gender) {
        Person person = new Person(firstName, lastName, birthday, adress, gender);
        personList.add(person);
    }

    public void createPerson(String firstName, String lastName, String birthday, Gender gender) {
        Person person = new Person(firstName, lastName, birthday, gender);
        personList.add(person);
    }

    public void deletePerson(Person person) {
        personList.remove(person);
    }


    public static void main(String[] args) {
        PeopleManagement pm = new PeopleManagement(){
            pm.createPerson = ("Alex","Reinhardt")
            pm.createPerson = ("Alex","Reinhardt","15.10.1992",new Adress(postalCode"4053", location"Haid", streetName"Wohnpark", streetNumber"20"),new Gender ("male"))
            pm.createPerson = ("Alex","Reinhardt","15.10.1992",Gender"male");
            System.out.println(personList);

        }

}









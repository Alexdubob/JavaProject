package Ausbildungsbeispiele.OOP1.PeopleManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class PeopleManagement {
    ArrayList<Person> personList = new ArrayList<>();


    public void createPerson(String firstName, String lastName) throws InvalidPersonNameException {
        if (containsNumber(firstName) || containsNumber(lastName)) {
            throw new InvalidPersonNameException("Ungültiger Name! ");
        }

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

    public boolean findPerson(String name) {
        boolean personFound = false;
        for (Person p : personList) {
            if (p.getFirstName().equals(name) || p.getLastName().equals(name)) {
                System.out.println("Person gefunden: " + p.toString());
                personFound = true;
                return true;
            }
        }
        if (!personFound) {
            throw new NullPointerException("Person nicht vorhanden.");
        }
        return false;
    }

    public String toString() {
        String s = "";
        for (Person p : personList) {
            s += p.toString() + "\n";
        }
        return s;
    }

    public boolean containsNumber(String name) {
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}









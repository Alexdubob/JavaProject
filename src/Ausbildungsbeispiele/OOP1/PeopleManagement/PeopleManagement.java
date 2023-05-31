package Ausbildungsbeispiele.OOP1.PeopleManagement;
import java.util.ArrayList;

public class PeopleManagement {
    ArrayList<Person> personList = new ArrayList();


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

    public String toString() {
        String s = "";
        for (Person p : personList) {
            s += p.toString()+"\n";
        }
        return s;
    }


    public static void main(String[] args) {
        PeopleManagement pm = new PeopleManagement();
        pm.createPerson("Alex", "Reinhardt");
        pm.createPerson("Alex","Reinhardt","15.10.1992",new Adress("4053", "Haid", "Wohnpark", "20"),Gender.male);
        pm.createPerson("Alex", "Reinhardt", "15.10.1992", Gender.male);
        pm.createPerson("Maria","Mair","22.08.1991",new Adress("5050", "Linz", "Haudraufweg", "69"),Gender.female);

        System.out.println(pm);

    }

}









package Ausbildungsbeispiele.OOP1;


public class PeopleManagement {

    public void createPerson(String vorname, String nachname){
        Person person = new Person(vorname,nachname);
        personenListe.add(person);
    }public void createPerson(String vorname, String nachname, String geburtsdatum, String adresse, String geschlecht){
        Person person = new Person(vorname,nachname, geburtsdatum, adresse,geschlecht);
        personenListe.add(person);
    }public void createPerson(String vorname, String nachname,String geburtstadum){
        Person person = new Person(vorname,nachname, geburtstadum);
        personenListe.add(person);
    }
    public void deletePerson(Person person){
        personenListe.remove(person);
    }
    public static void main(String[] args) {
        PeopleManagement pv= new PeopleManagement();
        pv.createperson("John","Doe");
        pv.createperson("Jane","Smith","01.01.1990");

    }



}

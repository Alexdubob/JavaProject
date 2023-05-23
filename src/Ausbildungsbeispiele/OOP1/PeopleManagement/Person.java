package Ausbildungsbeispiele.OOP1.PeopleManagement;

class Person {
    private String firstName;
    private String lastName;
    private String birthday;
    private Adress adress;
    private Gender gender;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String birthday, Adress adress, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.adress = adress;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, String birthday, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "First name=" + firstName +
                ", Last Name=" + lastName +
                ", Birthday=" + birthday +
                ", Adress=" + adress +
                ", Gender=" + gender +
                "}";
    }

    public static void main(String[] args) {
        PeopleManagement pm = new PeopleManagement(){
            pm.createPerson = "John","Johnson"
        };
    }

}




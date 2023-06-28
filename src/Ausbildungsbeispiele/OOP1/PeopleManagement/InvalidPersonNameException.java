package Ausbildungsbeispiele.OOP1.PeopleManagement;

public class InvalidPersonNameException  extends Exception{
    public InvalidPersonNameException(String message){
        super(message);
    }
}

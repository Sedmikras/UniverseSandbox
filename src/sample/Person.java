package sample;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by sedmikras on 24.5.16.
 */
public class Person {

    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");
    private final SimpleStringProperty email = new SimpleStringProperty("");

    public Person() {
        this("","","");
    }

    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public String getEmail() {
        return email.get();
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public void setEmail(String email) {
        this.email.set(email);
    }
}

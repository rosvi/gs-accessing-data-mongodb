package hello;

import org.springframework.data.annotation.Id;


public class Modello {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public Modello() {}

    public Modello(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Modello[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}


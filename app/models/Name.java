package models;

import io.ebean.Finder;

import javax.persistence.Entity;

@Entity
public class Name extends BaseModel{
    private String firstName;
    private String lastName;

    public Name (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getLastFirst(){
        return this.lastName + ", " + this.firstName;
    }
    public String getFirstLast(){
        return this.firstName + ", " + this.lastName;
    }

    public static Finder<String, Name> find = new Finder<>(Name.class);
}

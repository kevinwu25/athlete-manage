package models;

import io.ebean.Finder;

import javax.persistence.Entity;

@Entity
public class User extends BaseModel{
    public String firstName;
    public String lastName;
    public String email;

    public User (String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public String getLastFirst(){
        return this.lastName + ", " + this.firstName;
    }
    public String getFirstLast(){
        return this.firstName + ", " + this.lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public static Finder<String, User> find = new Finder<>(User.class);
}

package models;

public class Name {
    private String firstName;
    private String lastName;

    public Name (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getLastFirst(){
        return this.lastName + " " + this.firstName;
    }
    public String getFirstLast(){
        return this.firstName + " " + this.lastName;
    }
}

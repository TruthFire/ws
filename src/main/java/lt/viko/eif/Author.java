package lt.viko.eif;

public class Author {

    String name;
    String surename;
    String dob;

    public Author(String name, String surename, String dob) {
        this.name = name;
        this.surename = surename;
        this.dob = dob;
    }

    public Author() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return String.format("%s %s. \n\t\tDate of birth: %s", this.name, this.surename, this.dob);
    }
}

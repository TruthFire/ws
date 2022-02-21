package lt.viko.eif;

import java.util.Date;

public class Author {

    String name;
    String surename;
    String dob;

    public Author(String name, String surename, String dob) {
        this.name = name;
        this.surename = surename;
        this.dob = dob;
    }


    @Override
    public String toString() {
        return String.format("%s %s. \n\t\t Date of birth: %s\n", this.name, this.surename, this.dob);
    }
}

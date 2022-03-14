package lt.viko.eif;

public class Author {

    String name;
    String surename;
    String dob;

    /**
     * Constructor of Author class
     * @param name first name of author
     * @param surename second name of author
     * @param dob author's date of birth
     */
    public Author(String name, String surename, String dob) {
        this.name = name;
        this.surename = surename;
        this.dob = dob;
    }

    /**
     * Default (empty) constructor of Author class
     */
    public Author() {

    }


    /**
     *
     * @return Author name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of Author
     * @param name string
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets author's second name
     * @return surename
     */
    public String getSurename() {
        return surename;
    }

    /**
     * sets author surename
     * @param surename author's second name
     */
    public void setSurename(String surename) {
        this.surename = surename;
    }

    /**
     * gets authors date of birth
     * @return date of birth
     */
    public String getDob() {
        return dob;
    }

    /**
     * sets author's date of birth
     * @param dob authors date of birth
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return String.format("%s %s. \n\t\tDate of birth: %s", this.name, this.surename, this.dob);
    }
}

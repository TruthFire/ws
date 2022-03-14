package lt.viko.eif;


public class Category {
    protected String Name;
    protected int Place;

    /**
     * Category class constructor
     * @param name book's category's name
     * @param place book's place in category
     */
    public Category(String name, int place) {
        this.Name = name;
        Place = place;
    }

    /**
     * Default(empty) category class constructor
     */
    public Category() {

    }

    /**
     * Gets category name
     * @return name
     */
    public String getName() {
        return Name;
    }

    /**
     * sets category name
     * @param name category name
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     * gets place of book in category rating
     * @return place
     */
    public int getPlace() {
        return Place;
    }

    /**
     * sets book's place in rating
     * @param place
     */
    public void setPlace(int place) {
        Place = place;
    }

    @Override
    public String toString() {
        return String.format("#%s in %s", Place, Name);
    }
}

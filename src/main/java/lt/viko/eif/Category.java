package lt.viko.eif;

public class Category {
    protected String Name;
    protected int Place;

    public Category(String name, int place) {
        this.Name = name;
        Place = place;
    }

    public Category() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getPlace() {
        return Place;
    }

    public void setPlace(int place) {
        Place = place;
    }

    @Override
    public String toString() {
        return String.format("#%s in %s", Place, Name);
    }
}

package lt.viko.eif;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    protected String name;
    protected String country;
    protected String City;
    protected int founded;
    protected List<Book> bookList = new ArrayList();

    public Publisher(String name, String country, String city, int founded) {
        this.name = name;
        this.country = country;
        City = city;
        this.founded = founded;
    }

    public void AddBook(Book b) {
        bookList.add(b);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public String getBookListString() {
        String bl = "";
        for (Book b: bookList) {
            bl += b.toString();
        }
        return bl;
    }

    @Override
    public String toString() {
        return String.format("Publisher: %s\n\t%s", this.name, getBookListString());
    }
}

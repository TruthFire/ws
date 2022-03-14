package lt.viko.eif;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlType(propOrder = {"name", "country", "city", "founded", "books"})
public class Publisher {

    protected String name;
    protected String country;
    protected String City;
    protected int founded;
    protected List<Book> books = new ArrayList();

    public Publisher(String name, String country, String city, int founded) {
        this.name = name;
        this.country = country;
        City = city;
        this.founded = founded;
    }

    public Publisher() {

    }
    @XmlElement(name = "books")
    public void setBooks(List<Book> b) {
        this.books = b;
    }


    public List<Book> getBooks(){
        return this.books;

    }

    /*public void addBook(Book b) {
        this.bookList.add(b);
    }*/

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }


    public String getCountry() {
        return country;
    }

    @XmlElement(name="country")
    public void setCountry(String country) {
        this.country = country;
    }


    public String getCity() {
        return City;
    }

    @XmlElement(name = "city")
    public void setCity(String city) {
        City = city;
    }

    public int getFounded() {
        return founded;
    }

    @XmlElement(name = "founded")
    public void setFounded(int founded) {
        this.founded = founded;
    }

    public String getBookListString() {
        String bl = "";
        for (Book b: books) {
            bl += b.toString();
        }
        return bl;
    }

    @Override
    public String toString() {
        return String.format("Publisher: %s\n\t%s", this.name, getBookListString());
    }
}

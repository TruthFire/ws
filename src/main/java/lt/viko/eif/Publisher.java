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

    /**
     * Publisher class constructor
     * @param name Publisher name
     * @param country Publisher country
     * @param city Publisher city
     * @param founded Publisher's year of foundation
     */
    public Publisher(String name, String country, String city, int founded) {
        this.name = name;
        this.country = country;
        City = city;
        this.founded = founded;
    }

    /**
     * Default (empty) constructor of Publisher class
     */
    public Publisher() {

    }

    /**
     * sets book list of publisher
     * @param books list of books
     */
    @XmlElement(name = "books")
    public void setBooks(List<Book> books) {
        this.books = books;
    }


    /**
     * Returns publisher's book list
     * @return books
     */
    public List<Book> getBooks(){
        return this.books;

    }


    /**
     * Gets publisher's name
     * @return name
     */
    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    /**
     * sets publishers name
     * @param name;
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return country of publisher
     */
    public String getCountry() {
        return country;
    }

    @XmlElement(name="country")
    /**
     * sets country of publisher
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets city of publisher
     * @return city
     */
    public String getCity() {
        return City;
    }

    /**
     * Sets city of publisher
     * @param city
     */

    @XmlElement(name = "city")
    public void setCity(String city) {
        City = city;
    }

    /**
     * gets publisher's foundation year
     * @return founded
     */

    public int getFounded() {
        return founded;
    }

    /**
     * sets year of publisher foundation
     * @param founded
     */
    @XmlElement(name = "founded")
    public void setFounded(int founded) {
        this.founded = founded;
    }

    /**
     * gets all books of publisher as string
     * @return booklist
     */
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

package lt.viko.eif;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
@XmlType(propOrder = {"name", "circultion", "published"})
public class Book {

    protected int id;
    protected String name;
    protected int circulation;
    protected List<Author> authors = new ArrayList();
    protected int published;
    protected Rating rating;
    protected Category category;

    public Book(int id, String name, int circulation, Author author, int published, Rating rating, Category cat) {
        this.id = id;
        this.name = name;
        this.circulation = circulation;
        //authors.add(author);
        this.published = published;
        this.rating = rating;
        this.category = cat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name="name")
    public void setName(String name) {
        this.name = name;
    }

    public int getCirculation() {
        return circulation;
    }

    @XmlElement(name = "circulation")
    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int getPublished() {
        return published;
    }

    @XmlElement(name = "published")
    public void setPublished(int published) {
        this.published = published;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getAuthorListString() {
        String authorList = "";
        for(Author a: authors) {
            authorList += a;
        }
        return authorList;
    }

    @Override
    public String toString() {
        return String.format("Book: %s(%s). Id: %d. Rating: %s \n\t Author: %s\n\tCirculation: %d;  Published: %d\n",
                this.name, this.category.toString(), this.id, this.rating, getAuthorListString(), this.circulation, this.published);
    }
}

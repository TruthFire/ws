package lt.viko.eif;

import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
@XmlType(propOrder = {"id","name", "authors", "category", "circulation", "published", "rating"})
public class Book {

    protected int id;
    protected String name;
    protected int circulation;
    protected List<Author> authors = new ArrayList<>();
    protected int published;
    protected Rating rating;
    protected Category category;

    /**
     *  Constructor of Book class
     * @param id book id
     * @param name book name
     * @param circulation books circulation
     * @param author Author
     * @param published publishment date
     * @param rating book's rating
     */

    public Book(int id, String name, int circulation, Author author, int published, Rating rating) {
        this.id = id;
        this.name = name;
        this.circulation = circulation;
        authors.add(author);
        this.published = published;
        this.rating = rating;
    }

    /**
     * Empty constructor of Book class
     */
    public Book() {
    }

    /**
     *  Gets ID value from Book object
     *
      * @return Book ID
     */

    public int getId() {
        return id;
    }

    /**
     * Sets ID of book
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return name of book
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of book
     * @param name String
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return circulation of book
     */
    public int getCirculation() {
        return circulation;
    }

    /**
     * Sets book circulation
     * @param circulation int
     */
    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    /**
     *
     * @return book authors
     */
    public List<Author> getAuthors() {
        return authors;
    }


    /**
     * adds author to book's author list
     * @param author Author
     */
    public void addAuthor(Author author) {
        authors.add(author);
    }

    /**
     *
     * @return date of book publishing
     */
    public int getPublished() {
        return published;
    }

    /**
     * Sets date of book publishing
     * @param published int
     */
    public void setPublished(int published) {
        this.published = published;
    }

    /**
     * Gets rating of book
     * @return rating
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * Sets rating of book
     * @param rating Rating
     */
    public void setRating(Rating rating) {
        this.rating = rating;
    }


    /**
     * Sets full list of authors of book
     * @param authors A list of authors
     */
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    /**
     * gets book category
     * @return category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * gets book category
     * @param category Category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     *
     * @return author list formated to string
     */
    public String getAuthorListString() {
        String authorList = "";
        for(Author a: authors) {
            authorList += a;
        }
        return authorList;
    }


    @Override
    public String toString() {
        return String.format("Book: %s(%s). Id: %d. Rating: %s \n\tAuthor: %s\n\tCirculation: %d;  Published: %d\n",
                this.name, this.category.toString(), this.id, this.rating, getAuthorListString(), this.circulation, this.published);
    }
}

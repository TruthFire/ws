package lt.viko.eif;

public class Rating {
    protected double BookRating;
    protected int ratedBy;

    /**
     * Constructor of Rating class
     * @param rating of book
     * @param ratedBy amount of people, who rated this book
     */
    public Rating(double rating, int ratedBy) {
        this.BookRating = rating;
        this.ratedBy = ratedBy;
    }

    /**
     * Default (empty) constructor
     */
    public Rating() { }

    /**
     * Gets book rating
     * @return BookRating
     */
    public double getBookRating() {
        return BookRating;
    }

    /**
     * Sets book rating
     * @param bookRating book rating (from 0 to 5)
     */
    public void setBookRating(double bookRating) {
        if(bookRating <= 5) {
            this.BookRating = bookRating;
        }
        else if(bookRating <= 0) {
            this.BookRating = 0.0;
        }
        else {
            bookRating = 5;
        }
    }

    /**
     * gets amount of people, who rated book
     * @return ratedBy
     */
    public int getRatedBy() {
        return ratedBy;
    }

    /**
     * Sets amount of people, who rated book
     * @param ratedBy
     */
    public void setRatedBy(int ratedBy) {
        this.ratedBy = ratedBy;
    }

    @Override
    public String toString() {
        return String.format("%1.1f (By %d users)", this.BookRating, this.ratedBy);
    }
}

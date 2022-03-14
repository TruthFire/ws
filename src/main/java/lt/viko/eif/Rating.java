package lt.viko.eif;

public class Rating {
    protected double BookRating;
    protected int ratedBy;

    public Rating(double rating, int ratedBy) {
        this.BookRating = rating;
        this.ratedBy = ratedBy;
    }

    public Rating() { }

    public double getBookRating() {
        return BookRating;
    }

    public void setBookRating(double bookRating) {
        if(bookRating <= 5) {
            this.BookRating = bookRating;
        }
        else {
            bookRating = 5;
        }
    }

    public int getRatedBy() {
        return ratedBy;
    }

    public void setRatedBy(int ratedBy) {
        this.ratedBy = ratedBy;
    }

    @Override
    public String toString() {
        return String.format("%1.1f (By %d users)", this.BookRating, this.ratedBy);
    }
}

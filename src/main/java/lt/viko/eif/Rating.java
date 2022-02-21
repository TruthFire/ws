package lt.viko.eif;

public class Rating {
    protected double rating;
    protected int ratedBy;

    public Rating(double rating, int ratedBy) {
        this.rating = rating;
        this.ratedBy = ratedBy;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating <= 5) {
            this.rating = rating;
        }
        else {
            rating = 5;
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
        return String.format("%1.1f (By %d users)", this.rating, this.ratedBy);
    }
}

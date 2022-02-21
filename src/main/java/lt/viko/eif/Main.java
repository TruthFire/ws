package lt.viko.eif;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Publisher> publishers = new ArrayList();

        Author jr = new Author("Joanne", "Rowling", "31-07-1965");
        Author rb = new Author("Ray", "Bradburry", "22-08-1920");

        Publisher bp = new Publisher("Bloomsburry publishing", "UK", "London", 1986);
        Publisher bb = new Publisher("Bellantine books", "USA", "New York", 1952);

        Rating r0 = new Rating(4.7, 23000);
        Rating r1 = new Rating(4.4, 19852);

        Book b0 = new Book(0,"Harry Potter and the Chamber of Secrets", 1000000,
        jr, 1998, r0);
        Book b1 = new Book(1,"Farenheit 451", 10000000, rb, 1953, r1);

        bp.AddBook(b0);
        bb.AddBook(b1);

        publishers.add(bp);
        publishers.add(bb);

        for (Publisher p: publishers) {
            System.out.println(p);
        }
    }
}

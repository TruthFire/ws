package lt.viko.eif;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JAXBException {

        Publishers publishers = new Publishers();

        Author jr = new Author("Joanne", "Rowling", "31-07-1965");
        Author rb = new Author("Ray", "Bradburry", "22-08-1920");

        Publisher bp = new Publisher("Bloomsburry publishing", "UK", "London", 1986);
        Publisher bb = new Publisher("Bellantine books", "USA", "New York", 1952);

        Rating r0 = new Rating(4.7, 23000);
        Rating r1 = new Rating(4.4, 19852);

        Book b0 = new Book(0,"Harry Potter and the Chamber of Secrets", 1000000,
        jr, 1998, r0);
        Book b1 = new Book(1,"Farenheit 451", 10000000, rb, 1953, r1);

        b0.setCategory(new Category("Fantasy", 1));
        b1.setCategory(new Category("Antiutopia", 2));


        bp.getBooks().add(b0);
        bb.getBooks().add(b1);


        publishers.getPublishers().add(bp);
        publishers.getPublishers().add(bb);



        /*for (Publisher p: publishers) {
            System.out.println(p);
        }*/

        Marshallizer m = new Marshallizer();
        m.MarshallizePublishers(publishers);

        m.UnMarshallizePublishers(new File("publishers.xml"));


    }
}

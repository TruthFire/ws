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



        List<Publisher> publishers = new ArrayList();

        Author jr = new Author("Joanne", "Rowling", "31-07-1965");
        Author rb = new Author("Ray", "Bradburry", "22-08-1920");

        Category f = new Category("Fantasy", 1);
        Category ant = new Category("Antiutopia",3);

        Publisher bp = new Publisher("Bloomsburry publishing", "UK", "London", 1986);
        Publisher bb = new Publisher("Bellantine books", "USA", "New York", 1952);

        Rating r0 = new Rating(4.7, 23000);
        Rating r1 = new Rating(4.4, 19852);

        Book b0 = new Book(0,"Harry Potter and the Chamber of Secrets", 1000000,
        jr, 1998, r0, f);
        Book b1 = new Book(1,"Farenheit 451", 10000000, rb, 1953, r1, ant);


        bp.addBook(b0);
        bb.addBook(b1);

        publishers.add(bp);
        publishers.add(bb);

        /*for (Publisher p: publishers) {
            System.out.println(p);
        }*/

        JAXBContext jaxbContext = JAXBContext.newInstance(Publisher.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(bb, new File("publisher.xml"));
        jaxbMarshaller.marshal(bb, System.out);


    }
}

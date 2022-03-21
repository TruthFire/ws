package lt.viko.eif;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarshallTest {

    Publishers makePublishersClass() {

        Publishers publishers = new Publishers();
        Author jr = new Author("Joanne", "Rowling", "31-07-1965");
        Publisher bp = new Publisher("Bloomsburry publishing", "UK", "London", 1986);
        Rating r0 = new Rating(4.7, 23000);
        Book b0 = new Book(0,"Harry Potter and the Chamber of Secrets", 1000000,
                jr, 1998, r0);
        b0.setCategory(new Category("Fantasy", 1));
        bp.getBooks().add(b0);

        publishers.getPublishers().add(bp);



        return publishers;
    }

    @Test
    void testMarshalling() throws JAXBException, IOException {

        Publishers publishers = makePublishersClass();
        Marshallizer m = new Marshallizer();
        m.MarshallPublishers(publishers, "test");


        String newXmlToString = Files.readString(Path.of("test.xml"));
        String goodXmlToString = Files.readString(Path.of("testResult.xml"));

        Assertions.assertEquals(newXmlToString, goodXmlToString);
    }
    @Test
    void testUnmarshalling() throws JAXBException {

        Publishers p = makePublishersClass();
        Publishers xmlPublishers;

        Marshallizer m = new Marshallizer();

        xmlPublishers = m.UnMarshallizePublishers(new File("test.xml"));

        Assertions.assertEquals(p.toString(), xmlPublishers.toString());
    }
}

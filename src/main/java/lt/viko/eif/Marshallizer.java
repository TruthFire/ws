package lt.viko.eif;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Marshallizer {

    public Marshallizer() {

    }

    public void MarshallizePublishers(Publishers p) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Publishers.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(p, new File("publishers.xml"));
        jaxbMarshaller.marshal(p, System.out);
    }

    public Publishers UnMarshallizePublishers(File file) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Publishers.class);

        Unmarshaller jaxbUnmarshller = jaxbContext.createUnmarshaller();
        Publishers p = (Publishers)jaxbUnmarshller.unmarshal(file);

        System.out.println(p);

        return p;
    }

}

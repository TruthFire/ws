package lt.viko.eif;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Marshallizer {

    public Marshallizer() {

    }

    /**
     * Creates XML file with POJO data
     * @param publishers Publishers
     * @throws JAXBException
     */

    public void MarshallPublishers(Publishers publishers) throws JAXBException {
        this.MarshallPublishers(publishers, "publishers");
    }

    public void MarshallPublishers(Publishers publishers, String filename) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Publishers.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(publishers, new File(filename + ".xml"));
        jaxbMarshaller.marshal(publishers, System.out);
    }



    /**
     * Generates POJO of XML file
     * @param file File type
     * @return publishers POJO
     * @throws JAXBException
     */

    public Publishers UnMarshallizePublishers(File file) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Publishers.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Publishers p = (Publishers)jaxbUnmarshaller.unmarshal(file);

        System.out.println(p);

        return p;
    }

}

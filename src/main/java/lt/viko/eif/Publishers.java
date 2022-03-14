package lt.viko.eif;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"publishers"})
@XmlRootElement( name = "publishers")
public class Publishers {
    private List<Publisher> Publishers = new ArrayList();

    @XmlElement(name="publisher")
    public List<Publisher> getPublishers() {
        return Publishers;
    }

    public void setPublishers(List<Publisher> publishers) {
        Publishers = publishers;
    }

    @Override
    public String toString() {
        return String.format("\nPublishers: %s\n", getPublishers());
    }
}

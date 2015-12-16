import java.io.ByteArrayInputStream;
import javax.xml.stream.XMLInputFactory;

public class TestJdk7 {

    public static void main(String[] args) throws Exception {
//    	System.setProperty("entityExpansionLimit", "64002");
    	System.out.println("--");
        String xml = "<?xml version=\"1.0\"?><test></test>";

        XMLInputFactory factory = XMLInputFactory.newInstance();

        for (int i = 0; i < 64001; i++) {

            ByteArrayInputStream stream = new ByteArrayInputStream(xml.getBytes());

            factory.createXMLEventReader(stream);

        }

    }

}
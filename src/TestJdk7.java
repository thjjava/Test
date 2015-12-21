import java.io.ByteArrayInputStream;
import javax.xml.stream.XMLInputFactory;

/**
 * 测试jdk1.7.0.45创建xml最大数
 * @author thj
 *
 */
public class TestJdk7 {

    public static void main(String[] args) throws Exception {
//    	System.setProperty("entityExpansionLimit", "64002");
    	System.out.println("--start--");
        String xml = "<?xml version=\"1.0\"?><test></test>";
        XMLInputFactory factory = XMLInputFactory.newInstance();
        for (int i = 0; i < 64001; i++) {
            ByteArrayInputStream stream = new ByteArrayInputStream(xml.getBytes());
            factory.createXMLEventReader(stream);
        }
        System.out.println("--end--");
    }

}
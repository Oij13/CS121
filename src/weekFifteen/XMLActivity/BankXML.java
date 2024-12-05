package weekFifteen.XMLActivity;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class BankXML {
    public static void main(String[] args) {
        try {
            File input = new File("C:\\Users\\Owen\\IdeaProjects\\CS121OJ\\src\\weekFifteen\\XMLActivity\\BankAccount.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(input);

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList bankList = doc.getElementsByTagName("bank");
            for (int i = 1; i < bankList.getLength(); i++){
                Node node = bankList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("Account Number: " + element.getElementsByTagName("accntNum").item(0).getTextContent());
                    System.out.println("Account Balance: " + element.getElementsByTagName("balance").item(0).getTextContent());
                    System.out.println("Account Type: " + element.getElementsByTagName("accntType").item(0).getTextContent());
                    System.out.println();
                }
            }
        } catch (Exception e){
            System.out.println("Error reading the XML file: " + e.getMessage());;
        }

    }
}

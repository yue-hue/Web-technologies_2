import org.xml.sax.SAXException;
import service.Service;

public class Main {
    public static void main(String[] args) {
        Service shop = new Service("product_list.xml");

        System.out.println("List of household goods:");
        shop.getFullList();

        System.out.println("All kettles at the store:");
        shop.getKettles();

        System.out.println("Product with lowest price:");
        shop.getLowestPriceProductInfo();
    }
}
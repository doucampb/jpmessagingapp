import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by doucampb on 06/05/2018.
 */
public class Sales {

    private static List<Sale> recordedSales = new ArrayList<>();
    private static List<SaleAdjustment> saleAdjustments = new ArrayList<>();


    public static void handleMessage(Message message) {

        for(int i=0; i<message.getQuantity(); i++) {
            recordedSales.add(new Sale(message.getPrice(), message.getItem()));
        }

        if(message.getAdjustmentOperation() !=null && message.getAdjustmentAmount() > 0) {
            SaleAdjustment saleAdjustment = new SaleAdjustment(message.getAdjustmentAmount(), message.getAdjustmentOperation(), message.getItem());
            saleAdjustments.add(saleAdjustment);
            applyAdjustment(saleAdjustment);
        }
    }

    private static void applyAdjustment(SaleAdjustment saleAdjustment) {
        recordedSales.stream().filter(r -> r.getProductType().equals(saleAdjustment.getItem())).forEach( i -> i.applyAdjustment(saleAdjustment));
    }

    public static void generateSalesReport() {
        for (Sale sale : recordedSales) {
            System.out.println(sale);
        }
    }

    public static void generateAdjustmentReport() {
        for (SaleAdjustment saleAdjustment : saleAdjustments) {
            System.out.println(saleAdjustment);
        }
    }
}

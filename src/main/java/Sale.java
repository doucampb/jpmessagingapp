import java.math.BigDecimal;

/**
 * Created by doucampb on 05/05/2018.
 */
public class Sale {

    private int price;
    private String productType;


    public Sale(int price, String productType) {
        this.price = price;
        this.productType = productType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void applyAdjustment(SaleAdjustment saleAdjustment) {
        switch (saleAdjustment.getAdjustmentOperation()) {
            case ADD:
                this.price += saleAdjustment.getAdjustmentAmount();
                break;
            case SUBTRACT:
                this.price -= saleAdjustment.getAdjustmentAmount();
                break;
            case MULTIPLY:
                this.price *= saleAdjustment.getAdjustmentAmount();
                break;
        }
    }


    @Override
    public String toString() {
        return "Sale{" +
                "price=" + price +
                ", productType='" + productType + '\'' +
                '}';
    }
}

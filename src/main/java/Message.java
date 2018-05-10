/**
 * Created by doucampb on 06/05/2018.
 */

public class Message {

    private String item;
    private int quantity;
    private int price;
    private SaleAdjustment.AdjustmentOperation adjustmentOperation;
    private int adjustmentAmount;

    public Message() {}

    public Message(String item, int quantity, int price, SaleAdjustment.AdjustmentOperation adjustmentOperation, int adjustmentAmount) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        this.adjustmentOperation = adjustmentOperation;
        this.adjustmentAmount = adjustmentAmount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SaleAdjustment.AdjustmentOperation getAdjustmentOperation() {
        return adjustmentOperation;
    }

    public void setAdjustmentOperation(SaleAdjustment.AdjustmentOperation adjustmentOperation) {
        this.adjustmentOperation = adjustmentOperation;
    }

    public int getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(int adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    @Override
    public String toString() {
        return "Message{" +
                "item='" + item + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", adjustmentOperation=" + adjustmentOperation +
                ", adjustmentAmount=" + adjustmentAmount +
                '}';
    }
}

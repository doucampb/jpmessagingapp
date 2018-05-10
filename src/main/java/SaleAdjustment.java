import java.math.BigDecimal;

/**
 * Created by doucampb on 09/05/2018.
 */

public class SaleAdjustment {

    private int adjustmentAmount;
    private AdjustmentOperation adjustmentOperation;
    private String item;

    public SaleAdjustment(int adjustmentAmount, AdjustmentOperation adjustmentOperation, String iteßm) {
        this.adjustmentAmount = adjustmentAmount;
        this.adjustmentOperation = adjustmentOperation;
        this.item = item;
    }

    public int getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(int adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    public AdjustmentOperation getAdjustmentOperation() {
        return adjustmentOperation;
    }

    public void setAdjustmentOperation(AdjustmentOperation adjustmentOperation) {
        this.adjustmentOperation = adjustmentOperation;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public enum AdjustmentOperation {
        ADD,
        SUBTRACT,
        MULTIPLY
    }

    @Override
    public String toString() {
        return "SaleAdjustment{" +
                "adjustmentAmount=" + adjustmentAmount +
                ", adjustmentOperation=" + adjustmentOperation +
                ", item='" + item + '\'' +
                '}';
    }
}




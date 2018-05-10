import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Created by doucampb on 06/05/2018.
 */
public class Main {

    private static final MessageProcessor messageProcessor = new MessageProcessor();
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {

        sendMessage("apples", 2, 3, SaleAdjustment.AdjustmentOperation.ADD, 1);
        sendMessage("bananas", 4, 4, SaleAdjustment.AdjustmentOperation.SUBTRACT, 0);
        sendMessage("pears", 6, 5, SaleAdjustment.AdjustmentOperation.MULTIPLY, 3);
        sendMessage("carrots", 8, 5, SaleAdjustment.AdjustmentOperation.ADD, 3);
        sendMessage("tomatoes", 10, 5, SaleAdjustment.AdjustmentOperation.ADD, 3);
        sendMessage("pears", 1, 5, SaleAdjustment.AdjustmentOperation.ADD, 3);
        sendMessage("apples", 2, 3, SaleAdjustment.AdjustmentOperation.ADD, 1);
        sendMessage("bananas", 4, 4, SaleAdjustment.AdjustmentOperation.SUBTRACT, 0);
        sendMessage("pears", 6, 5, SaleAdjustment.AdjustmentOperation.MULTIPLY, 3);
        sendMessage("carrots", 8, 5, SaleAdjustment.AdjustmentOperation.ADD, 3);
        sendMessage("tomatoes", 10, 5, SaleAdjustment.AdjustmentOperation.ADD, 3);
        sendMessage("pears", 1, 5, SaleAdjustment.AdjustmentOperation.ADD, 3);
    }

    private static void sendMessage(String item, int quantity, int price, SaleAdjustment.AdjustmentOperation adjustmentOperation, int adjustmentAmount) {
        try {
            messageProcessor.receiveMessage(mapper.writeValueAsString(new Message(item, quantity, price, adjustmentOperation, adjustmentAmount)));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }


}

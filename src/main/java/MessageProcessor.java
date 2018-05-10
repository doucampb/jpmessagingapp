import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by doucampb on 06/05/2018.
 */
public class MessageProcessor {

    private ObjectMapper mapper = new ObjectMapper();
    private int messageCount = 0;
    private boolean paused = false;

    private void processMessage(Message message) {
        messageCount++;

        Sales.handleMessage(message);

        if(messageCount % 10 == 0) {
            // Generate report
            Sales.generateSalesReport();
        }

        if(messageCount % 50 == 0) {
            // Generate adjustment report and pause
            pause();
            Sales.generateAdjustmentReport();
        }

    }

    private void pause() {
        System.out.println("System is now pausing");
        paused = true;
    }


    /**
     * End point for messages been sent to us
     * @param message
     */
    public void receiveMessage(String message) {

        if(paused) {
            //throw messages away
            return;
        }

        try {
            Message msg = mapper.readValue(message, new TypeReference<Message>(){});
            processMessage(msg);

            System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

import java.util.HashMap;
import java.util.Map;

public class DisappearingMessageServiceImpl implements DisappearingMessage{


    public Integer TTL,startTime,endTime;
    public Message message;
    public DisappearingMessageServiceImpl(Integer TTL, Integer startTime, Integer endTime,Message message) {
        this.TTL = TTL;
        this.startTime = startTime;
        this.endTime = endTime;
        this.message=message;
    }
    @Override
    public void disappearMessage() {
        HashMap<Integer,String> messages=message.getMessages();
        if((endTime-startTime)>=TTL) {
            while(true) {
                Integer index=0;
                for (Map.Entry<Integer, String> entry : messages.entrySet()) {
                    if (entry.getKey() >= startTime && entry.getKey() <= endTime) {
                        messages.remove(entry.getKey());
                        break;
                    }
                    index++;
                }
                if(index==messages.size()) {
                    break;
                }
            }
        }
    }
}

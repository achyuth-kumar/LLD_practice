public class DisappearingMessage {
    public Integer TTL,endTime,startTime;
    public Message message;
    public DisappearingMessage(Integer TTL,Message message) {
        this.message = message;
        this.TTL=TTL;
    }
    public void startTime(Integer startTime) {
        this.startTime= startTime;
    }
    public void endTime(Integer endTime) {
        this.endTime=endTime;
    }
    public void disappearMessage() {
        if((endTime-startTime)>=TTL) {
           message.deleteThroughDisappear(startTime,endTime);
        }
    }

}


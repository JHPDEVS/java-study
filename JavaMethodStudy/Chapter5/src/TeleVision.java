public class TeleVision {
    int channel;
    int volume;
    boolean onOff;

    void print() {
        System.out.println("Channel : " + channel + " Volume : "  + volume);
    }

    int getChannel() {
        return channel;
    }

    int setChannel(int channel) {
        return this.channel = channel;
    }
}

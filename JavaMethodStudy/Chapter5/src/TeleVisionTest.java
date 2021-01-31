public class TeleVisionTest {
    
    public static void main(String[] args) {
        TeleVision tv = new TeleVision();
        tv.channel = 5;
        tv.volume = 100;

        tv.print();
        System.out.println(tv.getChannel());

        TeleVision tv2 = new TeleVision();
        tv2.setChannel(5);
        System.out.println(tv2.getChannel());
    }
}

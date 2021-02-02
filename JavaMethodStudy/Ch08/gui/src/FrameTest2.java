import javax.swing.*;

public class FrameTest2 extends JFrame{
    
    public FrameTest2() {
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CreateFrame");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new FrameTest2();
    }
}

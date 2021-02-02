import javax.swing.JFrame;

public class FrameTest {
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setTitle("title");
    }
}

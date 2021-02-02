import javax.swing.*;
import java.awt.*;
public class FrameButton extends JFrame{
    
    public FrameButton() {
        this.setSize(300,300);
        this.setTitle("My Button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JButton Jb = new JButton("Button");
        this.add(Jb);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jf = new FrameButton();
    }
}

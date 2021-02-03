import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class Draw extends JFrame {
    
    public Draw() {
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JLabel jlabel = new JLabel("무승부");
        jlabel.setFont(new Font("Serif",Font.BOLD,80));
        this.add(jlabel);
        this.setVisible(true);
    }

}

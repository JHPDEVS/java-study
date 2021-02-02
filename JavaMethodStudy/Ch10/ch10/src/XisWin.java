import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class XisWin extends JFrame {
    
    public XisWin() {
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        JLabel jlabel = new JLabel("X 승리");
        jlabel.setFont(new Font("Serif",Font.BOLD,80));
        this.add(jlabel);
    }

    public static void main(String[] args) {
        JFrame check = new XisWin();
    }
}

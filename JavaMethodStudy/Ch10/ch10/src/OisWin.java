import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class OisWin extends JFrame {
    
    public OisWin() {
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        JLabel jlabel = new JLabel("O 승리");
        jlabel.setFont(new Font("Serif",Font.BOLD,80));
        this.add(jlabel);
    }

    public static void main(String[] args) {
        JFrame check = new OisWin();
    }
}

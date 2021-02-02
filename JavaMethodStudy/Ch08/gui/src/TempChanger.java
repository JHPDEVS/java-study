import javax.swing.*;
import java.awt.event.*;

public class TempChanger extends JFrame implements ActionListener{
    JButton Jb = new JButton("변환");
    JTextField filed1 = new JTextField(20);
    JTextField filed2 = new JTextField(20);
    public TempChanger() {
        this.setSize(300,200);
        this.setTitle("온도변화기");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel l1 = new JLabel("화씨 온도");
        JLabel l2 = new JLabel("화씨 온도");

    
        panel.add(l1);
        panel.add(filed1);
        panel.add(l2);
        panel.add(filed2);
        panel.add(Jb);
        Jb.addActionListener(this);
        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jf = new TempChanger();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource().equals(Jb)) {
            String temp = filed1.getText();
            int Answer = Integer.parseInt(temp);
            double Answer2 = (Answer - 32) / 1.8;
            String filed2value = Double.toString(Answer2);
            filed2.setText(filed2value);
        }
    }
}

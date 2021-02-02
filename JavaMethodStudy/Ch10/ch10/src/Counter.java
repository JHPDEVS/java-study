import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame implements ActionListener{
    JButton bt1 = new JButton("Count++");
    JButton bt2 = new JButton("Count--");
    JLabel jlabel2 = new JLabel("0");
    public Counter() {
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Counter");

        this.setLayout(new FlowLayout());
        JLabel jlabel = new JLabel("Counter");
        jlabel2.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,100));
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        this.add(bt2);
        this.add(jlabel);
        this.add(jlabel2);
        this.add(bt1);
        this.setVisible(true);
    }   

    public static void main(String[] args) {
        JFrame jf = new Counter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource().equals(bt1)) {
            System.out.println("+버튼이 클릭됨");
            int jlabel2value = Integer.parseInt(jlabel2.getText()) +1;
            String jlable2valuetoString = Integer.toString(jlabel2value);
            jlabel2.setText(jlable2valuetoString);
        }
        if(e.getSource().equals(bt2)) {
            System.out.println("-버튼이 클릭됨");
            int jlabel2value = Integer.parseInt(jlabel2.getText()) -1;
            String jlable2valuetoString = Integer.toString(jlabel2value);
            jlabel2.setText(jlable2valuetoString);
        }
    }
}

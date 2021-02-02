import javax.swing.*;

public class RelativeButton extends JFrame{
    
    public RelativeButton() {
        this.setSize(300,200);
        this.setLayout(null);
        JButton bt1 = new JButton("Button1");
        JButton bt2 = new JButton("Button1");
        JButton bt3 = new JButton("Button1");

        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
        bt1.setBounds(50,50,20,20); // x, y , w, h
        bt2.setBounds(100,100,20,20);
        bt3.setBounds(0,0,20,20);
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jf =new RelativeButton();
    }
}

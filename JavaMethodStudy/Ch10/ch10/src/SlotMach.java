import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class SlotMach extends JFrame implements ActionListener{
    JButton bt = new JButton("스핀");
    JLabel[] jlabels = new JLabel[3];
    int count = 0;
    JLabel point = new JLabel("0");
    JLabel AnNai = new JLabel("숫자가 동일하면 점수가 올라갑니다");
    private int numbers[];


    public SlotMach() {
        numbers = new int[3];
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SlotMachine");
        for(int i=0;i<3;i++) {
            jlabels[i] = new JLabel(""+numbers[i]);
            jlabels[i].setFont(new Font("Serif",Font.BOLD|Font.ITALIC,100));
            jlabels[i].setBounds(100+i*50,50,100,100);
            panel.add(jlabels[i]);
        }
        bt.setBounds(130,150,100,50);
        bt.addActionListener(this);
        panel.add(bt);

        point.setBounds(300,10,200,50);
        point.setFont(new Font("Serif",Font.BOLD,30));
        panel.add(point);

        AnNai.setBounds(70,200,300,30);
        AnNai.setFont(new Font("Serif",Font.BOLD,15));
        panel.add(AnNai);

        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame Slot = new SlotMach();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource().equals(bt)){
            AnNai.setText("숫자가 동일하면 점수가 올라갑니다");
            System.out.println("button");
            for(int i=0;i<3;i++) {
                Random random = new Random();
                numbers[i] = random.nextInt(9);
                System.out.println(numbers[i]);
                jlabels[i].setText(Integer.toString(numbers[i]));
                
            }
            if(numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
                System.out.println("잭팟!!!");
                AnNai.setText("잭팟!!!!!!!!!!");
                count = count + 999;
                point.setText(Integer.toString(count));
                return;
            }
            if(numbers[0] == numbers[1]) {
                AnNai.setText("점수++");
                System.out.println("점수++");
                count++;
                point.setText(Integer.toString(count));
            }
            if(numbers[0] == numbers[2]) {
                AnNai.setText("점수++");
                System.out.println("점수++");
                count++;
                point.setText(Integer.toString(count));
            }
            if(numbers[1] == numbers[2]) {
                AnNai.setText("점수++");
                System.out.println("점수++");
                count++;
                point.setText(Integer.toString(count));
            }
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener{
    JButton[][] buttons = new JButton[3][3];
    JLabel jtext = new JLabel("O 턴입니다");
    private int turn;
    public TicTacToe() {
        Random rand = new Random();
        turn = rand.nextInt(2) ;
        System.out.println(turn);
        turn();
        jtext.setHorizontalAlignment(JLabel.CENTER);
        jtext.setFont(new Font(Font.SANS_SERIF,Font.BOLD,75));
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.setSize(200,200);
        panel2.setSize(300,300);
        panel2.setLayout(new GridLayout(3,3));
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                buttons[i][j] = new JButton("" );
                panel2.add(buttons[i][j]);
                buttons[i][j].setFont(new Font("Serif",Font.BOLD,100));
                buttons[i][j].addActionListener(this);
                buttons[i][j].setOpaque(true);
            }
        }
        panel1.add(jtext);
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new TicTacToe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(e.getSource().equals(buttons[i][j])) {
                    if(buttons[i][j].getText().equals("")) {

                        if(turn == 0) {
                            buttons[i][j].setText("o");
                            buttons[i][j].setForeground(Color.red);
                            System.out.println("o표시");
                            isWin();
                            turn++;
                        } else {
                            buttons[i][j].setText("x");
                            buttons[i][j].setForeground(Color.blue);
                            System.out.println("x표시");
                            isWin();
                            turn--;
                        }
                    }
                }
            }
        }
        turn();
    }
    private void turn() {
        if(turn==0) {
            jtext.setText("O턴입니다");
        } else {
            jtext.setText("X턴입니다");
        }
    }
    private void isWin() {
         // System.out.println("승리체크");
        // ---------------------------------------------- 가로 , 세로 승리조건

        //------------------------------- 가로
        for(int i=0; i<3;i ++) {
            if(buttons[i][0].getText().equals("o") && buttons[i][1].getText().equals("o") && buttons[i][2].getText().equals("o")){
                buttons[i][0].setBackground(new Color(25,25,25));
                buttons[i][1].setBackground(new Color(25,25,25));
                buttons[i][2].setBackground(new Color(25,25,25));
                buttons[i][0].setForeground(new Color(255,255,255));
                buttons[i][1].setForeground(new Color(255,255,255));
                buttons[i][2].setForeground(new Color(255,255,255));
                JFrame jf = new OisWin();
            }
            if(buttons[i][0].getText().equals("x") && buttons[i][1].getText().equals("x") && buttons[i][2].getText().equals("x")){
                buttons[i][0].setBackground(new Color(25,25,25));
                buttons[i][1].setBackground(new Color(25,25,25));
                buttons[i][2].setBackground(new Color(25,25,25));
                buttons[i][0].setForeground(new Color(255,255,255));
                buttons[i][1].setForeground(new Color(255,255,255));
                buttons[i][2].setForeground(new Color(255,255,255));
                JFrame jf = new XisWin();
            }

            //------------------------ 세로
            if(buttons[0][i].getText().equals("o") && buttons[1][i].getText().equals("o") && buttons[2][i].getText().equals("o")){
                buttons[0][i].setBackground(new Color(25,25,25));
                buttons[1][i].setBackground(new Color(25,25,25));
                buttons[2][i].setBackground(new Color(25,25,25));
                buttons[0][i].setForeground(new Color(255,255,255));
                buttons[1][i].setForeground(new Color(255,255,255));
                buttons[2][i].setForeground(new Color(255,255,255));
                JFrame jf = new OisWin();
            }
            if(buttons[0][i].getText().equals("x") && buttons[1][i].getText().equals("x") && buttons[2][i].getText().equals("x")){
                buttons[0][i].setBackground(new Color(25,25,25));
                buttons[1][i].setBackground(new Color(25,25,25));
                buttons[2][i].setBackground(new Color(25,25,25));
                buttons[0][i].setForeground(new Color(255,255,255));
                buttons[1][i].setForeground(new Color(255,255,255));
                buttons[2][i].setForeground(new Color(255,255,255));
                JFrame jf = new XisWin();
            }
        }

        // ---------------------------------------------- 대각선 승리 조건
        if(buttons[0][0].getText().equals("o") && buttons[1][1].getText().equals("o") && buttons[2][2].getText().equals("o")) {
            buttons[0][0].setBackground(new Color(25,25,25));
            buttons[1][1].setBackground(new Color(25,25,25));
            buttons[2][2].setBackground(new Color(25,25,25));
            buttons[0][0].setForeground(new Color(255,255,255));
            buttons[1][1].setForeground(new Color(255,255,255));
            buttons[2][2].setForeground(new Color(255,255,255));
            JFrame jf = new OisWin();
        }
        if(buttons[0][0].getText().equals("x") && buttons[1][1].getText().equals("x") && buttons[2][2].getText().equals("x")) {
            buttons[0][0].setBackground(new Color(25,25,25));
            buttons[1][1].setBackground(new Color(25,25,25));
            buttons[2][2].setBackground(new Color(25,25,25));
            buttons[0][0].setForeground(new Color(255,255,255));
            buttons[1][1].setForeground(new Color(255,255,255));
            buttons[2][2].setForeground(new Color(255,255,255));
            JFrame jf = new XisWin();
        }

        if(buttons[0][2].getText().equals("o") && buttons[1][1].getText().equals("o") && buttons[2][0].getText().equals("o")) {
            buttons[0][2].setBackground(new Color(25,25,25));
            buttons[1][1].setBackground(new Color(25,25,25));
            buttons[2][0].setBackground(new Color(25,25,25));
            buttons[0][2].setForeground(new Color(255,255,255));
            buttons[1][1].setForeground(new Color(255,255,255));
            buttons[2][0].setForeground(new Color(255,255,255));
            JFrame jf = new OisWin();
        }
        if(buttons[0][2].getText().equals("x") && buttons[1][1].getText().equals("x") && buttons[2][0].getText().equals("x")) {
            buttons[0][2].setBackground(new Color(25,25,25));
            buttons[1][1].setBackground(new Color(25,25,25));
            buttons[2][0].setBackground(new Color(25,25,25));
            buttons[0][2].setForeground(new Color(255,255,255));
            buttons[1][1].setForeground(new Color(255,255,255));
            buttons[2][0].setForeground(new Color(255,255,255));
            JFrame jf = new XisWin();
        }
        //------------------------------------------------
    }
}

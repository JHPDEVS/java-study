import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener{
    JButton[][] buttons = new JButton[3][3];
    private int turn = 0;
    public TicTacToe() {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,3));
        
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                buttons[i][j] = new JButton("" );
                this.add(buttons[i][j]);
                buttons[i][j].setFont(new Font("Serif",Font.BOLD,100));
                buttons[i][j].addActionListener(this);
            }
        }

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
                            System.out.println("o표시");
                            turn++;
                        } else {
                            buttons[i][j].setText("x");
                            System.out.println("x표시");
                            turn--;
                        }
                    }
                }
            }
        }

       isWin();
    }

    public void isWin() {
         // System.out.println("승리체크");
        // ---------------------------------------------- 가로 , 세로 승리조건
        for(int i=0; i<3;i ++) {
            if(buttons[i][0].getText().equals("o") && buttons[i][1].getText().equals("o") && buttons[i][2].getText().equals("o")){
                JFrame jf = new OisWin();
            }
            if(buttons[i][0].getText().equals("x") && buttons[i][1].getText().equals("x") && buttons[i][2].getText().equals("x")){
                JFrame jf = new XisWin();
            }

            if(buttons[0][i].getText().equals("o") && buttons[1][i].getText().equals("o") && buttons[2][i].getText().equals("o")){
                JFrame jf = new OisWin();
            }
            if(buttons[0][i].getText().equals("x") && buttons[1][i].getText().equals("x") && buttons[2][i].getText().equals("x")){
                JFrame jf = new XisWin();
            }
        }

        // ---------------------------------------------- 대각선 승리 조건
        if(buttons[0][0].getText().equals("o") && buttons[1][1].getText().equals("o") && buttons[2][2].getText().equals("o")) {
            JFrame jf = new OisWin();
        }
        if(buttons[0][0].getText().equals("x") && buttons[1][1].getText().equals("x") && buttons[2][2].getText().equals("x")) {
            JFrame jf = new XisWin();
        }

        if(buttons[0][2].getText().equals("o") && buttons[1][1].getText().equals("o") && buttons[2][0].getText().equals("o")) {
            JFrame jf = new OisWin();
        }
        if(buttons[0][2].getText().equals("x") && buttons[1][1].getText().equals("x") && buttons[2][0].getText().equals("x")) {
            JFrame jf = new XisWin();
        }
        //------------------------------------------------
    }
}

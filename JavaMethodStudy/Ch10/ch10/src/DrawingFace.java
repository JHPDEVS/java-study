import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class DrawingFace extends JFrame{
    
    public DrawingFace() {
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("눈사람 얼굴");
        this.add(new MyDrawingPanel2());
        this.setVisible(true);
    }

public static void main(String[] args) {
    JFrame jf = new DrawingFace();
}
class MyDrawingPanel2 extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            // TODO Auto-generated method stub
            super.paintComponent(g);
            g.setColor(Color.yellow);
            g.fillOval(20, 30, 200, 200);

            g.setColor(Color.black);
            g.drawArc(50,80,50,50,180,180);
            g.drawArc(140, 80, 50, 50, 180, 180);
            g.drawArc(70, 140, 100, 70, -180, -180);
        }
}
}
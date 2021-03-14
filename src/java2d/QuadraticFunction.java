/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2d;

/**
 *
 * @author 박주형
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.*;

import java.awt.geom.*;
import java.awt.event.*;
import java.awt.*;

public class QuadraticFunction extends JPanel implements ActionListener {

    private JTextField aField, bField, cField;
    private double aTextValue = 1.0 , bTextValue = -5.0 , cTextValue = 6.0;

        public QuadraticFunction() {
            aField = new JTextField("1.0" , 10);
            bField = new JTextField("-5,0",10);
            cField = new JTextField("6.0",10);
            
            this.add(aField);
            this.add(bField);
            this.add(cField);
    
            JButton drawButton = new JButton("버튼");
    
            this.add(drawButton);
            drawButton.addActionListener(this);
            
        }
    
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.add(new QuadraticFunction());
            frame.setTitle("Java Animation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600,600);
            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            System.out.println("performed");
            aTextValue = Double.parseDouble(aField.getText());
            bTextValue = Double.parseDouble(aField.getText());
            cTextValue = Double.parseDouble(aField.getText());
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            // TODO Auto-generated method stub
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.drawLine(100, 200, 500, 200);
            g2.drawLine(300, 0, 300, 400);

            g2.setColor(Color.red);

            for(int i=-20; i<20; i++) {
                int x= i;
                int y = (int) (aTextValue * x * x - bTextValue * x +cTextValue);
                Shape s = new Ellipse2D.Float(300+x-2, 200-y+2, 4, 4);
                g2.fill(s);
            }
        }
}



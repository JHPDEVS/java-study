/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2d;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author 박주형
 */
public class Capture extends JFrame implements ActionListener{

    BufferedImage imageOrg;
    JPanel imagePanel;
    JTextField x, y;
    int xValue =0;
    int yValue = 0;
    JButton button ,button2; // button : capture , button2 :save
    public Capture() {
        this.setSize(new Dimension(500,300));
        this.setTitle("Screen Capture Program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        imagePanel = new JPanel() {
          public void paintComponent(Graphics g) {
                    g.drawImage(imageOrg, 0, 0,xValue,yValue ,this);
                    System.out.println("paintcocmponent 호출");
                }
        };
        
        JPanel buttonPanel = new JPanel();
        button = new JButton("캡쳐");
        button2 = new JButton("save");
        x = new JTextField("100",5);
        y = new JTextField("100",5);
        
        buttonPanel.add(button);
        buttonPanel.add(button2);
        buttonPanel.add(x);
        buttonPanel.add(y);
        button.addActionListener(this);
        button2.addActionListener(this);
        this.add(buttonPanel,BorderLayout.PAGE_END);
        this.add(imagePanel);
        
    }    
    
    public static void main(String[] args) {
        JFrame hello = new Capture();
        hello.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button)) {
        xValue = Integer.parseInt(x.getText());
        yValue = Integer.parseInt(y.getText());
        try {
            Robot robot = new Robot();
            final BufferedImage image= robot.createScreenCapture(new Rectangle(xValue,yValue));
            image.flush();
            imageOrg = image;
            imagePanel.repaint();
        } catch (AWTException ex) {
            Logger.getLogger(Capture.class.getName()).log(Level.SEVERE, null, ex);
        }
            this.setSize(new Dimension(xValue,yValue));
        }
        
        else if (e.getSource().equals(button2)) {
            try {
                ImageIO.write(imageOrg, "jpg", new File("newPic.jpg"));
                System.out.println("파일저장이 완료되었습니다");
            } catch (IOException ex) {
                Logger.getLogger(Capture.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("파일 저장실패");
            }
        }
    }
}

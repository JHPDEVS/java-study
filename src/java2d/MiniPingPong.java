/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author 박주형
 */

public class MiniPingPong extends JPanel implements KeyListener{
    private Ball ball;
    protected Racquet racquet1;
    protected Racquet racquet2;
    protected JLabel label1, label2 , label3;
    
    public MiniPingPong() {
        ball = new Ball(this,Color.red);
        this.setBackground(Color.green);
        racquet1 = new Racquet(this,-10,200,Color.red);
        racquet2 = new Racquet(this,675,200,Color.blue);
        this.setFocusable(true);
        this.addKeyListener(this);
        label1 = new JLabel("0");
        label2 = new JLabel("0");
        label3 = new JLabel(" : ");
        label1.setFont(new Font("bold",40,40));
        label2.setFont(new Font("bold",40,40));
        label3.setFont(new Font("bold",40,40));
        this.add(label1);
        this.add(label3);
        this.add(label2);
        this.setLayout(new FlowLayout());
    }
    

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        ball.draw(g2d);
        racquet1.draw(g2d);
        racquet2.draw(g2d);
    }
    void move() {
        ball.move();
        racquet1.move();
        racquet2.move2();
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        racquet1.keyPressed(e);
        racquet2.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        racquet1.keyReleased(e);
        racquet2.keyReleased(e);
    }
    
    public static void main(String[] args) {
        MiniPingPong game = new MiniPingPong();
        JFrame hello = new JFrame();
        hello.setSize(700,500);
        hello.add(game);
        hello.setVisible(true);
        hello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(true) {
            game.move();
            game.repaint();
            try {
                Thread.sleep(5);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Ball {
    private static final int RADIUS = 20;
    private int x = 0, y =0, xSpeed = 1, ySpeed = 1;
    private MiniPingPong game;
    private Color color;
    
    public Ball(MiniPingPong game, Color color) {
        this.game = game;
        this.color = color;
    }
    
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x, y, 2 * RADIUS,  2 *RADIUS);
    }
    
    void move() {
        if(x + xSpeed < 0 ) { // 왼쪽 벽에 닿았을때
            xSpeed = 3;
            int y = Integer.parseInt(game.label2.getText());
            game.label2.setText(String.valueOf(++y));
        }
        if(x + xSpeed > game.getWidth() - 2 * RADIUS) { // 우측 벽에 닿았을때
            xSpeed = -3;
            int x = Integer.parseInt(game.label1.getText());
            game.label1.setText(String.valueOf(++x));
        }
        if(y + ySpeed < 0 ) {
            ySpeed = 3;
        }
        if(y + ySpeed> game.getHeight() -2 * RADIUS) {
            ySpeed = -3;
        }
        if(collision()) {
            xSpeed = - xSpeed;
        }
        
        x += xSpeed;
        y += ySpeed;
    }
    public Rectangle getBounds() {
        return new Rectangle(x,y,(int) 15/10*RADIUS, (int) 15/10* RADIUS);
    }
    private boolean collision() {
   return game.racquet1.getBounds().intersects(getBounds()) || game.racquet2.getBounds().intersects(getBounds());
   
//    Rectangle r1 = game.racquet1.getBounds();
//    Rectangle r2 = game.racquet2.getBounds();
//    Rectangle myr = getBounds();
//    boolean r1c = r1.intersects(myr);
//    boolean r2c = r2.intersects(myr);
//    
//    return r1c || r2c;
    }
    
    void updatePoint() {
        
    }
}

class Racquet {
    private static final int WIDTH = 20;
    private static final int HEIGHT = 80;
    private int x = 0 , y=0;
    private int xSpeed = 0;
    private int ySpeed = 0;
    private int ySpeed2 = 0;
    private MiniPingPong game;
    private Color color;
    
    public Racquet(MiniPingPong game,int x,int y,Color color) {
        this.game = game;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    
     public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }
     
    public void move() {
        if (y + ySpeed > 0 && y + ySpeed <game.getHeight() - HEIGHT) {
           y+= ySpeed;
        }
    }
    
    public void move2() {
        if (y + ySpeed2 > 0 && y + ySpeed2 <game.getHeight() - HEIGHT) {
           y+= ySpeed2;
        }
    }
    
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            ySpeed = -3;
            System.out.println("위쪽 키 타입핑됨");
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            ySpeed = 3;
            System.out.println("아래쪽 키 타입됨");
        }
        
        else if(e.getKeyCode() == KeyEvent.VK_W) {
            ySpeed2 = -3;
            System.out.println("2p w 타이핑");
        }
        else if(e.getKeyCode() == KeyEvent.VK_S) {
            ySpeed2 = 3;
        }
    }

    public void keyReleased(KeyEvent e) {
        ySpeed = 0;
        ySpeed2 = 0;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x,y ,15/10*WIDTH, 15/10*HEIGHT);
    }
}
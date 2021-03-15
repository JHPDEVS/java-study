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
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;

public class PizzaDemo extends JFrame {

    private JLabel hello;
    private JButton okButton , cancelButton;
    private JTextField sumField;
    private int  temp1, temp2 , temp3;
    
    public PizzaDemo() {
        JPanel panel = new TypePanel();
        JPanel toping = new TopingPanel();
        JPanel size = new SizePanel();
        JPanel order = new southPanel();
        JPanel helloPanel = new JPanel();

        hello = new JLabel("자바 피자에 오신것을 환영합니다");
        helloPanel.add(hello);
        this.add(panel,BorderLayout.WEST);
        this.add(helloPanel,BorderLayout.NORTH);
        this.add(toping , BorderLayout.CENTER);
        this.add(size , BorderLayout.EAST);
        this.add(order , BorderLayout.SOUTH);
        this.setSize(500, 200);
    }
    class TypePanel extends JPanel implements ChangeListener {
        private JRadioButton combo, potato,bulgogi;
        private ButtonGroup btnGroup;
        public TypePanel() {
            this.setLayout(new GridLayout(3,1));
            combo = new JRadioButton("콤보",true);
            potato = new JRadioButton("포테이토");
            bulgogi = new JRadioButton("불고기");
            combo.addChangeListener(this);
            potato.addChangeListener(this);
            bulgogi.addChangeListener(this);

            btnGroup = new ButtonGroup();
            btnGroup.add(combo);
            btnGroup.add(potato);
            btnGroup.add(bulgogi);

            this.setBorder(BorderFactory.createTitledBorder("종류"));
            this.add(combo);
            this.add(bulgogi);
            this.add(potato);

        }
        @Override
        public void stateChanged(ChangeEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource().equals(combo)) {
                temp1 = 1;
            }

            if(e.getSource().equals(bulgogi)) {
                temp1 = 2;
            }

            if(e.getSource().equals(potato)) {
                temp1 = 3;
            }
        }

    }

    class TopingPanel extends JPanel implements ChangeListener {

        private JRadioButton pimang , cheese , peperoni , bacon;
        private ButtonGroup btnGroup;

        public TopingPanel() {
            this.setLayout(new GridLayout(4,1));
            pimang = new JRadioButton("피망", true);
            cheese = new JRadioButton("치즈");
            peperoni = new JRadioButton("페페로니");
            bacon = new JRadioButton("베이컨");

            pimang.addChangeListener(this);
            cheese.addChangeListener(this);
            peperoni.addChangeListener(this);
            bacon.addChangeListener(this);

            btnGroup = new ButtonGroup();
            btnGroup.add(pimang);
            btnGroup.add(cheese);
            btnGroup.add(peperoni);
            btnGroup.add(bacon);

            this.add(pimang);
            this.add(cheese);
            this.add(peperoni);
            this.add(bacon);
            this.setBorder(BorderFactory.createTitledBorder("추가토핑"));
            
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource().equals(pimang)) {
                temp2 = 1;
            }

            if(e.getSource().equals(cheese)) {
                temp2 = 2;
            }

            if(e.getSource().equals(peperoni)) {
                temp2 = 3;
            }
            if(e.getSource().equals(bacon)) {
                temp2 = 4;
            }

        }

    }

    class SizePanel extends JPanel implements ChangeListener {
        private JRadioButton small , medium , large;
        private ButtonGroup btnGroup;
        public SizePanel() {
         this.setLayout(new GridLayout(3,1));
         small = new JRadioButton("small", true);
         medium = new JRadioButton("Medium");
         large = new JRadioButton("large");
         small.addChangeListener(this);
         medium.addChangeListener(this);
         large.addChangeListener(this);    


         this.add(small);
         this.add(medium);
         this.add(large);

         btnGroup = new ButtonGroup();
         btnGroup.add(small);
         btnGroup.add(medium);
         btnGroup.add(large);

         this.setBorder(BorderFactory.createTitledBorder("크기"));
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource().equals(small)) {
                temp3 = 1;
            }
            if(e.getSource().equals(medium)) {
                temp3 = 2;
            }
            if(e.getSource().equals(large)) {
                temp3 = 3;
            }
        }

    }
    
    class southPanel extends JPanel implements ActionListener {

        public southPanel() {
            okButton = new JButton("주문");
            cancelButton = new JButton("취소");
            sumField = new JTextField(10);
            okButton.addActionListener(this);
            cancelButton.addActionListener(this);
            this.add(okButton);
            this.add(cancelButton);
            this.add(sumField);
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource().equals(okButton)) {
                System.out.println("activity");
                sumField.setText("1 : " +temp1 + " 2 " + temp2 + " 3 " + temp3 );
            }
            if(e.getSource().equals(cancelButton)) {
                System.out.println("취소");
                temp1 = 0;
                temp2 = 0;
                temp3 = 0;
                sumField.setText(" 1 :" +temp1 + "2 :" + temp2 + "3 :" + temp3 );
            }
        }

        
    }


    public static void main(String[] args) {
        JFrame pizza = new PizzaDemo();
        pizza.setVisible(true);

    }
    
}


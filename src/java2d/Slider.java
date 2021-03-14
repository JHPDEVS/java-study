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
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BorderLayout;
import java.awt.event.*;

public class Slider extends JFrame implements ChangeListener {

    private JSlider slider;
    private JButton button;
    private final static int init_value = 15;
    private int value;
    public Slider() {
        this.setTitle("Slider");
        this.setSize(300,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("슬라이더를 움직여보세요" ,SwingConstants.CENTER);

        slider = new JSlider(0,30 ,init_value);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.addChangeListener(this);

        panel.add(label);
        panel.add(slider);

        button = new JButton("버튼");
        button.setSize(value * 10,value*10);
        ImageIcon icon = new ImageIcon("IMG/1.png");
        button.setIcon(icon);
        panel.add(button);

        this.add(panel);
    }


    public static void main(String[] args) {
        JFrame Slider = new Slider();
        Slider.setVisible(true);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
        JSlider source = (JSlider) e.getSource();
        value = source.getValue();
        button.setSize(value * 10,value*10);
    }
    
}


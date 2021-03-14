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
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class ComboBox extends JFrame implements ActionListener {
    
    private JLabel animalName;
    private JComboBox animalCombo;
    private String animalValue;
    private ImageIcon icon;
    private String animals[] = {"강아지","고양이","사자"};

    public ComboBox() {
        this.setSize(500,500);
        this.setTitle("title");
        animalName = new JLabel();
        animalCombo = new JComboBox(animals);
        this.add(animalCombo,BorderLayout.NORTH);
        this.add(animalName,BorderLayout.SOUTH);
        animalCombo.addActionListener(this);
        initImage();
    }
    public static void main(String[] args) {
        JFrame combo = new ComboBox();
        combo.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        animalValue = (String) animalCombo.getSelectedItem();
        System.out.println(animalValue);

        if(animalValue.equals("강아지")) {
            System.out.println("아이콘 강아지로");
            icon = new ImageIcon("Img/1.png");
            animalName.setIcon(icon);
        } else if(animalValue.equals("고양이")) {
            System.out.println("아이콘 고양이로");
            icon = new ImageIcon("Img/1.png");
            animalName.setIcon(icon);
        } else {
            System.out.println("아이콘 사자");
            icon = new ImageIcon("Img/space2.jpg");
            animalName.setIcon(icon);
        }
    }

    private void initImage() {
        animalValue = "강아지";
        // label 아이콘 강아지로
    
        icon = new ImageIcon("Img/1.png");
        animalName.setIcon(icon);
    }
}

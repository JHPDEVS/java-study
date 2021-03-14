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

import java.awt.BorderLayout;
import java.awt.event.*
;
public class TextArea extends JFrame implements ActionListener {

    private JTextField txtField;
    private JTextArea txtArea;

    public TextArea() {
        txtField = new JTextField(30);
        txtArea = new JTextArea(10,30);

        this.add(txtField , BorderLayout.NORTH);
        this.add(txtArea , BorderLayout.SOUTH);
        txtField.addActionListener(this);
        this.setTitle("title");

        JScrollPane scroll = new  JScrollPane(txtArea);
        this.add(scroll,BorderLayout.CENTER);
        this.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String value = txtField.getText();
        txtArea.append(value + "\n");

        txtField.selectAll();
        txtArea.setCaretPosition(txtArea.getDocument().getLength()); // 맨 아래로 스크롤한다

        if(value.equals("종료")) {
            System.exit(1);
        }
    }
    
    public static void main(String[] args) {
        TextArea txt = new TextArea();
        txt.setVisible(true);
    }
}


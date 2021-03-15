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
import java.awt.event.*;
import java.io.File;

public class FileChooserDemo extends JFrame implements ActionListener{
    private JButton openBtn , saveBtn;
    JFileChooser fileChooser;

    public FileChooserDemo() {
        this.setTitle("title");
        this.setSize(200,200);
        JPanel hello = new JPanel();
        JLabel label = new JLabel("파일 선택기 컴포넌트입니다");
        openBtn = new JButton("열기");
        saveBtn = new JButton("저장");
        hello.add(label);
        hello.add(openBtn);
        hello.add(saveBtn);
        fileChooser = new JFileChooser();
        this.add(hello);
        openBtn.addActionListener(this);
        saveBtn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource().equals(openBtn)) {
            int returnval = fileChooser.showOpenDialog(this);
            if( returnval == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                System.out.println("open" + file.getAbsolutePath());
            } else {
                System.out.println("파일 열기 취소됨");
            }
        }

        if(e.getSource().equals(saveBtn)) {
            int returnval = fileChooser.showSaveDialog(this);
            if( returnval == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                System.out.println("save" + file.getAbsolutePath());
            } else {
                System.out.println("파일 저장 실패");
            }
        }
    }
    public static void main(String[] args) {
        JFrame FileChooser = new FileChooserDemo();
        FileChooser.setVisible(true);
    }    
}


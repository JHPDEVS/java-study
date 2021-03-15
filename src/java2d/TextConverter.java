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
import java.awt.*;
import java.awt.event.*;

public class TextConverter extends JFrame implements ActionListener {
    private JTextArea in, out;
    private JButton convert , cancel;

    public TextConverter() {
        this.setTitle("Translate");


        in = new JTextArea(10,14);
        out = new JTextArea(10,14);

        in.setLineWrap(true); // 자동 줄 바꿈
        out.setLineWrap(true); // 자동 줄 바꿈
        out.setEditable(false); // 편집 불가

        JPanel textAreaPanel = new JPanel(new GridLayout(1,2,20,20));
        textAreaPanel.add(in);
        textAreaPanel.add(out);

        convert = new JButton("변환");
        cancel = new JButton("취소");
        convert.addActionListener(this);
        cancel.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(convert);
        buttonPanel.add(cancel);

        JPanel MainPanel = new JPanel(new BorderLayout(10,10));
        MainPanel.add(textAreaPanel, BorderLayout.CENTER);
        MainPanel.add(buttonPanel,BorderLayout.SOUTH);

        this.setLayout((new FlowLayout(FlowLayout.CENTER,20,20)));
        this.add(MainPanel);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        /* 
            변환 버튼이 클릭되었다면
            좌측 textArea (textIn)의 텍스트를 읽어서
            영어로 변환하고 그 변환된 결과를
            우측 textArea (textout) 에 append

            취소 버튼이 클릭되었다면
            우측을 빈 문자열로 설정
        */
        if(e.getSource().equals(convert)) {
            //out.append(toEnglish(in.getText()));

            String str= in.getText();
            String result = toEnglish(str);
            out.setText(result);
        } 

        if(e.getSource().equals(cancel)) {
            out.setText(" ");
        }
    }

    private String toEnglish(String korean) {
        /*
            korean 문자열을 영어로 변환해서 반환
            텍스트 >= text
            영어 => english
        */
        String result = null;
        result = korean.replace("텍스트", " text ");
        result = result.replace("영어", " english ");
        return result;
    }
    public static void main(String[] args) {
        JFrame text = new TextConverter();
        text.setVisible(true);
    }
}


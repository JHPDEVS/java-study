import java.awt.GraphicsEnvironment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FontTest {
     static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    public static void main(String[] args) {
        String[] fontFamilies = ge.getAvailableFontFamilyNames();

        for(String s : fontFamilies) {
            System.out.println(s);
        }

        Font font = new Font("MS PMincho", Font.BOLD | Font.ITALIC,30);
        JLabel label = new JLabel("hello");
        label.setFont(font);

        JFrame frame = new JFrame();
        frame.add(label,BorderLayout.NORTH);
        frame.setSize(300,200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

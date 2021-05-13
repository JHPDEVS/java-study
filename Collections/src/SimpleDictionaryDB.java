import javax.swing.*;

import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.*;      // �Է¹��� �ܾ �ؽ�Ʈ�� ����

public class SimpleDictionaryDB extends JPanel implements ActionListener {            // �г� ��� , �̺�Ʈ ������ 
   /*
    * �ܾ� �Է� ������ �ִ� JTextField
    * �˻���ư , �߰���ư , �ܾ��� ������ ���� �ڷᱸ���� Map ��ü
    */
   private JTextField inputField = new JTextField(30);    // ������� ���� , 30Į�� 
   private JButton searchBtn = new JButton("�˻�");
   private JButton addBtn = new JButton("�߰�");
   private String value , value2;
   // Map ��ü�� �ܾ��� ���� ����Ҳ���.
   // <Key, value> ������ ����. key �� �ѱ۴ܾ� , value�� �����Ǵ� ����ܾ�.
   private Map<String, String> dict = new HashMap<>();
   
   
   public SimpleDictionaryDB() {                        // ������ ����
      // Panel �� �⺻ ���̾ƿ� : FlowLayout    ( �� �帣�� ��� ���� ���̴°� )
      this.add(inputField);
      this.add(searchBtn);
      this.add(addBtn);
      
      // ssearchBtn , addBtn �� Ŭ�� �̺�Ʈ�� �߻����� �� ó���� �����ʸ� �������� !!!
      searchBtn.addActionListener(this);               // ��ü�� �̺�Ʈ ó�� 
      addBtn.addActionListener(this);
      
      
      this.setPreferredSize(new Dimension(600, 50));
      
   
   
   }
   private void getSearch() {
	   Connection con = null;
       PreparedStatement pstmt = null;   
       ResultSet rs = null;
       try {
           Class.forName("org.mariadb.jdbc.Driver");
           
           con = DriverManager.getConnection(
               "jdbc:mariadb://eatx.shop:3307/study",
               "wdj",
               "wdj123");
                       
           pstmt = con.prepareStatement("select * from `dic` WHERE `word1` = ?");
           pstmt.setString(1, inputField.getText());
           rs = pstmt.executeQuery();
           if(rs.next()) {
               String key = rs.getString("word1");
               String value = rs.getString("word2");
               dict.put(key, value);
               System.out.println(dict.get(key));
               System.out.println(key + value);
               if (value != null) {   // �����Ǵ� �ܾ �ִ� ���
                  JOptionPane.showMessageDialog(this, value, key, JOptionPane.INFORMATION_MESSAGE);     // this = SimpleDictionary ��ü
               }
           } else {            // �����Ǵ� �ܾ ���� ���
               JOptionPane.showMessageDialog(this, "�ܾ ã�� �� �����ϴ�", value, JOptionPane.ERROR_MESSAGE);
            }
       } catch(Exception e) {
           e.printStackTrace();
       } finally {
           try {
               if(rs != null) {
                   rs.close(); // ���� ����
               }
               
               if(pstmt != null) {
                   pstmt.close(); // ���û��������� ȣ�� ��õ
               }
           
               if(con != null) {
                   con.close(); // �ʼ� ����
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }

      

   @Override
   public void actionPerformed(ActionEvent e) {
      String key = inputField.getText();
      if (key.trim().length() == 0)       // key�� �����̸�(�Է����� ������) return ���� = �Էµ��� �ʰ� (����) 
         return;               
      // TODO Auto-generated method stub
      if (e.getSource() == searchBtn) {   // �̺�Ʈ�� �߻��� ��ü�� return ���ش�.
         /*
          * �Էµ� �ܾ ���� 
          * �� �ܾ Key ������ ������ �����Ǵ� �� ��Ʈ���� �ִ��� �˻�  => dict.get(�ܾ�);  
          * �� �ܾ� �����Ǵ� ���� ������ JOptionPane.showMessageDialong() �޼��� ȣ���Ͽ� �����Ǵ� ���� �����ش�  
          * �����Ǵ� ���� ������ = (Null�̸�) JOptionPane.showMessageDialog() �޼��带 ȣ���Ͽ�  '�ܾ ã�� �� �����ϴ�'��� ������ش�.
          * inputField�� �� ���ڿ��� ����...
          */    
    	  getSearch();
     
         
      } else if (e.getSource() == addBtn) {
         /*
          * �Էµ� �ܾ ����
          * String value = JOptionPane.showInputDialog() �޼��带 ȣ���Ͽ� �߰��� ���ܾ �Է� �޴´�.
          * dict.put(�Է��ʵ忡 �Էµ� �ܾ� , inputDialog�� �Էµ� �ܾ�);      // �Էµ� �ܾ ����
          * inputField�� �� ���ڿ��� ���� ��
          */
         String value = JOptionPane.showInputDialog(this, key + "�� �����Ǵ� ���ܾ �Է��ϼ���.");         // ���ڿ� ������ �Էµ� �ܾ �޴´�.
         
         if(value.trim().length() == 0) return;
         dict.put(key, value);
         
         try {
			addToDB(key, value);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      
      }
   
      inputField.setText("");
      
   }
   
   // db�� �����
   private void addToDB(String key, String value) throws ClassNotFoundException {
	   Connection con = null;
       PreparedStatement pstmt = null;   
       ResultSet rs = null;
       
       

       try {
    	   Class.forName("org.mariadb.jdbc.Driver");
           con = DriverManager.getConnection(
               "jdbc:mariadb://eatx.shop:3307/study",
               "wdj",
               "wdj123");
                       
           pstmt = con.prepareStatement("INSERT INTO `dic`(`word1`,`word2`) VALUES (?,?)");
           pstmt.setString(1, key);
           pstmt.setString(2, value);
           rs = pstmt.executeQuery();
             
           if(pstmt.executeUpdate()!=0) {
        	   JOptionPane.showMessageDialog(this, value, value + "�ܾ �߰��Ǿ����ϴ�", JOptionPane.INFORMATION_MESSAGE);
           } else {
        	   JOptionPane.showMessageDialog(this, "�ܾ �߰��� �� �����ϴ�", value, JOptionPane.ERROR_MESSAGE);
           }
       }
       catch (SQLException ex) {
       }
   }
   
   public static void main(String[] args) {
      // �������� �־�� �����
      JFrame frame = new JFrame();
      SimpleDictionaryDB dictPanel = new SimpleDictionaryDB();    // SimpleDictionary ��ü ����
      frame.add(dictPanel);
      frame.setTitle("My Korean-English Dictionary DB version");
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.pack();
      frame.setResizable(false);
      
      
   }





}
import javax.swing.*;

import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.*;      // 입력받은 단어를 텍스트로 저장

public class SimpleDictionaryDB extends JPanel implements ActionListener {            // 패널 상속 , 이벤트 리스너 
   /*
    * 단어 입력 받을수 있는 JTextField
    * 검색버튼 , 추가버튼 , 단어장 구현을 위한 자료구조로 Map 객체
    */
   private JTextField inputField = new JTextField(30);    // 멤버변수 생성 , 30칼럼 
   private JButton searchBtn = new JButton("검색");
   private JButton addBtn = new JButton("추가");
   private String value , value2;
   // Map 객체를 단어장 구현 사용할꺼다.
   // <Key, value> 쌍으로 저장. key 는 한글단어 , value는 대응되는 영어단어.
   private Map<String, String> dict = new HashMap<>();
   
   
   public SimpleDictionaryDB() {                        // 생성자 생성
      // Panel 의 기본 레이아웃 : FlowLayout    ( 물 흐르는 대로 갖다 붙이는것 )
      this.add(inputField);
      this.add(searchBtn);
      this.add(addBtn);
      
      // ssearchBtn , addBtn 에 클릭 이벤트가 발생했을 때 처리할 리스너를 지정하자 !!!
      searchBtn.addActionListener(this);               // 객체에 이벤트 처리 
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
               if (value != null) {   // 대응되는 단어가 있는 경우
                  JOptionPane.showMessageDialog(this, value, key, JOptionPane.INFORMATION_MESSAGE);     // this = SimpleDictionary 객체
               }
           } else {            // 대응되는 단어가 없는 경우
               JOptionPane.showMessageDialog(this, "단어를 찾을 수 없습니다", value, JOptionPane.ERROR_MESSAGE);
            }
       } catch(Exception e) {
           e.printStackTrace();
       } finally {
           try {
               if(rs != null) {
                   rs.close(); // 선택 사항
               }
               
               if(pstmt != null) {
                   pstmt.close(); // 선택사항이지만 호출 추천
               }
           
               if(con != null) {
                   con.close(); // 필수 사항
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }

      

   @Override
   public void actionPerformed(ActionEvent e) {
      String key = inputField.getText();
      if (key.trim().length() == 0)       // key가 공백이면(입력하지 않으면) return 하자 = 입력되지 않게 (무시) 
         return;               
      // TODO Auto-generated method stub
      if (e.getSource() == searchBtn) {   // 이벤트가 발생한 객체를 return 해준다.
         /*
          * 입력된 단어를 추출 
          * 그 단어를 Key 값으로 가지는 대응되는 맵 엔트리가 있는지 검사  => dict.get(단어);  
          * 그 단어 대응되는 값이 있으면 JOptionPane.showMessageDialong() 메서드 호출하여 대응되는 값을 보여준다  
          * 대응되는 값이 없으면 = (Null이면) JOptionPane.showMessageDialog() 메서드를 호출하여  '단어를 찾을 수 없습니다'라고 출력해준다.
          * inputField를 빈 문자열로 설정...
          */    
    	  getSearch();
     
         
      } else if (e.getSource() == addBtn) {
         /*
          * 입력된 단어를 추출
          * String value = JOptionPane.showInputDialog() 메서드를 호출하여 추가할 영단어를 입력 받는다.
          * dict.put(입력필드에 입력된 단어 , inputDialog에 입력된 단어);      // 입력된 단어를 저장
          * inputField를 빈 문자열로 설정 ↓
          */
         String value = JOptionPane.showInputDialog(this, key + "에 대응되는 영단어를 입력하세요.");         // 문자열 변수로 입력된 단어를 받는다.
         
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
   
   // db에 저장됨
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
        	   JOptionPane.showMessageDialog(this, value, value + "단어가 추가되었습니다", JOptionPane.INFORMATION_MESSAGE);
           } else {
        	   JOptionPane.showMessageDialog(this, "단어를 추가할 수 없습니다", value, JOptionPane.ERROR_MESSAGE);
           }
       }
       catch (SQLException ex) {
       }
   }
   
   public static void main(String[] args) {
      // 프레임이 있어야 실행됨
      JFrame frame = new JFrame();
      SimpleDictionaryDB dictPanel = new SimpleDictionaryDB();    // SimpleDictionary 객체 생성
      frame.add(dictPanel);
      frame.setTitle("My Korean-English Dictionary DB version");
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.pack();
      frame.setResizable(false);
      
      
   }





}
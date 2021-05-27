package jdbc;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BookListViewer extends JFrame implements ActionListener{
	
	private JTextField idField , titleField, publisherField, yearField, priceField;
	private JButton previousBtn , nextBtn , insertBtn , finishBtn;
    public int count = 1;
	public static void main(String[] args) {
		new BookListViewer();
	}
	
	public BookListViewer() {
		this.setTitle("DBBOOK");
		
		idField = new JTextField(10);
		titleField = new JTextField(10);
		publisherField = new JTextField(10);
		yearField = new JTextField(10);
		priceField = new JTextField(10);
		
		this.setLayout(new GridLayout(0,2));
		
		this.add(new JLabel("ID",JLabel.CENTER));
		this.add(idField);
		
		this.add(new JLabel("Title",JLabel.CENTER));
		this.add(titleField);
		
		this.add(new JLabel("publisher",JLabel.CENTER));
		this.add(publisherField);
		
		this.add(new JLabel("year",JLabel.CENTER));
		this.add(yearField);
		
		this.add(new JLabel("price",JLabel.CENTER));
		this.add(priceField);
		
		previousBtn = new JButton("����");
		previousBtn.addActionListener(this);
		nextBtn = new JButton("����");
		nextBtn.addActionListener(this);
		insertBtn = new JButton("����");
		insertBtn.addActionListener(this);
		finishBtn = new JButton("����");
		finishBtn.addActionListener(this);
		
		this.add(previousBtn);
		this.add(nextBtn);
		this.add(insertBtn);
		this.add(finishBtn);
		
		getBookInfo();
		this.setSize(500,300);
		this.setVisible(true);
	}
	
	private void getBookInfo() {
			   Connection con = null;
		       PreparedStatement pstmt = null;   
		       ResultSet rs = null;
		       try {
		           Class.forName("org.mariadb.jdbc.Driver");
		           
		           con = DriverManager.getConnection(
		               "jdbc:mariadb://eatx.shop:3307/study",
		               "wdj",
		               "wdj123");
		                       
		           pstmt = con.prepareStatement("SELECT * FROM `books` WHERE `book_id` = ?");
		           pstmt.setInt(1, count);
		           rs = pstmt.executeQuery();
		           if(rs.next()) {
		        	   int id = rs.getInt("book_id");
		               String title = rs.getString("title");
		               String publisher = rs.getString("publisher");
		               String year = rs.getString("year");
		               String price = rs.getString("price");
		               
		               idField.setText(String.valueOf(id));
		               titleField.setText(title);
		               publisherField.setText(publisher);
		               yearField.setText(year);
		               priceField.setText(price);
		               
		           } else {            // �����Ǵ� �ܾ ���� ���
		               JOptionPane.showMessageDialog(this, "�����߻�", "����", JOptionPane.ERROR_MESSAGE);
		            }
		       } catch(Exception e) {
		           e.printStackTrace();
		       } finally {
		           try {
		               
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
	
	private void insertBook() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
	           try {
				con = DriverManager.getConnection(
				           "jdbc:mariadb://eatx.shop:3307/study",
				           "wdj",
				           "wdj123");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    try {
			pstmt = con.prepareStatement("INSERT INTO `books`(`title`,`publisher`,`year`,`price`) VALUES (?,?,?,?)");
			pstmt.setString(1, titleField.getText().toString());
			pstmt.setString(2, publisherField.getText().toString());
			pstmt.setString(3, yearField.getText().toString());
			pstmt.setString(4, priceField.getText().toString());
			if(pstmt.executeUpdate() != 0) {
				JOptionPane.showMessageDialog(this, "���ԿϷ�", "����", JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this, "�����߻�", "����", JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == previousBtn) {
			System.out.println("���� ��ư Ŭ����");
			count--;
			getBookInfo();
		} else if(e.getSource() == nextBtn) {
			System.out.println("���� ��ư Ŭ����");
			count++;
			getBookInfo();
		}  else if(e.getSource() == insertBtn) {
			System.out.println("���� ��ư Ŭ����");
			insertBook();
		} else if(e.getSource() == finishBtn) {
			System.out.println("���� ��ư Ŭ����");
			System.exit(0);
		}
	}
}

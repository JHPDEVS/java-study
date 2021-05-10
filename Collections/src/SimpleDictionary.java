import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import java.io.File;

public class SimpleDictionary extends JPanel implements ActionListener{
	
	/*
	 * �ܾ� �Է� ���� �� �ִ� JTextField
	 * �˻� ��ư
	 * �߰� ��ư
	 * �ܾ��� ������ ���� �ڷᱸ���� Map ��ü
	 * 
	 */
	private JTextField inputField = new JTextField(30);
	private JButton searchBtn = new JButton("�˻�");
	private JButton	addBtn = new JButton("�߰�");
	private String dir = null;
	private File file = new File(dir);
	
	// Map ��ü�� �ܾ��� ���� ����Ҳ���,
	// <key ,value> ������ ����. key�� �ѱ� �ܾ�, value�� �����Ǵ� ����ܾ�.
	private Map<String,String> dict = new HashMap<>();
	private JPanel searchAddPanel = new JPanel();
	
	public SimpleDictionary() {
		// Panel�� �⺻ ���̾ƿ��� : FlowLayout
		this.add(inputField);
		this.add(searchBtn);
		this.add(addBtn);
		searchBtn.addActionListener(this);
		addBtn.addActionListener(this);
		this.setPreferredSize(new Dimension(600,50));
		
		// ���Ͽ� key=value ���·� ����� entry���� �о, dict�� ��������.
		
	}
	public static void main(String[] args) {
		JFrame hello = new JFrame("����");
		hello.pack();
		hello.setSize(new Dimension(600,100)); 
		hello.add(new SimpleDictionary());
		hello.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 String key = inputField.getText();
		 if (key.trim().length() == 0) return;
		if(e.getSource() == searchBtn) {
			/*
			 * �Էµ� �ܾ ����
			 * �� �ܾ key ������ ������ �����Ǵ� �� ��Ʈ���� �ִ��� �˻� -> dict.get(�ܾ�);
			 * �� �ܾ �����Ǵ� ���� ������ JOptionPnae.showMessageDialog() �޼��带
			 * ȣ���ؼ� �� ��������� ���� �����ش�.
			 * ������ (null�̸�) JOptionPane.showMessageDialog() �޼��带 ȣ���ؼ�
			 * '�ܾ ã�� �� �����ϴ�'��� ������ش�.
			 * inputField�� �� ���ڿ��� ����.
			 * 			 
			 */

			 System.out.println("["+key+"]");
			 String value = dict.get(key);
			
			 if(value != null) { // �����Ǵ� �ܾ �ִ� ���
				 JOptionPane.showMessageDialog(this, value,key,1);
			 } else { // �����Ǵ� �ܾ ���� ���
				 JOptionPane.showMessageDialog(this, "�����Ǵ� �ܾ �����ϴ�",key,2);
			 }
		}
		if(e.getSource() == addBtn) {
			/*
			 * �Էµ� �ܾ ����
			 * String value = JOptionPane.showInputDialog();
			 * �޼��带 ȣ���ؼ� �߰��� ���� �ܾ �Է¹޴´�.
			 * dict.put(�Է��ʵ忡 �Էµ� �ܾ�, inputDialog�� �Էµ� �ܾ�);
			 */
			String value =JOptionPane.showInputDialog(this, key +"�� �����Ǵ� ����ܾ �Է��ϼ���", "");
			System.out.println(value);
			if(value == null ||value.trim().length() == 0) return;
			dict.put(key, value);
			JOptionPane.showMessageDialog(this, value + "����ܾ �߰��Ǿ����ϴ� ",key,1);
		}
		inputField.setText("");
	}
}

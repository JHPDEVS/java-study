package network;

import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.google.gson.Gson;

import java.io.*;
public class PostJSON {
	public static void main(String[] args) throws Exception {
		String site = "https://jsonplaceholder.typicode.com/posts";
		URL url = new URL(site);
		
		URLConnection con = url.openConnection();
		
		InputStream stream = con.getInputStream();
		InputStreamReader reader = new InputStreamReader(stream,"UTF-8");
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String line = null;
		String jsonString = "";
		while((line=bufferedReader.readLine()) != null) {

			jsonString += line;
		}
//		
		Gson gson = new Gson();
		String json = "[{'userId':1,'id':1,'title':'test','body':'test body'},{'userId':1,'id':1,'title':'test','body':'test body'}]";
		Post[] posts = gson.fromJson(jsonString, Post[].class);

		// ����
		// ����� �Է½�Ʈ������ �޾Ƽ� ���ڿ��� ����.
		// ����� ���ڿ��κ��� �ڹ� ��ü ����
		// �ڹ� ��ü�� �̿��ؼ� �������� ó���Ѥ��� �� �� �ְ���..
		// ���� ��� db �� ������ ���� �ְ�..
		
		for (Post post : posts) {
			System.out.println(post.getUserId());
			System.out.println(post.getId());
			System.out.println(post.getTitle());
			System.out.println(post.getBody());
			System.out.println("###########");
		}
		insertIntoDB(posts);
		
	}
	
	
	private static void insertIntoDB(Post[] posts) throws Exception {
		/*
		 * 1. class.forname(...); // JDBC ����̹� �޸𸮿� ����
		 * 2. CONNECTION CON = DRIVERMANAGER.GETCONNECTION(...);
		 * 3. sTRING SQL = "INSET INTO POSTS(USERiD,TITILE,BODY) VALUES (?,?,?,?);
		 * PreparedStatement pstmt = con.prepareStatement(sql);
		 * 
		 * 4. ? �ڸ��� �� ���� �����Ѵ�.
		 * pstmt.setInt(1, post.getUserId());
		 * pstmt.setInt(2, post.getId());
		 * pstmt.setString(3, post.getTitle());
		 * pstmt.setString(4,post.getBody());
		 * 
		 * 5. ������ �����û
		 * pstmt.executeUpdate();
		 * 
		 * 6. con.close
		 *
		 */
		
		Class.forName("org.mariadb.jdbc.Driver"); // ����ĥ���� ����̹� ������ �޸��忡 ��������� �ϼ���
		String url = "jdbc:mariadb://ckmate.shop:3307/study";
		String id = "wdj";
		String password = "wdj123";
		Connection con = DriverManager.getConnection(url,id,password);
		String sql = "insert into post(userId,id,title,body) values (?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		for (Post post: posts) {
			pstmt.setInt(1, post.getUserId());
			pstmt.setInt(2, post.getId());
			pstmt.setString(3, post.getTitle());
			pstmt.setString(4, post.getBody());
			pstmt.executeUpdate();
		}
		con.close();
		// ����� id�� 5���� ���� �ҷ� �� �����Ͻÿ� 
	}
}

package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLPostTest {

	public static void main(String[] args) throws Exception {
		String site = "http://localhost:4000/hello";
		URL url = new URL(site);
		
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setDoOutput(true);
		con.setDoOutput(true);
		con.setRequestMethod("POST");
		
		con.setRequestProperty("content-type", "application/x-www-form-urlencoded");
		
		// 서버로 값 전송
		String data = "id=test&pw=1111";
		
	//	buffer.append("id=scpark").append("&pw=1111");
		
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(con.getOutputStream(),"UTF-8"));
		writer.println(data);
		writer.flush();
		
		// 서버에서 값 받기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
		
		String line = "";
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}

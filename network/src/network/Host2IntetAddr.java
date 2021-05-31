package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.UnknownHostException;

public class Host2IntetAddr {

	public static void main(String[] args) throws Exception {
		// 1. URL 객체
		URL site = new URL("https://www.naver.com");
		
		// 2. URL 객체로부터 저 사이트로 연결을 시도한다. openConnection();
		
		URLConnection con = site.openConnection();
		
		// 3. InputStream 객체를 통해 네트워크 너머의 프로세스가 보내주는 데이터를 읽는다.
		InputStream stream = con.getInputStream();
		InputStreamReader isreader = new InputStreamReader(stream);
		
		BufferedReader reader = new BufferedReader(isreader);
		
		String line;
		
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		
	}
}

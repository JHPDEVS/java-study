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
		// 1. URL ��ü
		URL site = new URL("https://www.naver.com");
		
		// 2. URL ��ü�κ��� �� ����Ʈ�� ������ �õ��Ѵ�. openConnection();
		
		URLConnection con = site.openConnection();
		
		// 3. InputStream ��ü�� ���� ��Ʈ��ũ �ʸ��� ���μ����� �����ִ� �����͸� �д´�.
		InputStream stream = con.getInputStream();
		InputStreamReader isreader = new InputStreamReader(stream);
		
		BufferedReader reader = new BufferedReader(isreader);
		
		String line;
		
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		
	}
}

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class props {
	
	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		try {
			FileReader reader = new FileReader("dict.props");
			props.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(props.get("���"));
		System.out.println(props.get("���"));
		props.put("���", "ropse");
		FileOutputStream out = new FileOutputStream("dict.props");
		props.store(out, "���� �ѿ�����");
	}
}
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
		System.out.println(props.get("장미"));
		System.out.println(props.get("사과"));
		props.put("장미", "ropse");
		FileOutputStream out = new FileOutputStream("dict.props");
		props.store(out, "나의 한영사전");
	}
}
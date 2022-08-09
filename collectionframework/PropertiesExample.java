package collectionframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	static {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("sample.properties"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		String port  = prop.getProperty("server.port");
		String ip  = prop.getProperty("server.ip");
		System.out.println(port);
		System.out.println(ip);
		
	
	
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
//		prop.setProperty("server.prot", "8282");
//		prop.setProperty("server.ip", "localhost");
		
		
//		prop.store(new FileOutputStream("sample.proporties"),"주석이좀..");
//		System.out.println("파일 저장됨!!!");
		
	}

}

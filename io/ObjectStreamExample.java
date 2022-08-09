package namoo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;

public class ObjectStreamExample {
	
	public static void writeObject() throws IOException {
//		Calendar today = Calendar.getInstance();
		Account account = new Account("1111-2222","김양진",1000);
		FileOutputStream fos = new FileOutputStream("example.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		객체 직렬화 & 스트림
		oos.writeObject(account);
		oos.close();
		System.out.println("파일 저장 완료..");
	}
	
	
	public static void readObject() throws IOException, ClassNotFoundException {
//		Calendar today;
		Account account;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("example6.ser"));
//		객체 직렬화 & 스트림
//		today = (Calendar)ois.readObject();
//		System.out.printf("%$1tF %1$tT",today);
		account = (Account)ois.readObject();
		System.out.println(account.toString());
	}

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObject();
//		readObject();
	}

}

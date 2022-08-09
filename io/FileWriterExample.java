package namoo.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

public class FileWriterExample {
	public static void main(String[] args) throws IOException{
		String path = "example.txt";
		FileWriter fw = new FileWriter(path);
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write("안녕하세요.\r\n");
//		bw.flush();
		
		PrintWriter pw = new PrintWriter(path);
//		PrintWriter pw = new PrintWriter(new File(path));
//		PrintWriter pw = new PrintWriter(fw);
		pw.print(true);
		pw.println("안녕하세요.");
		pw.printf("%1$tF %1$tT", Calendar.getInstance());
		pw.close();
		
	}

}

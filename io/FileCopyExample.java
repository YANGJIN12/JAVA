package namoo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyExample {
	public static void main(String[] args) throws IOException {
		String srcPath = "D:/Lecture/tools/eclipse-inst-jre-win64.exe";
		String destPath = "D:/Lecture/tools/eclipse-inst-jre-win64-1.exe";
		
		File srcFile = new File(srcPath);
		if(srcFile.exists()) {
			InputStream in = new FileInputStream(srcPath);
			OutputStream out = new FileOutputStream(destPath);
			
			byte[] buffer = new byte[4*1024];
			int count = 0;
			while((count=in.read(buffer)) != -1) {
				out.write(buffer, 0, count);
			}
			System.out.println(srcFile.length() + "byte 파일 복사 완료..");
			out.close();
			in.close();			
		}else {
			System.out.println("복사하고자 하는 원본 파일이 존재하지 않습니다..");
		}
		
		
	}

}


	

	
	



package namoo.network;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URLExample2 {

	public static void main(String[] args) {
//		String urlString = "https://www.naver.com/index.html";
		String urlString = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		String savePath = null; 
		InputStream in = null;
		FileOutputStream out = null;
		try {
			URL url = new URL(urlString);
			in = url.openStream();
			String fileName = url.getFile();
			
			int index = fileName.lastIndexOf('/');
			fileName = fileName.substring(index + 1);
			savePath = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + fileName;
//			savePath = "C:\\Users\\Administrator\\Downloads\\20200723055344399.png";
			
			out = new FileOutputStream(savePath);
			byte[] buffer = new byte[1024];
			int count =0;
			while((count = in.read(buffer)) != -1) {
				out.write(buffer, 0, count);
			}
			System.out.println(fileName + " 파일 다운로드 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null)  out.close();
				if(in != null)  in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}

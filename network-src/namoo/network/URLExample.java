package namoo.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLExample {

	public static void main(String[] args) {
//		String urlString = "https://www.naver.com/index.html";
		String urlString = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		BufferedReader br = null;
		try {
			URL url = new URL(urlString);
			InputStream in = url.openStream();
			br = new BufferedReader(new InputStreamReader(in));
			String html = null;
			while((html = br.readLine()) != null) {
				System.out.println(html);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null)  br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}

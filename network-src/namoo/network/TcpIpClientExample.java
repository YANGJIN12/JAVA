package namoo.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpIpClientExample {

	public static void main(String[] args) {
//		String serverIp = "127.0.0.1";
//		String serverIp = "localhost";
		String serverIp = "localhost";
		int serverPort = 2022;
		Socket socket = null;
		try {
			socket = new Socket(serverIp, serverPort);
			System.out.println("서버("+serverIp+")와 연결됨...");
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			out.println("안녕 서버~~~");
//			out.flush();
			
			Scanner scanner = new Scanner(System.in);
			
			String inputMessage = null;
			while((inputMessage = scanner.nextLine()) != null) {
				out.println(inputMessage);
				out.flush();
				
				if(inputMessage.equalsIgnoreCase("quit")) {
					break;
				}
				
				String serverMessage = in.readLine();
				System.out.println("서버에서 수신한 메시지 : " + serverMessage);
			}
			
		} catch (IOException e) {
			System.out.println("서버를 찾을 수 없습니다.");
			
		} finally {
			if(socket != null)
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		

	}

}

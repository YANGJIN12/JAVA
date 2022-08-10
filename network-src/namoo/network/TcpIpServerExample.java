package namoo.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP/IP 기반의 Server Programming
 * 
 * @author 김기정
 */
public class TcpIpServerExample {

	public static void main(String[] args) throws IOException {
		int port = 2022;
		ServerSocket serverSocket = new ServerSocket(port);
//		원격 클라이언트 연결을 수신
		System.out.println("서버 구동됨..");
		while (true) {
			Socket socket = serverSocket.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + " 클라이언트 접속해옴...");
			ServerThread thread = new ServerThread(socket);
			thread.start();
			
		}

	}

}

package namoo.chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * chatclient의 연결 수신 및 응답 처리 서비스
 * @author KimYangJin
 *
 */

public class Chatservice {
	public static final int PORT = 2022;
	private boolean running;
	private ServerSocket serverSocket;
	private Map<String, ChatTread> clients;
	 
	public Chatservice() throws IOException {
		serverSocket = new ServerSocket(PORT);
		running = true;
		clients = new LinkedHashMap<String, ChatTread>();
	}
	
	public void connectListening() throws IOException {
		
		while(running) {
			Socket socket = serverSocket.accept();
			System.out.println("Chatclient ["+socket.getInetAddress().getHostAddress() +"] Connected..");
			ChatTread tread = new ChatTread(socket);
			clients.put("nickName", tread);
			tread.start();
		}
	}
	
	
}

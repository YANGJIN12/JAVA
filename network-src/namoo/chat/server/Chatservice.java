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
	//	접속자 리스트에 접속 클라이언트 추가
	public void addClient(String nickName, ChatThread thread) {
		clients.put(nickName, thread);
	}
	//	접속자 리스트에서 클라이언트 제거
	public void removeClient(String nickName) {
		clients.remove(nickName);
	}
	//	모든 접속자에게 메시지를 전송
	public void sendAllMessage(String message) {
		Collection<ChatThread> list = clients.values();	
		Iterator<ChatThread> iter = list.iterator();
		while (iter.hasNext()) {
			ChatThread chatThread = (ChatThread) iter.next();
			chatThread.sendMessage(message);
		}
	}
	//	접속자 닉네임리스트 반환
	public String getNickNameList(){
		Set<String> keys = clients.keySet();
		if(keys.isEmpty()) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String nickName = iter.next();
			sb.append(nickName).append(",");
			
		}
		return sb.toString();		
	} 
}

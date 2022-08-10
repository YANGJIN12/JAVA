package namoo.chat.server;

/**
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatTread extends Thread {
	
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public ChatTread(Socket socket) throws IOException {
		this.socket = socket;
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream());
	}
	
	public void messageProcess() throws IOException {
		String message = null;
		while((message = in.readLine()) != null) {
			System.out.println("Client Send Message : " + message);
			
			if(message.equalsIgnoreCase("quit")) {
				break;
			}			
			//연결한 모든 채팅클라이언트에게 메세지 전송
			sendMessage(message);
		}
	}
	
	public void sendMessage(String message) {
		out.println(message);
		out.flush();
		
	}
	
	@Override
	public void run() {
		try {
			messageProcess();
		} catch (IOException e) {
			e.printStackTrace();
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

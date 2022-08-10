package namoo.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {
	
	private Socket socket;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	
	public void echo() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		String clientMessage = null;
		while((clientMessage=in.readLine()) != null) {
			System.out.println("클라이언트 전송 메시지: " + clientMessage);
			
			if(clientMessage.equalsIgnoreCase("quit")) {
				break;
			}			
			//클라이언트에게 에코(Echo)
			out.println(clientMessage);
			out.flush();
		}
	}
	
	@Override
	public void run() {
		try {
			echo();
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

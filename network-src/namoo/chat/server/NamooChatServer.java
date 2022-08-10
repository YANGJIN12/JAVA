package namoo.chat.server;

import java.io.IOException;

public class NamooChatServer {

	public static void main(String[] args) {
		try {
			Chatservice chatservice = new Chatservice();
			System.out.println("==== ChatServer("+Chatservice.PORT+") Start ====");
			chatservice.connectListening();
		} catch (IOException e) {
			System.err.println("포트("+Chatservice.PORT+")충돌로 서버를 구동할 수 없습니다.!");
		}

	}

}

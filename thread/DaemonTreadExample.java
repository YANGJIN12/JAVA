package namoo.thread;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class DaemonTreadExample {
	
	static class SaveFileThread extends Thread{

		@Override
		public void run() {
			String message = "데몬클래스 예제";
			String path = "example.txt";
			try {
				FileOutputStream fos = new FileOutputStream(path,true);
				PrintWriter out = new PrintWriter(fos,true);//auto flush();
				while(true) {
					out.print(message);
//					out.flush();
					System.out.println("데몬스레드 파일 자동 저장 >>");
					Thread.sleep(5000);
					out.close();
				}
			} catch (FileNotFoundException | InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("--- Main Tread Start ---");
		SaveFileThread daemonThread = new SaveFileThread();
		daemonThread.setDaemon(true);
		daemonThread.start();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--- Main Tread End ---");
	}

}

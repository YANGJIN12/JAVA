package namoo.thread;

import java.util.Random;

public class Car extends Thread {
	private int count;
	
	public Car(String name) {
		super(name);	
	}

	@Override	
	public void run() {
		System.out.println("--- "+getName()+"자동차 경주 Start ---");
		for (int i = 1; i <= 100; i++) {
			System.out.println(getName()+"자동차"+i+"미터 전진>>");
			try {
				int sleepTime = (int)Math.random()*500;
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("--- "+getName()+"자동차 경주 Finish ---");
		
	}
	
	 
	

}

package namoo.thread;

public class HelloThread extends Thread {
	private int count;
	
	public HelloThread(String name, int count) {
		super(name);
		this.count = count;
		
	}

	@Override
	/** 사용자 스레스의 Entry Point 역할 메소드 */
	
	public void run() {
		System.out.println("--- "+getName()+"사용자 스레드 Start ---");
		for (int i = 0; i < count; i++) {
			System.out.println(getName()+" : "+i);
//			try {
////				Thread.sleep(500);
//				
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			Thread.yield();
		}
		System.out.println("--- "+getName()+"사용자 스레드 End ---");
		
	}
	
	 
	

}


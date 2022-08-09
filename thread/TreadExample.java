package namoo.thread;

public class TreadExample {
	public static void main(String[] args) {
		System.out.println("---Main Tread Start---");
		Thread mainThread = Thread.currentThread();
		
		
		System.out.println("Main Tread Task 1");
		System.out.println("Main Tread Task 2");
//		Main Tread와 별개로 동작하는 스레드 생성 및 실행
		HelloThread thread = new HelloThread("양진",10);
		thread.setPriority(Thread.MIN_PRIORITY);
//		thread.run();
		thread.start();
		
		
		HelloThread thread2 = new HelloThread("양따",10);
		thread.setPriority(Thread.NORM_PRIORITY);
//		thread.run();
		thread2.start();
		
		
		HelloThread2 thread3 = new HelloThread2(10);
		Thread t = new Thread(thread3,"예준");
		t.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		thread2.start();
		t.start();
		
		
		
		
		
		System.out.println("---Main Tread End---");
	}

}

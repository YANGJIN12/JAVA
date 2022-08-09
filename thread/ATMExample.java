package namoo.thread;

public class ATMExample {

	static ATM atm = new ATM();

	public static void example1() {
		new Thread() {
			@Override
			public void run() {
				try {
					while (true) {
						synchronized (atm.account) {
//							waitingset에 대기하고 있는 딸 스레드를 먼저 깨움
							atm.account.notify();
							atm.withdrawMoney("1111-2222", 1111, 10000, "아빠");
							atm.account.wait();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}.start();

		new Thread() {
			@Override
			public void run() {
				try {
					while (true) {
						synchronized (atm.account) {
							atm.account.notify();//notifyAll();
							atm.withdrawMoney("1111-2222", 1111, 10000, "아들");
							atm.account.wait();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}.start();
	}

	public static void main(String[] args) {
		example1();

	}

}

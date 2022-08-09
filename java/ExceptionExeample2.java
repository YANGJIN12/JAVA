package namoo.java;

public class ExceptionExeample2 {

	public static void main(String[] args) {
		Account account = new Account("1111","김양진",1111,1000);
		try {
			long money = account.deposit(1000);
//			money = account.deposit(0);
			System.out.println("입금 후 잔액:"+ money);
			money = account.withdraw(500);
			System.out.println("출금 후 잔액:"+ money);
//			account.withdraw(0);
			account.withdraw(3000);
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}

	}

}
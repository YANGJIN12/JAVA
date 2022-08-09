package namoo.java;

public class ExceptionExeample3 {

	public static void main(String[] args) throws InvalidException {
		Account account = new Account("1111","김양진",1111,1000);
			long money = account.deposit(1000);
//			money = account.deposit(0);
			System.out.println("입금 후 잔액:"+ money);
			money = account.withdraw(500);
			System.out.println("출금 후 잔액:"+ money);
//			account.withdraw(0);
			account.withdraw(3000);
		
			

	}

}
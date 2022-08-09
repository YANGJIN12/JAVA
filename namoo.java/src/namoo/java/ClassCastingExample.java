package namoo.java;

public class ClassCastingExample {
	public static void main(String[] args) {
		Account account = new Account();
		
//		업 캐스팅(자동 형변환)
		Account account2 = new MinusAccount("9999-9999","마이너스",1111,100000,1000000);
//		재정의된 메소드는 호출 가능
		System.out.println(account.getRestMoney());
//		새롭게 추가된 속성이나 메소드는 호출 불가능
//		account2.gerBorrowMoney();
//		새롭게 추가된 속성이나 메소드를 호출하기 위해 Down Cassting 필요
		MinusAccount ma = (MinusAccount)account;
		System.out.println(ma.getBorrowMoney());

		
// 		instanceof 
		if(account2 instanceof MinusAccount) {
			MinusAccount ma2 = (MinusAccount)account2;
			System.out.println(ma);
		}
	}

}

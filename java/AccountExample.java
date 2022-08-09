package namoo.java;

import java.util.Date;

/**
 * 
 * @author Administrator
 *어플리케이션 실행을 위한 어플리케이션 클래스 정의
 */

public class AccountExample {
	
// 	Call by Value
	public static void triple(int num) {
		System.out.println(num *3);
	}
	
//	Call by Reference	
	public static void triple(Account account) {
		long money = account.getRestMoney();
		try {
		account.deposit(money *3);
		}catch(InvalidException e){
			System.out.println(e.getMessage());
		}
		System.out.println(account.getRestMoney());
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws InvalidException {
//클래스로부터 인스턴스 생성
//		레퍼런스 변수 선언
		Account account;
//		인스턴스 생성자 호출을 이용한 인스턴스 생성
		account = new Account("1111-2222","김양진",1111,0);
		account.getSerialNum();
		System.out.println(account.getSerialNum());
		System.out.println(account.getAccountNum());
		System.out.println(account.getAccountOwner());
		System.out.println(account.getPasswd());

		
//		비밀번호 체크		
		if(account.checkPasswd(1111)){
			
//		입금 테스트
			long restMoney;
			try {
				restMoney = account.deposit(100000000);
			} catch (InvalidException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				restMoney = account.deposit(0);
				if(restMoney > 0) {
					System.out.println("입금 후 현재 잔액 :"+restMoney);
					
				}else {
					System.out.println("똑바로 입력하십시오.");
				}
				
			} catch (InvalidException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
//		출금 테스트
			
			
			
			try {
				restMoney = account.withdraw(100000000);
				System.out.println("출금 후 현재 잔액"+restMoney);
			} catch (InvalidException e) {
				System.out.println(e.getMessage());
			
			}
			}else {
			System.out.println("비밀번호를 확인해주세요.");
			}
		

		
		
//		비번체크 
		
		
		
		Account account2 = new Account("1111-333","오준화",1234,1000);
		System.out.println(account.getSerialNum());
		
//		account.accountNum;
//		static 변수는 클래스이름.변수명 접근을 권장
		System.out.println(Account.bankName);
		System.out.println(account.bankName);
		
		
		
		Account account3 = account; // pass by Reference
		System.out.println("잔액: "+account3.deposit(100000000));
		System.out.println("잔액: "+account3.getRestMoney());
		
// 		Call by Test
		int num = 10;
		triple(num);
		System.out.println(num);
		
		System.out.println(account.getRestMoney());
		triple(account);
		System.out.println(account.getRestMoney());
		
		
		java.util.Date today = new java.util.Date();
		System.out.println(today.toLocaleString());
		
		Date det = new Date();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

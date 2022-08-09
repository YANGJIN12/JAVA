package namoo.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class AMS2 {
		public static void main(String[] args) {
			Inventory inventory = new Inventory();
//			신규 계좌 등록 테스트
			inventory.open(new Account("1111-1111","김양진",1111,100000000));
			inventory.open(new MinusAccount("1111-1111","오준화",1111,1000,10000000));
			inventory.open(new Account("1111-1111","변준호",1111,10000));
			inventory.open(new MinusAccount("1111-1111","차호녕",1111,100000,10000000));
			
//			전체 목록 조회
			Collection<Account> list = inventory.getAccounts();
			for (Account account : list) {
				if(account != null) {
//					System.out.println(account.getAccountNum()+"\t"+account.getAccountOwner()+"\t"+"*****"+"\t"+account.getRestMoney());
//					System.out.println(account.toString());
					System.out.println(account);//자동 호출 toString()을 생략하면 자동호출됨.
				
				}
			}
				System.out.println("=============================");
//	 		계좌번호로 검색
				Account findAccount = new Account();
				if(findAccount !=null) {
					System.out.println("findAccount");
				}else {
					System.out.println("검색된 계좌가 존재하지 않습니다.");
				}
			
		}

	}


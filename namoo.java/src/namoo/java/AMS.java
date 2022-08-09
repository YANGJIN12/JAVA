package namoo.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AMS {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
//		신규 계좌 등록 테스트
		inventory.open(new Account("1111-1111","김양진",1111,100000000));
		inventory.open(new MinusAccount("1111-1111","오준화",1111,1000,10000000));
		inventory.open(new Account("1111-1111","변준호",1111,10000));
		inventory.open(new MinusAccount("1111-1111","차호녕",1111,100000,10000000));
		
//		전체 목록 조회
		Collection<Account> accountlist = Account.values();
		Iterator<Account> iter = accountlist.iterator();
		while(iter.hasNext()) {
			Account account = iter.next();
			System.out.println(account);
		}
		System.out.println("=============================");
		
		

		
// 		계좌번호로 검색
			Account findAccount = inventory.find("1234-1234");
			if(findAccount !=null) {
				System.out.println("findAccount");
			}else {
				System.out.println("검색된 계좌가 존재하지 않습니다.");
			}
		
//			
//// 		계좌번호 삭제
//			Account removeAccount = inventory.remove("1111-2222");
//			System.out.println(removeAccount.getAccountNum()+"계좌가 삭제 되었습니다.");
//	
	
//		예금주명으로 검색
			List<Account> sl = inventory.search("김양진");
			if(sl.isEmpty())System.out.println("해당 계좌가 존재하지 않습니다.");
			else System.out.println(sl);
			
	
	}
	
	

}

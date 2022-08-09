package namoo.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 은행 계좌 목록관리
 * @author KimYangJin
 * 
 */
public class Inventory {
	public static void main(String[] args) {
		
	}
		
	private Map<String, Account> accounts;
	private Collection<Account> list;

	public Inventory() {
		this.accounts = new LinkedHashMap<String, Account>();
		
	}
	/**
	 * 전제 계좌 목록 반환
	 * @return 저장된 전체 계좌
	 */
	public  Collection<Account> getAccounts() {
		return accounts.values();
		

	}

	public int getCount() {
		return accounts.size();
	}
	/**
	 * 신규 계좌 등록 
	 * @param account 신규 계좌
	 */
	public void open(Account account) {
		 accounts.put(account.getAccountNum(), account);
	}
	
	/**
	 * 계좌명으로 계좌 검색
	 * @param accountNum 계좌 번호
	 * @return 검색된 계좌
	 */
	public Account find(String accountNum) {
		return accounts.get(accountNum);
	}
		
		
//	삭제
	public Account remove(String accountNum) {
		return accounts.remove(accountNum);
	}
		
		
	
	/**
	 * 예금주명으로 검색
	 * @param accountOwner 예금주명
	 * @return 검색된 계좌목록
	 */
	public List<Account> search(String accountOwner) {
		List<Account> serchList = new ArrayList<>();
		Collection<Account> values = accounts.values();
		Iterator<Account> iter = list.iterator();
		while(iter.hasNext()) {
			Account account = iter.next();
			if(account.getAccountOwner().equals(accountOwner));
				serchList.add(account);
			
		}
		return serchList;
		

	
	
	}
	
}
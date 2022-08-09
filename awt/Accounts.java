package namoo.awt;

public enum Accounts {
	
	ALL("전체"),ACCOUNT("입출금계좌"),MINUSACCOUNT("마이너스계좌");

	String name;
	Accounts(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	
	
}



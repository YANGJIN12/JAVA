package namoo.standardapi;

public class ObejectExample {
	public static void main(String[] args) {
		Object object = new Object();
		Object object2 = new Object();
		System.out.println(object.toString());
		System.out.println(object.equals(object2));
		System.out.println(object == object2);
		
		String name = "김양진";
		String name2 = "김양진";
		System.out.println(name.equals(name2));
		System.out.println(name == name);
		
		Account account = new Account("1111","김양진",1111,1000);
		Account account2 = new Account("1111","김양진",1111,1000);
		System.out.println(account.equals(object2));
		
				
//		얇은 복사		
		Account a = new Account();
		Account b = a;
		
//		깊은 복사
		try {
			Account account3 =  (Account)account.clone();
			System.out.println(account3.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			
		}
		
	}

}

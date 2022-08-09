package namoo.standardapi;

/**
 * 정규표현식을 활용한 유효성 검증 공통클래스
 * 
 * @author user
 */
public class Validator {
	/** 입력필드 입력여부 반환 */
	public static boolean isEmpty(String value) {
		if (value == null || value.trim().length() == 0) {
			return true;
		}
		return false;
	}

	/** 이메일 유효성 검증 */
	public static boolean validateEmail(String email) {
		return email.matches("[a-zA-Z0-9._+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9.]+");
	}
	
	public static void main(String[] args) {
		System.out.println(Validator.isEmpty("  "));
		System.out.println(Validator.validateEmail("bangry313@aa.com"));
		System.out.println(Validator.validateEmail("bangry313@com"));
	}
}

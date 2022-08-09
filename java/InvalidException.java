package namoo.java;

public class InvalidException extends Exception{
// String message;
// 필요에 따라 속성 추가
// int code;
	public InvalidException() {
		this("예기치 않은 에러가 발생했습니다. 관리자(qaws8134@naver.com)에게 문의 바랍니다.");
	}
		
	public InvalidException(String message) {
		super(message);
		
	}
	

}

package namoo.java;

public class Foo {
	
//	public void doTask() {
//		String message = null;
//		char c = message.charAt(0);
//		System.out.println(c);


		
		
//		public void doTask2() {
//				try {
////				String message = null;
////				char c = message.charAt(0);
////				System.out.println(c);
//				System.out.println(10/0);
//				}catch(NullPointerException exception) {
//					System.out.println("생성되지 않은 객체의 메소드는 호출할 수 없습니다.");
//				}catch(ArithmeticException e) {
//					System.out.println("숫자는 0으로 나눌수 없습니다.");
//					
//				}

			
		
		
		
//		System.out.println(10/0); ArithmeticException
//		int[] array = {1,2,3,4,5};
//		System.out.println(array[0]); 
//		System.out.println(array[1]); 
//		System.out.println(array[2]); 
//		System.out.println(array[5]); ArrayIndexOutOfBoundsException
		
		
//		public void doTask3() {
//			try { 
////			String message = null;
////			char c = message.charAt(0);
////			System.out.println(c);
//			System.out.println(10/0);
//			}catch(NullPointerException | ArithmeticException e) {
//				if(e instanceof NullPointerException ) {
//					System.out.println("생성되지 않은 객체의 메소드는 호출할 수 없습니다.");
//					
//				}else if(e instanceof ArithmeticException) {
//					System.out.println("숫자는 0으로 나눌수 없습니다.");
//					
//				}
//			}}	
					
				
			

		
//			public void doTask4() {
//				try { 
////				String message = null;
////				char c = message.charAt(0);
////				System.out.println(c);
//				System.out.println(10/0);
//				}catch(Exception e) {
//					if(e instanceof NullPointerException ) {
//						System.out.println("생성되지 않은 객체의 메소드는 호출할 수 없습니다.");
//						
//					}else if(e instanceof ArithmeticException) {
//						System.out.println("숫자는 0으로 나눌수 없습니다.");
//						
//						
//					}
//				}
			
				
			public void doTask5() {
				try {
				String message = null;
				char c = message.charAt(0);
				System.out.println(c);
				}catch(NullPointerException exception) {
					System.out.println("생성되지 않은 객체의 메소드는 호출할 수 없습니다.");
				}catch(ArithmeticException e) {
					System.out.println("숫자는 0으로 나눌수 없습니다.");
				}finally{
					System.out.println("꼭 실행되어야하는 중요한 코드 로직");
					 
				}
				
				
				
				
				
				
				
				
	}
	
		
		
	}


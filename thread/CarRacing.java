package namoo.thread;

public class CarRacing {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("---지금부터 자동차 경주를 시작하겠습니다!!---");
		System.out.println("자동차 출발 준비");
		Car car1 = new Car("Mustang");
		Car car2 = new Car("BMW");
		Car car3 = new Car("VENZ");
		Car car4 = new Car("TICO");
		Car car5 = new Car("PORSHE");
		Car car6 = new Car("PERARI");
		System.out.println("준비! 삐~삐~삐!");
		
		car1.start();
		car2.start();
		car3.start();
		car4.start();
		car5.start();
		car6.start();
		
		
		car1.join();
		car2.join();
		car3.join();
		car4.join();
		car5.join();
		car6.join();
		
		System.out.println("--- 자동차 경주 종료 ---");
	}

}

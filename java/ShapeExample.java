package namoo.java;

public class ShapeExample {
	public static void main(String[] args) {
//		Shape shape = new Shape();
		Circle circle = new Circle(10,20,30);
		System.out.println("원의 둘래"+circle.getLength());
		System.out.println("원의 면적"+circle.getArea());
		
//		추상클래스는 객체 생성이 되진 않지만, 타입 선언으론 가능함(Up casting)
		Shape shape = new Circle(10,20,30);
		System.out.println("원의 둘래"+shape.getLength());
		System.out.println("원의 면적"+shape.getArea());
		
		
		shape = new Rectangle(10,10,20,20);
		System.out.println("사각형의 둘래"+shape.getLength());
		System.out.println("사각형의 면적"+shape.getArea());
	
	
	
	}
	

}

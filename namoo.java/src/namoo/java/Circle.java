package namoo.java;

public class Circle extends Shape{
	private double redian;

	public Circle() {
		this(0.0,0.0,0.0);
	}

	public Circle(double x,double y,double redian) {
		this.x = x;
		this.y = y;
		this.redian = redian;
	}
//	setter/getter 생략

	@Override
	public void draw() {
		System.out.println("원("+x+","+y+","+redian+")을 그립니다.");
		
	}

	@Override
	public double getLength() {
		return 2* Math.PI * redian;
		
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(redian,2);
	}
	
	
	
	

}

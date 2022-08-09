package namoo.java;

public class Rectangle extends Shape {
	private double width,height;
	

	
	

	public Rectangle() {
		this(0.0,0.0,0.0,0.0);
	}
	
	public Rectangle(double x,double y,double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

//	setter/getter 생략


	@Override
	public void draw() {
		System.out.println("사각형("+x+", "+y+", "+width+","+height+")을 그립니다..");
	}

	@Override
	public double getLength() {
		return 2*(width + height);
	}

	@Override
	public double getArea() {
		return width * height;
	}

}

package namoo.java;

import java.util.Iterator;

public class EunmExample {
	
	public static void move(Directions directions) {
		switch (directions) {
		case NORTH: System.out.println("북>>>"); break;
		case SOUTH: System.out.println("남>>>"); break;
		case WEST:  System.out.println("동>>>"); break;
		case EAST:  System.out.println("서>>>"); break;
		
		
		}
	}
	
	public static void main(String[] args) {
		move(Directions.NORTH);
		
		Directions[] list = Directions.values();
		for(Directions direction : list) {
			System.out.println(direction.getName());
		}
	
		String direct = "north";
		Directions d = Directions.valueOf(direct.toUpperCase());
		System.out.println(d);
	
	}

}

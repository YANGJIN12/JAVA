package namoo.java;

public enum Directions {
	
	NORTH("북쪽"),EAST("동쪽"),WEST("서쪽"),SOUTH("남쪽");

	String name;
	Directions(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	
	
}

	
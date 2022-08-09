package collectionframework;


import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
//		List<String> vector = new Vector<String>();
		Vector<String> vector = new Vector<String>();
		vector.addElement("C");
		vector.addElement("Java");
		vector.addElement("HTML");
		vector.addElement("CSS");
		System.out.println(vector.elementAt(0));
		vector.removeElement("HTML");
		System.out.println(vector.size());
		
		
		Enumeration<String> e = vector.elements();
		while(e.hasMoreElements()) {
			String string = e.nextElement();
			System.out.println(string);
			
		}
		

		
		
	
			
		} 
}


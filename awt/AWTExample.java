package namoo.awt;

import java.awt.Button;
import java.awt.Frame;

public class AWTExample {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(400,200);
		frame.setVisible(true);
		
		Button button = new Button("버튼");
		frame.add(button);
		
		
		

	}

}

package namoo.awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIApplication {

	public static void main(String[] args) {
		Frame frame = new Frame("연습용 프레임");
//		SomePanel panel = new SomePanel();
//		SomePanel2 panel = new SomePanel2();
//		GridBagLayoutPanel panel = new GridBagLayoutPanel();
		EventPanel panel = new EventPanel();
		panel.init();
		panel.eventRegist();
		frame.add(panel);
		frame.setSize(600,400);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		
		});
	
		
		

	}

}
